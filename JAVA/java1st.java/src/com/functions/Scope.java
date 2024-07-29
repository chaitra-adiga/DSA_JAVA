package com.functions;

public class Scope {
    public static void main(String[] args) {
        int a =1;
        int b= 3;
        String name="Chaitra";
        //int a=100;------- already initialized in scope - only once we can initialize
        a=100; //----- we can modify any time after initialization
        {
            b=21;
            int c =33;
            System.out.println(b+" "+c);
            name="Ghorur";
            System.out.println(name);
        }
        // System.out.println(c);------ out of block scope
        //values initialized in the block will remain in the block = BLOCK SCOPE
        //but function scope initialized values can be manipulated in the block provided its inside function scope


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num=22;
            System.out.println(num);
            // int a=100;----- error = already defined in scope!
            b=90; // values can be modified
        }
        System.out.println(name);

        int num=98; //this is possible
        /*
        System.out.println(i); ------ outside for loop scope
        System.out.println(num);----- outside for loop scope
         */


        /*
               O> Whatever values which are already initialised/defined in the SCOPE OF FUNCTION of the
                for loop OR block can not be re-initialized but can be modified

               O> whatever is initialised in the block / for loop remains there itself
               O> Anything which is initialised outside the block cant be initialise inside the block
                    initialising -----> updating
               O> Anything which is initialised inside the block cant be used outside but can be
               initialised again (num in for loop)
         */
    }
}
