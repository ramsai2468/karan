class Age
{
	public static void main(String args[])
		{
			int ticketprice=100;
			double discount=0;
			double price=0;
			int age=90;
				if(age>=60)
					{
						discount=20;
					}
		                price=ticketprice-(discount/100)*ticketprice;
			         
			System.out.println(price);
		        
		}
}