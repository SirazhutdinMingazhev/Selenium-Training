package Core_Java;

public class VariablesInJava {
    int empid;
    String empname,empemailid;

    static String orgname="HLC Tech";

    public static void main(String[] args){
        //TODO Auto-generated method stub

        VariablesInJava employee1=new VariablesInJava();
        employee1.empid=1001;
        employee1.empname="Siraj";
        //employee1.orgname="HLC";
        employee1.empemailid="Siraj1@yahoo.com";

        VariablesInJava employee2=new VariablesInJava();
        employee2.empid=1001;
        employee2.empname="Maga";
        //employee2.orgname="HLC";
        employee2.empemailid="Maga2@yahoo.com";

        System.out.println("Emp id is :"+ employee1.empid+" Emp name is :"+ employee1.empname+" orgname is :"+ employee1.orgname+" emp email is :"+employee1.empemailid);
        System.out.println("Emp id is :"+ employee2.empid+" Emp name is :"+ employee2.empname+" orgname is :"+ employee2.orgname+" emp email is :"+employee2.empemailid);

    }
}
