package OOPs_3.inheritance;

import OOPS_4.Access_mod;

public class Access_outside_pkg extends Access_mod {
    public Access_outside_pkg(String name, float marks) {
        super(name, marks);
    } //here roll is no modifier ie it didn't work

    Access_mod obj = new Access_mod("Chaitra ",99.9f);
 // float n = obj.marks; // it freaking doesnt know that its extended , if this held true then it would be public

    Access_outside_pkg obj1 = new Access_outside_pkg("param",99.9f);
    float m = obj1.marks;


}
