/*In a grocery store, the types of items sold are potion, food, armor, and weapon. 
Each item has product ID, name, quantity in stock, and unit price. 
The store labels each potion with its volume, key ingredients, and potion effect. 
For food items, the expiry date is monitored. 
Armor items, on the other hand, are sold in different sizes, colors, and shield levels. 
For weapon items, there are different types and capabilities. 
Aside from those, the damage level of the weapon is also known.*/
import java.time.LocalDate; // import the LocalDate class

public class Food extends Item{
	private int month, day, year;

	public Food(){
		this("Unknown", "None", 10, 99.99, 10,24,1999);
	}

	public Food(String name, String productID, int quantityInStock, double unitPrice, int month, int day, int year){
		super(name, productID, quantityInStock, unitPrice);
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setExpiryDate(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public int getDay(){
		return day;
	}

	public String toString(Food f){
		return ("Name: "+super.getName()+"Product ID: "+super.getProductID()+"Stock/s: "+super.getQuantityInStock()+"Unit Price: "+super.getUnitPrice()+
			"Expiry Date: "+f.getMonth()+f.getDay()+f.getYear());
	}

	public boolean checkExpiryDate(int month, int day, int year){
		LocalDate myObj = LocalDate.now(); // Create a date object
   		//System.out.println(myObj); // Display the current date
   		int dayN = myObj.getDayOfMonth();
   		int monthN = myObj.getMonthValue();
   		int yearN = myObj.getYear();
		if (month == monthN && day == dayN && year == yearN){
			return true;
		}
		else{
			return false;
		}
	}
}