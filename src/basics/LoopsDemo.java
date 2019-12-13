package basics;

import java.util.Scanner;

/*
 * Loops are used to execute a block of statements repeatedly based on some
 * condition. Each and every repetition is known as an iteration.
 * 
 * Java contains mainly 4 loops
 * 1. while 
 * 2. do while
 * 3. for
 * 4. for each
 * here for each loop is used to iterate over a collection of data like 
 * arrays, It is not condition based loop
 * 
 * every loop (except for each) contains mainly 3 parts
 * 1. initialization
 * 2. condition or expression
 * 3. increment or decrement
 * 
 *while loop:
 *
 *initialize;
 *
 *while(condition or expression){
 *	statements which we want to repeat;
 *	increment or decrement
 *}
 *
 *the minimum number of iterations in while loop is 0
 *
 *do while loop:
 *
 *initialize;
 *
 *do{
 *	statements we want to repeat
 *	increment or decrement
 *}
 *while(condition or expression);
 *the minimum number of iterations in while loop is 1
 *
 *
 *for loop:
 *
 *for(initialization; condition or expression; increment or decrement){
 *	statements we want to repeat;
 *}
 *the minimum number of iterations in for loop is 0
 *
 *for each loop:
 *
 *for(collection_data_type var_name : collection_varaible_name){
 *	statements to repeat;
 *}
 *
 *the minimum number of iterations in while loop is 0
 *
 *
 *break statement: it will terminate the loop without executing any statements in that iteration and
 *also next iterations
 *
 *continue statement: it will skip current iteration and executes next iteration. i.e. once
 *continue statement executed it won't execute any statements with in that iteration but executes
 *next iterations
 */

public class LoopsDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		// while loop
		// initialization
		int i = 1;
		// condition
		while (i <= 10) {
			System.out.println(i);
			i++; // increment
		}

		System.out.println("*****************************************");
		// print even numbers from 20 to 10
		// do while loop
		int j = 20;
		do {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j--;
		} while (j > 10);
		System.out.println("*****************************************");

		// print first 10 3 multiples
		// for loop
		for (int k = 1; k < 11; k++) {
			System.out.println(k + " * 3 = " + k * 3);
		}
		System.out.println("*****************************************");

		// for each loop using an array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char var : vowels) {
			System.out.println(var);
		}

		System.out.println("*****************************************");
		// break statement
		for (int l = 0; l <= 10; l++) {
			if (l == 5) {
				break;
			}
			System.out.println(l);
		}

		System.out.println("*****************************************");
		// continue statement
		for (int l = 0; l <= 10; l++) {
			if (l % 2 == 1) {
				continue;
			}
			System.out.println(l);
		}

		// prime number
		int number = 111;
		boolean isPrime = true;
		for (int p = 2; p < number; p++) {
			if (number % p == 0) {
				System.out.println("number is divisible by " + p);
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("number is prime");
		} else {
			System.out.println("numbrer is not prime");
		}

		// read strings from the console until we enter exit
		Scanner sc = new Scanner(System.in);
		String word = "";
		do {
			System.out.println("enter something");
			word = sc.next();
			if (word.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("you entered word as " + word);
			}
		} while (true);

		// inner loops
		for (int num = 10; num < 50; num++) {
			boolean flag = true;
			for (int p = 2; p <= num / 2; p++) {
				if(num % p == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(num+"  ");
			}
		}
		
		// read a number from the console and verify that number is prime or not do this until we enter number as 0
		int inum = 0;
		do {
			System.out.println("enter a number");
			inum = sc.nextInt();
			boolean status = true;
			for(int p = 2; p <= inum / 2; p++) {
				if(inum % p == 0) {
					status = false;
					break;
				}
			}
			if(status) {
				System.out.println("number is prime");
			}else {
				System.out.println("number is not prime");
			}
		}while(inum != 0);

	}
}
