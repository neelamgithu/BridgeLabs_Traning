import java.util.Scanner;
class day2_4{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number")

int num = sc.nextInt();
    int reverse = 0;
    while (num != 0) {
        reverse = reverse * 10 + num % 10;
        num /= 10;

    }
System.out.println(reverse)
 }   
}

