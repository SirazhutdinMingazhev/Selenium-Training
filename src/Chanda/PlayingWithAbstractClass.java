package Chanda;

abstract class Car{
    abstract void speed();
    abstract void weight();
}

interface Car1{

}

public class PlayingWithAbstractClass extends Car {
    void speed() { System.out.println("Hello"); }
    void weight() { System.out.println("World"); }

    public static void main(String[] args){
        Car obj=new PlayingWithAbstractClass();
        obj.speed();
        obj.weight();
    }
}



