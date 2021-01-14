package Chanda;

public class MultiplicationTable_1_To_9 {

    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int x=1;x<=9;x++){
                System.out.print(i+" * "+x+"= ");
                System.out.println(i*x);
                    if(x==9){
                        System.out.println(""); // printing empty line after every time second multiplier reaches 9
                    }
            }
        }
    }
}
