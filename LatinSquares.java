import java.util.Scanner;

public class LatinSquares 
{
	/**
	 * Reads an integer representing N from the keyboard and returns it 
	 * 
	 * @return the value for N
	 */
	public static int readSize()
	{
		Scanner keyboard = new Scanner(System.in);
		int nSize = keyboard.nextInt();
		return nSize;	//nSize is size of square
	}
	
	
	
	/**
	 * Reads N x N integer numbers from the keyboard and arranges them in
	 * N array row-by-row
	 * 
	 * @param n - the size of the square
	 * @return the n x n array (the square)
	 */
	public static int[][] readSquare(int n)
	{
		int amountNumbers = n*n; //duplicates n to obtain the amount of Numbers 
		//needed in the square
		Scanner keyboard = new Scanner(System.in);
	
		int[][] nSize = new int[n][n]; //index less than length

		
		for (int i=0; i<nSize.length; i++)//length starts from 1
		{
			for (int j=0; j<nSize[i].length; j++)//length starts from 1
			{
				nSize[i][j]=keyboard.nextInt();
			}
		}
		return nSize;
		
	}
	
	/**
	 * Checks if a given column contains the numbers 1 to N
	 * 
	 * @param n - the size of the square
	 * @param square - an n x n array
	 * @param columnNumber - the column to check
	 * @return false if columnNumber is outside the range [0...(n-1); true if the
	 * 			row contains the number 1 to n, false otherwise
	 */
	
	public static boolean validColumn(int n, int[][] square, int columnNumber)
	{
		//square=readSquare(n);
		//int[][] something = square; //variable unidentified
		//square[1][1]=2;
		//columnNumber must be 0 - n-1, to fulfill if statement square [z][i]
		
		
		if (columnNumber >= n)
		{
			return false;
		}
		else
		{
		for (int i=0;i<n;i++) //not sure if i=0, or = used
		{
			for (int z=0; z<n; z++) //elements of the column, z below n
			
				if (square[z][i]<1 || square[z][i]>n) //check column, row changes (i) and column still (j)
				{
					return false; //returns true before checking all elements? if so, delete. Changed so that if its out of boundry return false...else within the boundry return true
				}
				
			for (int a = 0; a<n; a++)
			{
				if (square[0][a]==square[1][a])
				{
					return false;
				}
				else if (square[0][a]==square[2][a])
				{
					return false;
				}
				
				if(a==3)
				{
					if(square[1][a]==square[2][a])		
					return false;
				}
					// took out return else as there is a return true beforehand
			}
		}
		
		return true;
		}	//not sure
	}
	
	
	/**
	 * Checks if a given row contains the numbers 1 to N
	 * 
	 * @param n - the size of the square
	 * @param square - an n x n array
	 * @param rowNumber - the row to check
	 * @return false if rowNumber is outside the range [0...(n-1)]; true
	 * row contains the numbers 1 to n; false otherwise
	 */
	
	public static boolean validRow(int n, int[][] square, int rowNumber)
	{
		//square=readSquare(n);
		//int[][] something = square; //variable unidentified
		//square[1][1]=2;
		//columnNumber must be 0 - n-1, to fulfill if statement square [z][i]
		
		if (rowNumber >= n)
		{
			return false;
		}
		else
		{
		
		for (int i=0;i<n;i++) //not sure if i=0, or = used
		{
			for (int z=0; z<n; z++) //elements of the column, z below n
			
				if (square[i][z]<1 || square[i][z]>n) //check column, row changes (i) and column still (j)
				{
					return false; //returns true before checking all elements? if so, delete. Changed so that if its out of boundry return false...else within the boundry return true
				}	
				
			for (int a = 0; a<n; a++)
			{
				if (square[a][0]==square[a][1])
				{
					return false;
				}
				else if (square[a][0]==square[a][2])
				{
					return false;
				}
				else if (square[a][1]==square[a][2])
				{
					return false;
				}
			}
						
					// took out return else as there is a return true beforehand
		}
		return true;
		}//not sure
	}
	
	
	/**
	 * Checks if the square is a Latin square by calling the methods validColumn and validRow
	 *
	 * @param n - the size of the square
	 * @square - an n x n square of numbers
	 * @return true if square is a Latin and false otherwise
	 */
	
	public static boolean validLatinSquare(int n, int[][] square)
	{
		
		if(validColumn(n, square, n-1)==true && validRow(n, square, n-1)==true)
		{
			for (int i = 0; i<n; i++)
			{
				for (int j=0; j<n; j++)
				if (square[i][j]==square[i][j])
				{
					
				}
			}
			
			
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the size of the square (N):");
		int n = readSize();
		if (n < 0)
		{
			System.out.println("Invalid size entered.");
			return;
		}
		System.out.println("Please enter " + n*n + " numbers: ");
		int[][] square = readSquare(n);
		if (validLatinSquare(n, square)==true) 
		{
			System.out.println("It´s a Latin square!");
		}
		else
		{
			System.out.println("Not a Latin Square!");
		}
	}
}

