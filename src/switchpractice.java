import java.util.Scanner;
public class switchpractice
{
  public static void main(String[]args)
  {
  Scanner scn = new Scanner(System.in);
    System.out.println("1.Get name \n2.School\n3.Other");
  int commands= scn.nextInt();
  switch (commands) { case 1: System.out.println("Your name");break;  case 2: System.out.println("Your school");break; case 3: System.out.println("Your district is matale"); break;
      default: System.out.println("Wrong input");break;}

  }
}