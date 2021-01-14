package Core_Java;

import java.util.Scanner;

public class ArrayAndLoopingDemo {

    public static void main(String[] args){

        // 1st syntax : datatype arrayname[]=new datatype[10];
/*        String countries[]=new String[5];
        countries [0]="Russia";
        countries [1]="India";
        countries [2]="USA";
        countries [3]="UK";
        countries [4]="South Africa";
        for(int i=0;i<=4;i++){
            System.out.println(countries[i]);
        }*/

/*        Scanner sc=new Scanner(System.in);
        //sc.next();
        for(int i=0;i<5;i++){
            countries[i]=sc.next();
        }*/
        //2nd syntax : datatype arrayname[]={ values }

        //Looping statement
        // print 1 to 10
/*        for(int i=1;i<=10;i++){
            System.out.println(i);
        }*/

        //2nd syntax of array. forst is row and second is column
/*        int arr[][]={   {10,20,30,40},
                        {30,40,50,60},
                        {60,70,80,90}
        };
        for(int row=0;row<3;row++){
            for(int col=0;col<4;col++){
                System.out.println(arr[row][col]);
            }
        }*/

        //System.out.println(arr[2][3]);

        String SeleniumClassMates[]=new String[5];
        SeleniumClassMates[0]="1: Mallika";
        SeleniumClassMates[1]="2: Gayatri";
        SeleniumClassMates[2]="3: Raja";
        SeleniumClassMates[3]="4: Sirazh";
        SeleniumClassMates[4]="5: Madhuri";
        for(int i=SeleniumClassMates.length-1;i>=0;i--){
            System.out.println(SeleniumClassMates[i]);
        }



    }
}
