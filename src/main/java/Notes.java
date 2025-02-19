import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		
		int num;
		num = 6;

		//if statement

		if (num < 10) {
			System.out.println("run if");
		}

		//while loop
		num = 0;

		//always eventually becomes false
		while (num < 10) { //if statement that repeats while it is still true
			System.out.println("while loop runs");
			System.out.println(num);
			num++;
		}
		//DO NOT MAKE YOUR LOOPS INFINITE

		//for loops - counted loops

		//for (intialization step; conditional statement; increment step)\
		// initialization step happens once at the first run of the loop
		// condition is check every time at the beginning of each loop
		// increment step is executed at the end of every loop
		for (int i = 0; i < 10; i++) { //the variable is local - can only be used inside the for loop
			System.out.println("for loop runs");
			System.out.println(i);
		}

		//For loop - When you know how many times you want to loop - before the first loop
		//While loop - When you don't know how many times you want to loop

		//Counters and accumulators

		Scanner s = new Scanner(System.in);

		//Counter

		int num2 = -1;
		int count = 0;

		while (num2 != 0) {
			System.out.print("In: ");
			num2 = s.nextInt();
			if (num2 == 5) {
				count++;
			}
		}

		System.out.println(count);

		//Accumulator

		num2 = -1;
		int sum = 0;

		while (num2 != 0) {
			System.out.println("In: ");
			num2 = s.nextInt();
			sum += num2;
		}

		System.out.println(sum);
		//Accumulator with multiplication - start at 1
	}
}
