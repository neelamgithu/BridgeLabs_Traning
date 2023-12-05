import java.util.Scanner;
        public class day2_5 {
            public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
			System.out.println("enter number");
		//using while
int num = sc.nextInt();
			int n=num;
			
			int output=0,remender;
			/*while(num >0)
			{
				remender=num%10;//num=121,re=1///
				output=(output*10)+remender;//output=1
				num=num/10;//num=12
			}
			if(n==output){
				System.out.println("is palli");
			}
			else
				System.out.println("non palli");*/
			
for	(output=0;num> 0; num=num/10)	
{
	remender=num%10;
	output=(output*10)+remender;
	num=num/10;
}	if(n==output){
				System.out.println("is palli");
			}
			else
				System.out.println("non palli");
			
			
			
			
			
			
			}
		}