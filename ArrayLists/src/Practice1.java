import java.util.ArrayList;



public class Practice1
	{

	public static void main(String[] args)
		{
		
	ArrayList bigBoy = new ArrayList();
	
	bigBoy.add(90.0);
	bigBoy.add(76.55);
	bigBoy.add(888.88);
	bigBoy.add(1.00);
	bigBoy.add(78787.2);
	
	System.out.println(bigBoy);
	System.out.println("");
	
	double total = 0;
	
	for(int i=0; i<bigBoy.size(); i++)
		
		total = total + (double)bigBoy.get(i);
	
	System.out.println(total);
	
	//delete first, add two, average them out
	
	bigBoy.remove(0);
	bigBoy.add(7.77);
	bigBoy.add(2.11);
	
	double newTotal=0;
	
for(int i=0; i<bigBoy.size(); i++)
		
		newTotal = newTotal + (double)bigBoy.get(i);

System.out.println(newTotal/bigBoy.size());
	
	
		
		}

	}
