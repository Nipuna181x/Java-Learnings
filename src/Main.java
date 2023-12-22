import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner ips = new Scanner(System.in);
    System.out.print("Enter your ID: ");
        String examid = ips.nextLine();
    System.out.print("Enter your Name: ");
        String stname = ips.nextLine();

    if (examid.equals("mat1010") && stname.equals("nipuna") )
    {
        System.out.println("Logged in!");
    }
    else
    {
    System.out.println("Entered informations are wrong");
    }
    System.out.println("1.Get resault");
        System.out.println("2.Log out");
    int commandt = ips.nextInt();
    if(commandt==1){ System.out.println("Maths-a\nChem-b\np6-c");} else if (commandt==2) {System.out.println("Logged out");} else {System.out.println("Wro");}
    }
}
