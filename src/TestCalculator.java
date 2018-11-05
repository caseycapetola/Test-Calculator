import java.util.Scanner;
public class TestCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the number of points earned: ");
		String ptsStr = user.nextLine();
		double pts =  Double.parseDouble(ptsStr);
		System.out.print("\nEnter the total number of points the test was worth: ");
		String totalStr = user.nextLine();
		double total = Double.parseDouble(totalStr);
		double score = pts/total;
		double percent = score*100;
		System.out.print("\nYour score: " + percent + "%");
		if(score>=0.60)
			System.out.print("\nYou passed");
		else
			System.out.print("\nYou did not pass");

	}

}
