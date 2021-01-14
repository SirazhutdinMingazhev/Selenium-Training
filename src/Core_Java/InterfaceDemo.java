package Core_Java;

public interface InterfaceDemo {
    // 1. declare methods without abstract keyword, it's there by default
    // 2. methods and variables declared in Interface are static by default

    int abc=5; // Interface fields are public, static and final by default. -  public static final int abc=5
    void run(); // the methods are public and abstract. - public abstract void run();
}

class classname implements InterfaceDemo{

    @Override
    public void run() {

    }
}

//-------------------------------------------------------------------------------------------------------------------------------

interface printable{
    void print();
}
class A6 implements printable{
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
    }
}

//-------------------------------------------------------------------------------------------------------------------------------

// multiple inheritance in Java
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}