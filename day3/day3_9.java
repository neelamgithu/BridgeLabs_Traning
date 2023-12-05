import java.util.Arrays;
public class day3_9 {  
    public static void main(String[] args) {      
          
         
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
		for(int i = 0; i < arr.length; i++) {  
		Arrays.sort(arr);
		}
		System.out.println(Arrays.toString(arr));
}}