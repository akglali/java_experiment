import java.util.Scanner;


public class FindPrimes {

	public static void main(String[] args)  {
		Scanner reader = new Scanner (System.in);
		System.out.println("Can you write a number:");
		int max = reader.nextInt();
		
		for (int number=2 ; number < max; number++){
			boolean isPrime= true;
			
			for (int divisor =2 ; divisor < number ; divisor++) {
				if(number % divisor == 0)
					isPrime = false;
				
			
				}
				if (isPrime) {
					System.out.print(number + " ");
				}
			}
		reader.close();
		}
			
	}


