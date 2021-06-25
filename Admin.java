/*Write a program that has two panels: Admin and Customer. 
In the Admin panel, the products for sale can be added and removed. 
In the Customer panel, the customer can choose products to buy through the 
product ID, and he/she can view product details. 
The chosen products are placed in a cart, wherein the customer can add and 
remove products before check out. 
The customers cannot choose products that are out of stock. 
Upon check out, the receipt should be displayed such that it contains info 
about the total sale together with the details of the products bought by the customer.*/

import java.util.*;
public class Admin extends GroceryItems{
	
		static Scanner console = new Scanner(System.in);
		
		public void choice(){
			boolean q = true;
			while (q){
				System.out.printf("\nCHOICES:\n");
				System.out.println("a - add an item");
				System.out.println("b - remove an item");
				System.out.println("q - exit");
				System.out.printf("\nEnter a choice:\n");
					char choice = console.next().charAt(0);  

				switch (choice){
					case 'a': 
						this.addItem();
						break;
					case 'b':
						System.out.println("Enter the Product ID: ");
						String prodId = console.next();
						this.removeItem(prodId);
						break;
					case 'q':
						q = false;
						System.out.printf("Goodbye!\n");
						break;
					default:
						System.out.printf("Error! Choice not found!\n");
				} 
			}
		}	
		public void addItem(){
			System.out.printf("What type of item to add?"+
								"1: Potion"+
								"2: Food"+
								"3: Armor"+
								"4: Weapon");
			System.out.printf("Enter here: ");
			int item = console.nextInt();
				switch (item){
					case 1: 
						System.out.printf("Name of Potion: ");
						System.out.printf("Product ID: ");
						System.out.printf("Stock/s: ");
						System.out.printf("Price: ");
						System.out.printf("Volume: ");
						System.out.printf("Key Ingredient: ");
						System.out.printf("Potion Effect: ");
						String name = console.next();
						String productID = console.next();
						int quantityInStock = console.nextInt();
						double unitPrice = console.nextDouble();
						int volume = console.nextInt();
						String keyIngredients = console.next();
						String potionEffect = console.next();

						Potion pot = new Potion(name, productID, quantityInStock, unitPrice, volume, keyIngredients, potionEffect);
						if (pot.checkProductID(productID)){
							grocery.add(pot);
						}else{
							System.out.println("Product ID already exists!");
						}
						break;
					case 2:
						System.out.printf("Name of Food: ");
						name = console.next();
						System.out.printf("Product ID: ");
						productID = console.next();
						System.out.printf("Stock/s: ");
						quantityInStock = console.nextInt();
						System.out.printf("Price: ");
						unitPrice = console.nextDouble();
						System.out.printf("Expiry Date: M/D/Y");
						int month = console.nextInt();
						int day = console.nextInt();
						int year = console.nextInt();

						Food foo = new Food(name, productID, quantityInStock, unitPrice, month, day, year);

						if (foo.checkExpiryDate(month, day, year)){
							grocery.add(foo);
						}else{
							System.out.println("Food is expired.");
						}
						
						break;
					case 3:
						System.out.printf("Name of Food: ");
						System.out.printf("Product ID: ");
						System.out.printf("Stock/s: ");
						System.out.printf("Price: ");
						System.out.printf("Shield Level: ");
						System.out.printf("Size: ");
						System.out.printf("Color: ");
						name = console.next();
						productID = console.next();
						quantityInStock = console.nextInt();
						unitPrice = console.nextDouble();
						int shieldLevel = console.nextInt();
						int size = console.nextInt();
						String color = console.next();
						Armor ar = new Armor(name, productID, quantityInStock, unitPrice, shieldLevel, size, color);
						grocery.add(ar);
						break;
					case 4:
						System.out.printf("Name of Weapon: ");
						System.out.printf("Product ID: ");
						System.out.printf("Stock/s: ");
						System.out.printf("Price: ");
						System.out.printf("Damage Level: ");
						System.out.printf("Capabilities: ");
						System.out.printf("Types: ");
						name = console.next();
						productID = console.next();
						quantityInStock = console.nextInt();
						unitPrice = console.nextDouble();
						String capabilities = console.next();
						int damageLevel = console.nextInt();
						String types = console.next();
						Weapon wea = new Weapon(name, productID, quantityInStock, unitPrice, types, capabilities, damageLevel);
						grocery.add(wea);
					default:
						System.out.printf("Error! Choice not found!\n");
				} 	
		}
		
		public void removeItem(String prodID){
			if (grocery.size() == 0){
				System.out.printf("Nothing to be removed.\n");	
			} else{
				
				for (Item item : grocery){
					if (item.getProductID().equals(prodID)){
						grocery.remove(item);
						//int stock = item.getQuantityInStock();
						//stock--;
						break;
					}
				}
				System.out.printf("An item has been removed");
			}
			
		}

		public void clearArray(ArrayList<Item> grocery){
			if (grocery.size() == 0){
				System.out.printf("Nothing to be cleared\n");	
			} else{
		 		grocery.clear();
				System.out.printf("Array has been cleared\n");
			}
		}

}

