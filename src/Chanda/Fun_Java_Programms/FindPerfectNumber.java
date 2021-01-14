package Chanda.Fun_Java_Programms;

import java.util.Scanner;

public class FindPerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); int n, i = 1, sum = 0; System.out.print("Enter a number: "); n = sc.nextInt();
        while (i < n) {
            if (n % i == 0) { sum = sum + i;
            }
            i++; }
        if (sum == n) {
            System.out.print(i + " is a perfect number");
        } else {
            System.out.print(i + " is not a perfect number");
        }
    }
}  //main
