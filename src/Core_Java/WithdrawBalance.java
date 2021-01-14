package Core_Java;

public class WithdrawBalance {

    // Instance variable
    static int accBalance=10000;
    String bankName;

    // Static variable
    static int withdrawAmount = 2000;

    void withdraw(){
        accBalance=accBalance-withdrawAmount;
    System.out.println(accBalance);
    }

    public static void main(String[] args){
        //Object #1
        WithdrawBalance bank1 = new WithdrawBalance();
        bank1.bankName = "HDFC_Bank";
        //System.out.println(bank1.accBalance-withdrawAmount+" is total balance after withdraw of "+withdrawAmount+" from "+bank1.bankName);
        bank1.withdraw();

        //Object #2
        WithdrawBalance bank2 = new WithdrawBalance();
        bank2.bankName = "SBI_Bank";
        //System.out.println(bank2.accBalance-withdrawAmount+" is total balance after withdraw of "+withdrawAmount+" from "+bank2.bankName);
        bank2.withdraw();

        //Object #3
        WithdrawBalance bank3 = new WithdrawBalance();
        bank3.bankName = "City_Bank";
        //System.out.println(bank3.accBalance-withdrawAmount+" is total balance after withdraw of "+withdrawAmount+" from "+bank3.bankName);
        bank3.withdraw();
    }
}









