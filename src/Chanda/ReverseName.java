package Chanda;

public class ReverseName {
    void breakStringToArray(String name){
        int countChars=name.length();
        System.out.println("there are "+countChars+" chars in given string");

        String myArray[]= new String[countChars];
        for(int i=countChars-1;i>=0;i--){
            myArray[i]=String.valueOf(name.charAt(i));
            System.out.println(myArray[i]);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReverseName obj1=new ReverseName();
        obj1.breakStringToArray("New York");
    }
}



