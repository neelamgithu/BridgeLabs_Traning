import java.util.Scanner;
class day2_8{
public static void main (String[] args)
{
	 
Scanner sc= new Scanner(System.in);
System.out.println("enter a,b,c");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
operations( a,b,c);
}
public static void operations(int a,int b,int c){
int out1= a+b*c;
System.out.println(out1);
int out2=c+a/b;
System.out.println(out2);
int out3= a%b+c;
System.out.println(out3);
int out4=a*b+c;
System.out.println(out4);
int max=Math.max(Math.max(out1,out2),Math.max(out3,out4));
System.out.println(max);
int min=Math.min(Math.min(out1,out2),Math.min(out3,out4));
System.out.println(min);
}
}