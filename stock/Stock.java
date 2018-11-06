package edu.albany.hw2.stock;

public class Stock { //stock class
	
	private static Stock first;
	private static Stock next;

	public enum Symbol { //stock symbol enum 
			
		
	MSFT("Microsoft"), APPL("Apple"),
	AMZN("Amazon"), GOOGL("Google"),
	T("AT&T"); 
		
	String company;
		
		private Symbol(String stockName)  
		{
				this.company = stockName;
		}
			 double currentPrice;
			 double previousClosingPrice;
			 Symbol Symbol;
				
			public double setCurrentPrice(double currentPrice)
			{
				return this.currentPrice = currentPrice;
			}
			
			public double setPreviousClosingPrice(double previousClosingPrice) 
			{
				return this.previousClosingPrice = previousClosingPrice;
			}
			
			public double getPreviousClosingPrice() 
			{
				return previousClosingPrice;
			}
			
			public double getChangedPercent(double previousClosingPrice, double currentPrice)
			{
				double change = previousClosingPrice - currentPrice;
				return change;
			
			}		
	}
	public Stock(Symbol symbol) //defining constructor Stock
	{ }
	
	public static void main(String Args[]) {
		
		first = new Stock(Symbol.MSFT);
		next = new Stock(Symbol.GOOGL);
		
		System.out.println(Symbol.MSFT + " has a current stock value of $58.90."); 
		System.out.println(Symbol.MSFT + " has a new stock value of $59.00");
		System.out.println(Symbol.GOOGL + " has a current stock value of $91.40."); 
		System.out.println(Symbol.GOOGL + " has a new stock value of $94.00");
		
	}


}
