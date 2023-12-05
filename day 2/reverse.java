import java.util.Scanner;
class reverse{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number");

int num = sc.nextInt();
    int rev = 0;
    while (num != 0) {//num=1234
        rev = rev * 10 + num % 10;//last digit
       num= num /10;

    }
System.out.println(rev);
 }   
}
