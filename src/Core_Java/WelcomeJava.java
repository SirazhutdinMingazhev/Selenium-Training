package Core_Java;

public class WelcomeJava {
    //instance variable
    int a =200;
    float pi1=3.14f;

    //Static variable
    static float pi=3.14159265f;

    //instance methods
    void display(){
        System.out.println(a);
    }

    void input(){
        String a = "Instance Method input is executed";
        System.out.println(a);
    }

    //static methods
    public static void main(String[] args){
        // All these variables are local variables to this method
        //declaration
        int accno = 10001;
        System.out.println(accno);

        //creating object to use instance variables in static method
        WelcomeJava wc=new WelcomeJava();
        // add " wc. " object name in parenthesis before instance variables
        System.out.println(wc.a);
        System.out.println(wc.pi1);

        //calling for Instance Method " input "
        wc.input();

        //printing static(global) variable declared outside of this method
        System.out.println(pi);

        String name = "Siraj";
        System.out.println(name);

        char grade = 'A';
        System.out.println(grade);

        wc.display();

    }
}
