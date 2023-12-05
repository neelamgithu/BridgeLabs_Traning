import java.util.Scanner;
class day2_9{
public static void main (String[] args)
{
	 
Scanner sc= new Scanner(System.in);
System.out.println("enter m and d");
int m=sc.nextInt();
int d=sc.nextInt();

if(m>3&&m<6 && d==20)
System.out.println("true");

else
System.out.println("false"); 
}


}