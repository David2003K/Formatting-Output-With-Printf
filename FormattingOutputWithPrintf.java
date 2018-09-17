import java.util.Scanner;

public class FormattingOutputWithPrintf
{
	public static void main(String[] args)
	{
		{
		int numberOfItems = 0;
		double subtotal = 0;
		final double tax = 5.75;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of items bought: ");
		numberOfItems = input.nextInt();
		System.out.print("Enter the subtotal: ");
		subtotal = input.nextDouble();

		final double taxTotal = tax * subtotal;
		final double total = subtotal + taxTotal;

		System.out.printf("\n%40s", "Number of items purchased:      " + numberOfItems);
		System.out.printf("\n%40s", "Subtotal:   " + total);
		System.out.printf("\n%40s", "Tax:   " + taxTotal);
		System.out.printf("\n%40s", "------");
		System.out.printf("\n%40s", "  $" + total);
		System.out.printf("\n%40s", "Gas points earned:     " + (int)(total));
		System.out.println();
      }
	}
}