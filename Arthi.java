import java.util.Scanner;
class Arthi
{
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the two integers");
int a=s1.nextInt();
int b=s1.nextInt();
int add=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
int rem=a%b;
System.out.println("addition is"+add);
System.out.println("subtration is"+sub);
System.out.println("multplication is"+mul);
System.out.println("division is"+div);
System.out.println("remainder is"+rem);
}
}
