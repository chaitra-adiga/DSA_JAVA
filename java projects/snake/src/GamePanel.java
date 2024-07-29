import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH=600;
    static final int SCREEN_HEIGHT=600;
    static final int UNIT_SIZE=25;
    static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY=140;
    //to hold x and y co-ordinates of snake , including head
    final int[] x= new int[GAME_UNITS];
    final int[] y= new int[GAME_UNITS];
    int bodyParts=6; //initial body parts
    int applesEaten;
    int appleX; //x co-ordinate of apple which comes randomly
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    @Override
    public void actionPerformed(ActionEvent e) {
        //to see body of snake we'll call move function
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();

    }
    GamePanel(){
        //constructor
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame(){
        newApple();
        running=true;
        timer=new Timer(DELAY,this);
        timer.start();

    }

    public void paintComponent(Graphics g ){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        if(running) {
            for (int i = 0; i < SCREEN_WIDTH / UNIT_SIZE; i++) {
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }
            g.setColor(Color.red);
            g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            //drawing snake - head & body
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.yellow);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(201, 179, 10));
                    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

                }
                g.setColor(Color.red);
                g.setFont(new Font("Ink Free",Font.BOLD,40));
                FontMetrics metrics= getFontMetrics(g.getFont());
                g.drawString("Score : "+applesEaten,(SCREEN_WIDTH - metrics.stringWidth("Score : "+applesEaten))/2,g.getFont().getSize());

            }
        }
        else{
            gameOver(g);
        }
    }

    public void newApple(){
//        //generate coordinates of new apple
//        appleX= random.nextInt((int)(random.nextInt(SCREEN_WIDTH/UNIT_SIZE)))*UNIT_SIZE;
//        appleY= random.nextInt((int)(random.nextInt(SCREEN_HEIGHT/UNIT_SIZE)))*UNIT_SIZE;

            // Generate random coordinates of new apple within the screen bounds
            appleX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
            appleY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }

    public void move(){
        for (int i = bodyParts; i >0; i--) {
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
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


    public void checkCollisions(){
        //checks if snake head collides with body
        for (int i = bodyParts; i >0; i--) {
            if((x[0]==x[i]) && (y[0]==y[i])){
                //stop game - gameover
                running = false;
            }
        }

 /*       //checks if snake head collides with left border
        if(x[0]<0){
            running= false;
        }

        //checks if snake head collides with right border
        if(x[0]>SCREEN_WIDTH){
            running= false;
        }

        //checks if snake head collides with top border
        if(y[0]<0){
            running= false;
        }
        //checks if snake head collides with bottom border
        if(y[0]<SCREEN_HEIGHT){
            running= false;
        }*/

        // Check collision with borders -- chat gpt
        if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
            running = false; // Game over if snake hits a border
        }
        //stop timer
        if(!running){
            //running false
            timer.stop();
        }
    }
    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY)){
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    public void gameOver(Graphics g){
//setup game over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics1= getFontMetrics(g.getFont());
        g.drawString("Game Over !",(SCREEN_WIDTH - metrics1.stringWidth("Game Over !"))/2,SCREEN_HEIGHT/2);

        //displaying score at game over
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics2= getFontMetrics(g.getFont());
        g.drawString("Score : "+applesEaten,(SCREEN_WIDTH - metrics2.stringWidth("Score : "+applesEaten))/2,g.getFont().getSize());

    }

    public class MyKeyAdapter extends KeyAdapter {
        //to control snake movements

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    //limit user by 90 degree turn
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    //limit user by 90 degree turn
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    //limit user by 90 degree turn
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    //limit user by 90 degree turn
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
            }

        }

    }
}
