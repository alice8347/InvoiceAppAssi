import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;	//Used for formatting the tax number

public class InvoiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double taxRate, price = 1, subtotal = 0, tax, grandTotal;
		int index = 0;
		ArrayList<Double> priceArray = new ArrayList<Double>();
		
		System.out.print("Tax Rate ? : ");
		taxRate = keyboard.nextDouble();

		while (price != 0) {
			System.out.print("Price # " + (index + 1) + "   : ");
			price = keyboard.nextDouble();
			priceArray.add(price);
			subtotal += price;
			index++;
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("Receipt");
		for (int i = 0; i < priceArray.size() - 1; i++) {
			/*NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String priceText = number.format(priceArray.get(i));
			System.out.println(priceText);*/
			System.out.printf("%.2f%n", priceArray.get(i));	//Display the price to two digits after the decimal point
		}
		System.out.println(subtotal + " subtotal");		
		tax = subtotal * taxRate;
		DecimalFormat myFormatter = new DecimalFormat(".###");	//Format the tax to not show the digit before the decimal point if it is zero
		System.out.println(myFormatter.format(tax) + "  tax");
		grandTotal = subtotal + tax;
		System.out.printf("%.2f  grand total%n", grandTotal);	//Display the grand total to two digits after the decimal point
	}

}
