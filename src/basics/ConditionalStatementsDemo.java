package basics;

import java.util.Scanner;

/*These are used to execute a block of statements based on some condition or expression
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatementsDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// verify given number is positive
		int number = -10;
		// simple if statement
		if (number >= 0) {
			System.out.println("given number is positive");
		}
//		System.out.println("simple if completed");

		// if else statement
		// verify given number is odd or even
		if (number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}

		// facebook scenario
		// read username
//		System.out.println("enter username");
//		String username = sc.next();
//		
//		// read password
//		System.out.println("enter password");
//		String password = sc.next();
//		// compare username and passwords are valid or not
//		if(username.equalsIgnoreCase("sunshine") && password.equals("selenium")) {
//			System.out.println("welcome "+username.toLowerCase());
//		}else {
//			System.out.println("invalid credentials");
//		}

		// nested if
		// gmail scenario
		// read username
//		System.out.println("enter gmail username");
//		String guser = sc.next();
//		// compare user name is valid or not
//		if(guser.equalsIgnoreCase("sunshine")) {
//			// if user name is valid then read password
//			System.out.println("enter gmail password");
//			String gpass = sc.next();
//			// now compare password is valid or not
//			if(gpass.equals("selenium")) {
//				// if password is valid then greet the user
//				System.out.println("Welcome "+guser.toLowerCase());
//			}else {
//				// if password is invalid then display invalid password
//				System.out.println("invalid password");
//			}
//		}else {
//			// if user name is invalid then display invalid user name
//			System.out.println("invlaid username");
//		}

		// else if ladder
		// launch a desired browser
		System.out.println("enter browser you want to open");
		String brName = sc.next();
		if (brName.equalsIgnoreCase("chrome")) {
			System.out.println("launching Chrome browser");
		} else if (brName.equalsIgnoreCase("firefox")) {
			System.out.println("launching firefox browser");
		} else if (brName.equalsIgnoreCase("opera")) {
			System.out.println("launching Opera browser");
		} else if (brName.equalsIgnoreCase("edge")) {
			System.out.println("launching microsoft edge browser");
		} else {
			System.out.println("launching Internet explorer browser");
		}
		System.out.println("***************************************");

		// switch case
		switch (brName.toLowerCase()) {
		case "chrome":
			System.out.println("launching Chrome browser");
			break;
		case "firefox":
			System.out.println("launching firefox browser");
			break;
		case "opera":
			System.out.println("launching opera browser");
			break;
		case "edge":
			System.out.println("launching edge browser");
			break;
		default:
			System.out.println("launching Internet explorer browser");
		}

		// chess game level scenario
		System.out.println("select a level either 1 or 2 or 3");
		int level = sc.nextInt();
		if (level == 1) {
			System.out.println("instructions");
			System.out.println("tips");
			System.out.println("launching game in easy mode");
		} else if (level == 2) {
			System.out.println("tips");
			System.out.println("launching game in moderate mode");
		} else if (level == 3) {
			System.out.println("launhing game in hard mode");
		} else {
			System.out.println("invalid level selection");
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		// using switch case
		switch (level) {
		case 1:
			System.out.println("instructions");
			System.out.println("tips");
			System.out.println("launching game in easy mode");
			break;
		case 2:
			System.out.println("tips");
			System.out.println("launching game in moderate mode");
			break;
		case 3:
			System.out.println("launhing game in hard mode");
			break;
		default:
			System.out.println("invalid level selection");

		}
		
		
		// score and medals scenario
		System.out.println("enter the score you got");
		int score = sc.nextInt();
		if(score <= 500) {
			System.out.println("Keep Playing......");
		}else if(score <= 1000) {
			System.out.println("bronze medal");
		}else if(score <= 1500) {
			System.out.println("silver medal");
		}else {
			System.out.println("gold medal");
		}

	}

}
