package Core_Java;

import java.util.Scanner;

public class Addition {

    // instance variable
    int add;

    // instance method
    void sum(int num1, int num2){
        add=num1 + num2;
        //return add;
        System.out.println(add);
    }

    // main method
    public static void main(String[] args){
        Addition obj1 = new Addition();
        obj1.sum(200,400);
        obj1.sum(300,500);
        obj1.sum(234,456);

       Scanner sc = new Scanner(System.in);
       int name = sc.nextInt();

       // Core_Java.Addition obj1 = new Core_Java.Addition();
       // int num1 = obj1.sum(122,233);
       // if(num1%2==0){
        //    System.out.println(prime number);
        }



}
