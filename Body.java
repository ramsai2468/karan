import java.util.Scanner;
class Body
{
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Weight of the person in kg");
int kg=s1.nextInt();
System.out.println("Height of the person in mrs");
int mrs=s1.nextInt();
System.out.println(" BMI of the person "  +(kg/(mrs*mrs)));
}
}