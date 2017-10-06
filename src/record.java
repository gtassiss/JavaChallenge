
import java.util.Scanner;
        import java.util.Scanner;
class record
{
    private int c_id;
    private String c_name;
    private double amount,totalamount;
    private String t_code;
    public void setRecord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Costumer ID: ");
        c_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Costumer Name: ");
        c_name=sc.nextLine();

        System.out.println("Enter Sales Amount: ");
        amount=sc.nextDouble();
        System.out.println("Enter Txt Code(BIZ/NRM/NPF): ");
        t_code=sc.next();
    }
    public void displayDetails(record r)
    {
        System.out.println("Costumer ID: "+c_id);
        System.out.println("Costumer Name: "+c_name);
        System.out.println("Sales Amount: $"+amount);
        System.out.println("Tax Code: "+t_code);
        t_code=t_code.toUpperCase();
        if(t_code.equals("NRM"))
        {
            totalamount=amount+amount*(6.0/100);
        }
        else if(t_code.equals("BIZ"))
        {
            totalamount=amount+(amount*4.5)/100;
        }
        else if(t_code.equals("NPF"))
        {
            totalamount=amount;
        }
        else
        {
            System.out.println("Wrong Tex Code");
        }
        System.out.println("Total Amount Due: $"+totalamount);

    }
}
class A
{
    static String s="y";
    public static void main(String[] args)
    {
        while(s.equals("y"))
        {
            record r=new record();
            r.setRecord();
            r.displayDetails(r);
            Scanner sc=new Scanner(System.in);
            System.out.println("Do you want to another record? (y/n)");
            s=sc.next();
        }
    }
}