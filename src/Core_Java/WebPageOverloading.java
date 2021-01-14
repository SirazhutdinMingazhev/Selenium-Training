package Core_Java;

public class WebPageOverloading {

    String abc;

    void submit(String a, String b){
        abc=a+b;
        System.out.println(abc);
    }
    void submit(String a, String b, int c, int d, int e){
        abc=a+b+c+d+e;
        System.out.println(abc);
    }

    public static void main(String[]args){
        WebPageOverloading obj1=new WebPageOverloading();
        obj1.submit("Name : Sirazh.  ","Address : New York City.");

        WebPageOverloading obj2=new WebPageOverloading();
        obj2.submit("Name : Sirazh.  ","Address : New York City. ", 33, 5555555, 1234);
    }
}








