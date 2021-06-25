/*In a grocery store, the types of items sold are potion, food, armor, and weapon. 
Each item has product ID, name, quantity in stock, and unit price. 
The store labels each potion with its shieldLevel, key ingredients, and potion effect. 
For food items, the expiry date is monitored. 
Armor items, on the other hand, are sold in different sizes, colors, and shield levels. 
For weapon items, there are different types and capabilities. 
Aside from those, the damage level of the weapon is also known.*/
public class Armor extends Item{
	private int shieldLevel;
	private int size;
	private String color;

	public Armor(){
		this("Unknown", "None", 10, 99.99, 12, 9, "Blue");
	}
	public Armor(String name, String productID, int quantityInStock, double unitPrice, int shieldLevel, int size, String color){
		super(name, productID, quantityInStock, unitPrice);
		this.shieldLevel = shieldLevel;
		this.size = size;
		this.color = color;
	}

	public void setShieldLevel(int shieldLevel){
		this.shieldLevel = shieldLevel;
	}

	public int getShieldLevel(){
		return shieldLevel;
	} 

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public String toString(Armor a){
		return ("Name: "+super.getName()+"Product ID: "+super.getProductID()+"Stock/s: "+super.getQuantityInStock()+"Unit Price: "+super.getUnitPrice()+
			"Shield Level: "+a.getShieldLevel()+"Size/s:  "+a.getSize()+"Color: "+a.getColor());
	}


}