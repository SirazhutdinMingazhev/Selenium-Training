package Core_Java;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String myString;
        int myNum;
        float myFloat;

        // entering String
        System.out.println("enter String/word");
        myString = sc.nextLine();
        System.out.println("My entered String/word is : "+ myString);

        // entering number type int
        System.out.println("enter num");
        myNum = sc.nextInt();
        System.out.println("My entered number is : "+ myNum);

        // entering number type float
        System.out.println("enter float num");
        myFloat = sc.nextFloat();
        System.out.println("My entered number is : "+ myFloat);

    }
}
