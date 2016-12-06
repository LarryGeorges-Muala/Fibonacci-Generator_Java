//App Name: Fibonacci Generator - Java
//Developper: Larry Georges Muala

public class Fibonacci
{
	public static void main (String[] args)
	{
				
		System.out.println("Fibonacci Generator \n");
		
		//Replace size by the value of your desired fibonacci sequence
		int size = 10;
		
		int [] fibonacciArray = new int[size];
		
		//case statement for index 0, 1, 2
		if (size > 0){
			
			switch (size){
				case 1:
				//Fibonacci size of 1 number
					System.out.println("0");
					break;
			
				case 2:
				//Fibonacci size of 2 numbers
					System.out.println("0");
					System.out.println("1");
					break;
			
				default:
				//Fibonacci for size over 3 numbers
					fibonacciArray[0] = 0;
					fibonacciArray[1] = 1;
					fibonacciArray[2] = 1;
					
					for (int i = 3; i < fibonacciArray.length; i++){
						fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
					}

					for (int i = 0; i < size; i++){
						System.out.println(fibonacciArray[i]);
					}
					break;
			}
		}
		else{
			System.out.println("\nError - Invalid value entered. \nPlease enter a positive not null number.");
		}

	}
}