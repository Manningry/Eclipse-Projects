import java.util.*;
import java.io.*;
   
class Problem
{
   public static void main (String[] args) throws IOException
   {
      Scanner file = new Scanner( new File( "pr11.dat" ) );
      int numberOfLinesOfData = file.nextInt();      
      file.nextLine();
      for( int i = 0; i < numberOfLinesOfData; i++ )
      
{int GallonsBought = file.nextInt();
int paidToday = file.nextInt();
int paidYesterday = file.nextInt();

System.out.printf("PAID MORE: $" + "%.2f",(GallonsBought*paidToday-GallonsBought*paidYesterday));
      
    if((GallonsBought*paidToday)<(GallonsBought*paidYesterday))
      System.out.printf("PAID MORE: $" + "%.2f",((GallonsBought*paidYesterday)-(GallonsBought*paidToday)));
    if((GallonsBought*paidToday)==(GallonsBought*paidYesterday))
      System.out.print("PAID THE SAME");
}
 }
   }
