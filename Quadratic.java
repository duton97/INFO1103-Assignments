import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args)
	{
		int coefficientA, coefficientB, constantC; //variables of the mathematical formula
		double root1, root2, discriminant; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the coefficient (a) of x^2: ");
		coefficientA = keyboard.nextInt();
		
		System.out.println("Enter the coefficient (b) of x: ");
		coefficientB = keyboard.nextInt();
		
		System.out.println("Enter the constant (c): ");
		constantC = keyboard.nextInt();
		
		discriminant = Math.pow(coefficientB,2) - 4*coefficientA*constantC;
		root1 = (-coefficientB + Math.sqrt(Math.pow(coefficientB,2)-(4*coefficientA*constantC)))/(2*coefficientA);
		root2 = (-coefficientB - Math.sqrt(Math.pow(coefficientB,2)-(4*coefficientA*constantC)))/(2*coefficientA);
		
		/* discriminant formula to determine if the equation has two, one or no roots.
		 * root formulas are the same with the exception of plus and minus sign after the first coefficientB
		 */
		
		if (discriminant>0)
			System.out.println("There are two roots: " + root1 + " and " + root2);
		else if (discriminant==0)
			System.out.println("There is one root: " + root1);//Possible to use root1 or root2 as they are the same
		else if (discriminant<0)
			System.out.println("The roots of this equation are complex numbers.");

	}

}
