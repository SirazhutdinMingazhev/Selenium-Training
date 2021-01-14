package Core_Java;

public class ExceptionHandlingDemo {
    void div(){
        try {
            int division = 100 / 0;
            System.out.println(division);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    void display(){
        System.out.println("This is display message");
    }

    public static void main(String[] args){
        ExceptionHandlingDemo exx=new ExceptionHandlingDemo();

        exx.div();
        exx.display();
    }
}
