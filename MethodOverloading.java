package oops_concepts;

public class MethodOverloading {
	/* The process of creating multiple methods with the same method name but with different 
	  list of argument data types. This process is known as Method Overloading */
	
	/* Method Overloading depends on 3 conditions:-
	  1) Create two or more methods 
	  2) All the method names must be same
	  3) List of argument data types should differ from one method to another method  */
	
		public static void flipcart(String productName,int productCost)
		{
			System.out.println("product name:"+productName+" "+"product cost:"+productCost);
		}
		public static void flipcart(int productCost,int productId)
		{
			System.out.println("product cost:"+productCost+" "+"product id:"+productId);
		}
		public static void flipcart(String productName)
		{
			System.out.println("product name:"+productName);
		}
		public static void main(String[] args) {
			flipcart("dress");
			flipcart(6000,101);
			flipcart("cosmetic items",2500);
			
			
		}
}
		
		
		
	


