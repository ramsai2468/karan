import java.util.Scanner;
class AverageDigits
{
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number");
int n=s1.nextInt();
int avg,sum=0;
do
{
int r=n%10;
sum=sum+r;
avg=sum/3;
n=n/10;
}
while(n!=0);
System.out.println("avg of digits is"+avg);
}
}