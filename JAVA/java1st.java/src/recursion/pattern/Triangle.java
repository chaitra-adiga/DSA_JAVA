package recursion.pattern;

public class Triangle {
    public static void main(String[] args) {
        int n=4;
        //printstars(n,n);
        print_triangle2(n,0);
    }

    //my approach
     static void printstars( int row, int col) {
        if(row==0||col==0){
            return;
        }
         for (int i = 0; i < col; i++) {
             System.out.print(" + ");
         }
         System.out.println();
         printstars(row-1,col-1);
    }

    //kunals approach
    public static void print_triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            print_triangle(r,c+1);
        }else {
            System.out.println();
            print_triangle(r-1,0);
        }
    }

    public static void print_triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            print_triangle2(r,c+1);
            System.out.print("*");
        }else {
            print_triangle2(r-1,0);
            System.out.println();
        }
    }
}
