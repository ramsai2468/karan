import java.util.Scanner;
public class Big1 
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s1.nextInt();
	    int ar[]=new int[n];
		System.out.println("enter the"+n+"values");
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
        {
		ar[i]=s1.nextInt();
        if(ar[i]>big)
        big=ar[i];
		System.out.println("biggest is"+big);
		}
		}
        }