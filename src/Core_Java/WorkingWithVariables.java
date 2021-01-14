package Core_Java;

public class WorkingWithVariables {
    // static variable
    static int a = 100;

    // Instance variable
    int b = 200;

    // Instance method # 1
    void sampleMethod(){
        int a = 400;
        System.out.println(a);
    }

    // Instance Method # 2 (calling Instance method # 1 within this method)
    void secondInstMethd(){
        sampleMethod();
    }

    // Created main method where I called/executed all instance/static variables and instance methods
    public static void main(String[] args){
        System.out.println(a);

        // creating object to work with Instance variables
        WorkingWithVariables abcd = new WorkingWithVariables();
        System.out.println(abcd.b);

        // calling/executing instance method " sampleMethod "
        abcd.secondInstMethd();
    }
}
