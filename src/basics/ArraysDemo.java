package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArraysDemo {

	public static void main(String[] args) {
		// declaring 1D array
		int[] marks = new int[6];

		// assigning values to 1D array
		marks[0] = 12;
		marks[1] = 14;
		marks[2] = 13;
		marks[3] = 15;
		marks[4] = 11;
		marks[5] = 10;
//		marks[6] = 9;

		// retrieve the values from 1D array
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks[5]);
		
		// retrieving data using normal for loop
		for(int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}

		// initialize a 1D array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// find the number of items in an array
		System.out.println("length of the vowels array is " + vowels.length);

		// retrieve the values from the vowels array
//		System.out.println(vowels[0]);
//		System.out.println(vowels[1]);
//		System.out.println(vowels[2]);
//		System.out.println(vowels[3]);
//		System.out.println(vowels[4]);
		
		// retrieving values using for each loop
		for(char vowel : vowels) {
			System.out.println(vowel);
		}
		
		

		// declaring a 2D array
		int[][] m1 = new int[3][2];

		// assign some values to the 2D array
		m1[0][0] = 1;
		m1[0][1] = 0;
		// ------------------------------
		m1[1][0] = 2;
		m1[1][1] = 3;
		// --------------------------------
		m1[2][0] = 4;
		m1[2][1] = 5;

		// retrieve the values from 2D array
		System.out.print(m1[0][0] + " ");
		System.out.print(m1[0][1] + "\n");
		// -------------------------------------
		System.out.print(m1[1][0] + " ");
		System.out.print(m1[1][1] + "\n");
		// --------------------------------------
		System.out.print(m1[2][0] + " ");
		System.out.print(m1[2][1] + "\n");

		// initialize a 2D array
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// find the number of items in 2D array
		System.out.println("number of rows in m2 array is " + m2.length);
		System.out.println("number of columns  in first row of m2 array is " + m2[0].length);
		System.out.println("number of columns  in second row of m2 array is " + m2[1].length);
		System.out.println("number of columns  in third row of m2 array is " + m2[2].length);

		// retrieve the values
		System.out.print(m2[0][0] + "  ");
		System.out.print(m2[0][1] + "  ");
		System.out.print(m2[0][2] + "\n");
		// ----------------------------------------
		System.out.print(m2[1][0] + "  ");
		System.out.print(m2[1][1] + "  ");
		System.out.print(m2[1][2] + "\n");
		// ----------------------------------------
		System.out.print(m2[2][0] + "  ");
		System.out.print(m2[2][1] + "  ");
		System.out.print(m2[2][2] + "\n");

		// a 2D array with unequal number of columns
		int[][] m3 = { { 0, 1 }, { 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		
		
		// find the number of items in 2D array
		System.out.println("number of rows in m3 array is " + m3.length);
		System.out.println("number of columns  in first row of m3 array is " + m3[0].length);
		System.out.println("number of columns  in second row of m3 array is " + m3[1].length);
		System.out.println("number of columns  in third row of m3 array is " + m3[2].length);
		
		// retrieve the values
		System.out.print(m3[0][0]+"\t");
		System.out.print(m3[0][1]+"\n");
		// ------------------------------------------
		System.out.print(m3[1][0]+"\t");
		System.out.print(m3[1][1]+"\t");
		System.out.print(m3[1][2]+"\n");
		// ------------------------------------------
		System.out.print(m3[2][0]+"\t");
		System.out.print(m3[2][1]+"\t");
		System.out.print(m3[2][2]+"\t");
		System.out.print(m3[2][3]+"\t");
		System.out.print(m3[2][4]+"\n");
		

	}

}
