package introduction;

public class Final_finalise_this {
    public static void main(String[] args) {

        final Human bg = new Human(33);
        System.out.println(bg.new_birth);
        bg.new_birth=78;
        System.out.println(bg.new_birth);
        //bg = new Human(); --- cant do this

        Human lil = new Human(99);
        System.out.println(lil.new_birth);
        lil = new Human();
        System.out.println(lil.new_birth);

        for (int i = 0; i < 10000000; i++) {
            lil = new Human();
//here finalize method is used
        }

    }
}

class Human{
    static int population=30000;
    final int criminal=99;
    int new_birth;

    Human(){
        this.new_birth=0;
    }
    Human(int new_birth){
        this.new_birth= new_birth;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object destroyed");
    }

//    Human(int criminal) {
//        this.criminal = criminal;
//    }
}
