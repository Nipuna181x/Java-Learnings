import java.util.Scanner;

public class while_loop_practice
{
    public static void main(String[]args)
    {
        Scanner inpts = new Scanner(System.in);
        System.out.print("Input number: ");
        int count = inpts.nextInt();

        while (count < 10){ System.out.println("Nipuna");
            count= count+1; }
    }


}
