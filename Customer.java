/*
In the Customer panel, the customer can choose products to buy through the 
product ID, and he/she can view product details. 
The chosen products are placed in a cart, wherein the customer can add and 
remove products before check out. 
The customers cannot choose products that are out of stock. 
Upon check out, the receipt should be displayed such that it contains info 
about the total sale together with the details of the products bought by the customer.*/
import java.util.*;
public class Customer extends GroceryItems{

	static Scanner console = new Scanner(System.in);
	static ArrayList<Item> cart = new ArrayList<Item>();
		
		public void choice(){
			boolean q = true;
			while (q){
				System.out.printf("\nCHOICES:\n");
				System.out.println("a - add an item");
				System.out.println("b - remove an item");
				System.out.println("c - bill out");
				System.out.printf("\nEnter a choice:\n");
					char choice = console.next().charAt(0);  

				switch (choice){
					case 'a': 
						System.out.println("Enter the Product ID: ");
						String prodId = console.next();
						this.addToCart(prodId);
						break;
					case 'b':
						System.out.println("Enter the Product ID: ");
						prodId = console.next();
						this.removeToCart(prodId);
						break;
					case 'c':
						this.showCartItems();
					case 'd':
						this.billOut();
					case 'q':
						q = false;
						System.out.printf("Goodbye!\n");
						break;
					default:
						System.out.printf("Error! Choice not found!\n");
				} 
			}
		}	

		public void addToCart(String prodID){
			for (Item item : grocery){
				if (item.getProductID().equals(prodID)){
					if (item.getQuantityInStock() != 0){
						cart.add(item);
						int stock = item.getQuantityInStock();
						stock--;
						break;
					}
					else{
						System.out.println("No stock available");
					}
				}
			}
		}

		public void removeToCart(String prodID){
			int size = cart.size();
			for (Item item : cart){
				if (item.getProductID().equals(prodID)){
					cart.remove(item);
					size--;
					break;
				}
			}
		}

		public void showCartItems(){
			for (Item item : cart){
				System.out.println(item);
			}
		}

		public void billOut(){
			double price = 0;
			for (Item item : cart){
				price += item.getUnitPrice();
			}
			System.out.printf("Total Purchase: %d",price);
		}
}