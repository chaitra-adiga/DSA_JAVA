import javax.swing.*; // Importing Swing library for GUI components
/*buttons, text fields, labels, menus, and more, which can be used to build interactive and visually appealing applications
  highly customizable and can be easily arranged within containers like frames, panels, and dialogs.*/
import java.awt.event.*; // Importing AWT (Abstract Window Toolkit) event library for event handling
/*includes classes like ActionEvent, ActionListener, KeyEvent, MouseListener, etc.,
 which are used to handle user interactions such as button clicks, key presses, mouse events, */
import java.awt.*; // Importing AWT library for graphics and user interface components
/*It includes classes for components like frames, panels, buttons, labels, etc., as well as classes for
handling graphics, fonts, colors, and layout management.*/
import java.util.Random; // Importing Java's built-in Random class for generating random numbers

public class main extends JPanel implements ActionListener { // Defining a class named GamePanel which extends JPanel and implements ActionListener

    static final int SCREEN_WIDTH=600; // Setting the width of the game screen
    static final int SCREEN_HEIGHT=600; // Setting the height of the game screen
    static final int UNIT_SIZE=25; // Setting the size of each unit in the game grid
    static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE; // Calculating the number of game units
    static final int DELAY=75; // Setting the delay (in milliseconds) for the game timer

    // Declaring arrays to hold x and y coordinates of the snake body parts
    final int[] x= new int[GAME_UNITS];
    final int[] y= new int[GAME_UNITS];

    int bodyParts=6; // Initializing the number of snake body parts
    int applesEaten; // Variable to store the number of apples eaten by the snake
    int appleX; // Variable to store the x-coordinate of the apple
    int appleY; // Variable to store the y-coordinate of the apple
    char direction = 'R'; // Variable to store the direction of the snake (initially right)
    boolean running = false; // Variable to track if the game is running or not
    Timer timer; // Timer object for controlling the game loop
    Random random; // Random object for generating random numbers

    @Override
    public void actionPerformed(ActionEvent e) { // ActionListener method to handle game events
        if(running){ // If the game is running
            move(); // Move the snake
            checkApple(); // Check if the snake eats an apple
            checkCollisions(); // Check if the snake collides with itself or the borders
        }
        repaint(); // Repaint the game panel/*Each time repaint() is called, Swing schedules a call to the paintComponent
        // (Graphics g) method of the GamePanel class, which is responsible for rendering the graphics of the game.
        // This ensures that the game screen is updated regularly, providing smooth animation and
        // a responsive user interface.
        // used to trigger the repainting of the game panel, which updates the visual representation of the game on the
        // screen*/
    }

    main(){ // Constructor for the GamePanel class
        random = new Random(); // Initialize the Random object
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT)); // Set the preferred size of the panel
        this.setBackground(Color.BLACK); // Set the background color of the panel
        this.setFocusable(true); // Set the panel to be focusable/* enable the GamePanel to receive keyboard
        // focus, allowing it to listen for keyboard events such as key presses.*/
        this.addKeyListener(new MyKeyAdapter()); // Add a key listener to the panel
        startGame(); // Start the game
    }

    public void startGame(){ // Method to start the game
        newApple(); // Generate a new apple
        running=true; // Set the game to running state
        timer=new Timer(DELAY,this); // Create a new timer for the game loop
        timer.start(); // Start the timer
    }

    public void paintComponent(Graphics g ){ // Override the paintComponent method to paint graphics on the panel
        super.paintComponent(g); // Call the superclass method
        draw(g); // Call the draw method to draw the game elements
    }

    public void draw(Graphics g){ // Method to draw the game elements
        // If the game is running
        if(running) {
            // Draw the grid lines
            for (int i = 0; i < SCREEN_WIDTH / UNIT_SIZE; i++) {
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }
            g.setColor(Color.red); // Set the color to red
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE); // Draw the apple

            // Drawing the snake - head & body
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) { // If it's the head
                    g.setColor(Color.yellow); // Set the color to yellow
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Draw the head
                } else { // If it's a body part
                    g.setColor(new Color(229, 202, 22)); // Set the color to a shade of yellow
                    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))); // Set a random color
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Draw the body part
                }
                g.setColor(Color.red); // Set the color to red
                g.setFont(new Font("Ink Free",Font.BOLD,40)); // Set the font
                FontMetrics metrics= getFontMetrics(g.getFont()); // Get font metrics
                g.drawString("Score : "+applesEaten,(SCREEN_WIDTH - metrics.stringWidth("Score : "+applesEaten))/2,g.getFont().getSize()); // Draw the score
            }
        }
        else{ // If the game is over
            gameOver(g); // Display game over message
        }
    }

    public void newApple(){ // Method to generate a new apple
        appleX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE; // Generate random x-coordinate
        appleY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE; // Generate random y-coordinate
    }

    public void move(){ // Method to move the snake
        for (int i = bodyParts; i >0; i--) { // Iterate over the snake body parts
            x[i]=x[i-1]; // Update x-coordinate
            y[i]=y[i-1]; // Update y-coordinate
        }
        // Move the head of the snake based on the direction
        switch (direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkCollisions(){ // Method to check for collisions
        // Check if the snake hits itself
        for (int i = bodyParts; i >0; i--) {
            if((x[0]==x[i]) && (y[0]==y[i])){
                running = false; // Set running to false if collision occurs
            }
        }

        // Check if the snake hits the screen borders
        if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
            running = false; // Set running to false if collision occurs
        }

        if(!running){ // If game over
            timer.stop(); // Stop the timer
        }
    }

    public void checkApple(){ // Method to check if the snake eats an apple
        if((x[0] == appleX) && (y[0] == appleY)){
            bodyParts++; // Increment body parts
            applesEaten++; // Increment apples eaten
            newApple(); // Generate new apple
        }
    }

    public void gameOver(Graphics g){ // Method to display game over message
        // Draw game over message
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics1= getFontMetrics(g.getFont());
        g.drawString("Game Over !",(SCREEN_WIDTH - metrics1.stringWidth("Game Over !"))/2,SCREEN_HEIGHT/2);

        // Display score at game over
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics2= getFontMetrics(g.getFont());
        g.drawString("Score : "+applesEaten,(SCREEN_WIDTH - metrics2.stringWidth("Score : "+applesEaten))/2,g.getFont().getSize());

    }

    public class MyKeyAdapter extends KeyAdapter { // Inner class for key adapter
        @Override
        public void keyPressed(KeyEvent e) { // Method to handle key presses
            switch (e.getKeyCode()){ // Switch based on the pressed key code
                case KeyEvent.VK_LEFT: // If left arrow key pressed
                    if(direction != 'R'){ // If not already moving right
                        direction = 'L'; // Change direction to left
                    }
                    break;
                case KeyEvent.VK_RIGHT: // If right arrow key pressed
                    if(direction != 'L'){ // If not already moving left
                        direction = 'R'; // Change direction to right
                    }
                    break;
                case KeyEvent.VK_UP: // If up arrow key pressed
                    if(direction != 'D'){ // If not already moving down
                        direction = 'U'; // Change direction to up
                    }
                    break;
                case KeyEvent.VK_DOWN: // If down arrow key pressed
                    if(direction != 'U'){ // If not already moving up
                        direction = 'D'; // Change direction to down
                    }
                    break;
            }
        }
    }
}

