import java.util.Scanner;
class day3_3{
public static void main (String[] args)
{
System.out.println("enter  number of array element");
Scanner sc= new Scanner(System.in);

int a=sc.nextInt();
System.out.println(a);

 int arr []=new int[a]8;
 System.out.println("enter array element");
 for(int i=0;i<a;i++)
 {    arr[i]=sc.nextInt();
	 
	 
 

 }
  //ystem.out.println("elements are" + arr[i]);
  for(int i=0;i<a;i++)
  {
	 System.out.println( arr[i]);
  }

///finding largest
int largest;
int max = arr[0];
for(int i=1;i<arr.length;i++)
if(arr[i]>max)
{max=arr[i];
System.out.println( max);
}
 System.out.println("Largest in given array is "
                           + max);
}
}