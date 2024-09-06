//Find the number is even or odd
package Numbers;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=obj.nextInt();
        if (num%2!=0) {
        	System.out.print(num+" is odd number");
        } else {
        	System.out.print(num+" is even number");
        }
	}

}
