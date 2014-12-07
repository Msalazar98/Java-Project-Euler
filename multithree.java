package projecteuler;
public class multithree {
	public static void main(String [] args)
	{
		int three = 0;
		int five = 0;
		int totalsum = 0;
		int totalfive = 0;
		int totalthree = 0;
		for(int i = 0; i < 333; i ++){
			three += 3;
			totalthree += three;
			System.out.print(three + " ");
		}
		System.out.println("");
		for(int i = 0; i < 199; i ++){
			five += 5;
			totalfive += five;
			System.out.print(five + " ");
		}
		System.out.println("");
		totalsum = totalthree + totalfive;
		System.out.println("Total sum of 3: " + totalthree);
		System.out.println("Total sum of 5: " + totalfive);
		System.out.println("Total sum of 3 and 5: " + totalsum);
		
		
	}
}