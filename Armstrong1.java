import java.util.Scanner;
class Armstrong1
{
boolean isArmstrong(int n)
{
int c=countDigits(n);
int sum=0,t=n;
do
{
int r=n%10;
sum=sum+pow(r,c);
n=n/10;
}
while(n!=0);
return sum==t;
}
int countDigits(int x)
{
int count=0;
do{
cout++;
x/=10;
}
while(x!=0);
return count;
int pow(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number");
int n=s1.nextInt();
Armstrong a=new Armstrong();
for(int i=1;i<=100000;i++)
boolean g=a.isArmstrong(i);
if(g)
System.out.println(i);
}
}