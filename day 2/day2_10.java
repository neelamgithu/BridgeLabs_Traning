import java.util.Scanner;
class day2_10{
public static void main (String[] args)
{
	 
Scanner sc= new Scanner(System.in);
System.out.println("enter a,b,c");
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double d=b*b - 4.0 *a*c;
double root1=(-b + Math.pow(d, 0.5))/(2.0*a);
double root2=(-b - Math.pow(d ,0.5))/(2.0*a);
System.out.println( root1);
System.out.println( root2);

}
}
