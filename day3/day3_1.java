import java.util.Scanner;
class day3_1{
public static void main (String[] args)
{
	
Scanner sc= new Scanner(System.in);
System.out.println("enter  number of array element");
int a=sc.nextInt();
 int arr []=new int[5];
 System.out.println("enter array element");
 for(int i=0;i<=a;i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println("array element");
 for(int i=0;i<=a;i++)
 {
 System.out.println(arr[i]);
 }
 }
 }