import java.util.Scanner;
class day3_6{
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
  
  for(int i=0;i<arr.length;i++)
  {
	 System.out.println( arr[i]);
  }

  int i=arr[0];
  int j = arr.length-1;
  while(i<j)
  {
	  int temp =arr[i];
	   arr[i]=arr[j];
	  arr[j]=temp;
	  i++;
	  j++;
	  
	  System.out.println( arr[i]);
	
  }  
	  
  }
}