
public class PracticeChallenges
	{

	public static void main(String[] args)
		{
		
		Array1();
		mustangArray();
		numbers();

		}
	
	public static void Array1()
		{
		
		int firstArray [][] ={{2,4,6,8}, {3,6,9,12}, {4,8,12,16}};
		System.out.println(firstArray[1][2]);
		System.out.println("");
		}
	
	public static void mustangArray()
		{
		String mustang[] [] = new String [5][3];
		
		for(int row = 0; row < 5; row++)
			{
			for(int column = 0; column < 3; column++)
				{
				mustang[row][column] = "Mustang \t";
				}
			}
		
		for(int row = 0; row < 5; row++)
			{
			for(int column = 0; column < 3; column++)
				{
				System.out.print(mustang[row][column]);
				}
			System.out.println("");
		}
		System.out.println("");

	}
	
	public static void numbers()
		{
		
		int add1 = 10;
		int numberBox [] [] = new int [3][3];
		 
		
		for(int row = 0; row<3; row++)
			{
			for(int column = 0; column < 3; column++)
				{
				numberBox[row][column] = add1;
			add1 = add1+10;
				}
			}
		
		for(int row = 0; row<3; row++)
			{
			for(int column = 0; column < 3; column++)
				{
				System.out.print(numberBox[row][column]);
				System.out.print("\t");
				}
		System.out.println("");
			}
		System.out.println("");
		int totalCorners = (numberBox[0][0] + numberBox[0][2] +numberBox[2][0]+numberBox[2][2]);
		System.out.println("The sum of the corners = " + totalCorners + ".");
	
		
		}
	}