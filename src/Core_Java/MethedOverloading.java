package Core_Java;

public class MethedOverloading {

    int add;
    void sum(int a, int b){
        add=a+b;
        System.out.println(add);
    }

    void sum(int a, int b, int c){
        add=a+b+c;
        System.out.println(add);
    }

    void sum(int a, int b, int c, int d){
        add=a+b+c+d;
        System.out.println(add);
    }


    public static void main(String[] args){
        MethedOverloading obj1=new MethedOverloading();
        obj1.sum(100,200);

    }

 /*   class Adder{
        static int add(int a,int b){return a+b;}
        static int add(int a,int b,int c){return a+b+c;}
    }
    class TestOverloading1{
        public static void main(String[] args){
            System.out.println(Adder.add(11,11));
            System.out.println(Adder.add(11,11,11));
        }}*/

}
