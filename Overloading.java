package oops_concepts;

public class Overloading {
	//Method overloading with non static method
	
	void amazon(String productName)
	{
		System.out.println("product name:"+productName);
	}
	void amazon(int cost,String productName)
	{
		System.out.println("cost:"+cost+" "+"product name:"+productName);
	}
	void amazon(int productId)
	{
		System.out.println("product id:"+productId);
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.amazon(101);
		o.amazon("dress");
		o.amazon(500, "cosmetics");
	}
	

}
