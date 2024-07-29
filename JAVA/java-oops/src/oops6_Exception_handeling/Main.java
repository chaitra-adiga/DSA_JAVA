package oops6_Exception_handeling;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        String name = "Ghoruu";
        //System.out.println(divide(a,b));
        try{
//            int c =divide(a,b);
//            System.out.println(c);
            //throw new Exception("just for fun ");
            if(name =="Ghoruu"){
                throw new My_Exception("Oooooooo Ghoruuuuuuuu >< ");
            }
        } catch (My_Exception e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("normal exception");
        } finally {
           System.out.println("this is executed everytime");
        }
   }

//    static int divide(int a , int b) throws ArithmeticException{
//        if(b == 0){
//            throw new ArithmeticException("Please don't divide by zero");
//        }
//        return a/b;
//    }
}
