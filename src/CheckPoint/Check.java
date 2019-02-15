package CheckPoint;

import java.util.Random;

public class Check {
public static void main(String[] args) {
	
	
	
	/* 1.  Create an integer variable and initialize it to a random number between 0-4.

2.  Use a switch statement to print a different response based on the value of the integer created in step 1.

	 */
	
	Random r = new Random();
	int x = r.nextInt(5);
	
	System.out.println(x);
	
	switch(x) {
	case 0:{
		System.out.println("zero");
		break;
	}
	case 1:{
		System.out.println("one");
		break;
	}
	case 2:{
		System.out.println("two");
		break;
	}
	case 3:{
		System.out.println("Three");
		break;
	}
	case 4:{
		System.out.println("Four");
		break;
	}
	
	
	
	
	}
	
	
}
}
