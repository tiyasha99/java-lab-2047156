package car;
interface Price
{
	float convenient_fee=500;
	public void b_price();
	public void e_price();
}
class Cost implements Price
{
	public void b_price()
	{
		float business_price=5678;
		float gst=564;
		float total=business_price + gst;
		System.out.println("Price of each seat of business class:"+total);
	}
	public void e_price()
	{
		float economy_price=2678;
		float gst=564;
		float total=economy_price + gst;
		System.out.println("Price of each seat of economics class:"+total);
	}
}