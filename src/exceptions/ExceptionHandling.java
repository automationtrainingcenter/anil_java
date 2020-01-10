package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Exception means an interruption to the normal flow of execution
 * 
 * All the exceptions are classes in Java
 * we have two types of exceptions in Java
 * 1. compile time exceptions
 * 		these are the exceptions which will occur while compiling a .java file to a .class file
 * using javac command.
 * Compile time exceptions are the classes which extends Exception class
 * 
 * 2. run time exceptions
 * 		these are the exceptios which will occur while running a .class file using java command
 * Run time exceptions are the classes which extends RunTimeException class, and this RunTimeException
 * class is the child class of Exception class
 * 
 * Exception is implementation class of Throwable interface
 * 
 * we can handle both run time and compile time exceptions using
 * 
 * try -- this block contains the code which will throws an exception
 * 
 * catch() -- this block contains the code which will handles the exception thrown by try block 
 * 
 * Note: every try block must follows with either one or more catch blocks
 *  
 * finally -- this block contains the code which we want to execute irrespective of the exception
 * 
 * throw -- is a keyword which is used throw your own exception
 */

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("first statement");
		try {
			Thread.sleep(2000);
			FileInputStream fis = new FileInputStream(".\\resources\\data.txt");
			System.out.println(10/10);
		} 
//		catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//			System.out.println("thread has been interruped");
//		} catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//			System.out.println("file is not availabel in resources folder");
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("denominator must be not equal to 0");
//		}
		catch(Throwable e) {
			System.out.println(e.getClass().getName());
			e.printStackTrace();
		}finally {
			System.out.println("inside the finally block");
		}
		System.out.println("second statement");
	}

}
