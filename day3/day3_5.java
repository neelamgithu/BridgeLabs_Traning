import java.util.Scanner;
class day3_5{
public static void main (String[] args)
{
System.out.println("enter  number of array element");
Scanner sc= new Scanner(System.in);

int a=sc.nextInt();
System.out.println(a);

 int arr []=new int[a];
 System.out.println("enter array element");
 for(int i=0;i<a;i++)
 {    arr[i]=sc.nextInt();
	 
  }
  
  for(int i=0;i<a;i=i+2)
  {
	 System.out.println( arr[i]);
  }

}
}