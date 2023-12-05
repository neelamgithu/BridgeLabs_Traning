    import java.util.Scanner;
        public class day2_2 {
            public static void main(String[] args) {

                
                Scanner input = new Scanner(System.in);

                
				
				System.out.print("Enter a 3 digit number: ");
                int number = input.nextInt();

               
              if(number / 10 == 0)
                System.out.printf("oness  digit: " );

                
              else if(number / 100 == 0)
                System.out.printf("tens  digit: " );



                
               else if(number / 1000 == 0)
                System.out.printf("hundreds digit: " );
 


                
		}}
