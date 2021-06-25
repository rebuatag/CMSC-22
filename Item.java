/*In a grocery store, the types of items sold are potion, food, armor, and weapon. 
Each item has product ID, name, quantity in stock, and unit price. 
The store labels each potion with its volume, key ingredients, and potion effect. 
For food items, the expiry date is monitored. 
Armor items, on the other hand, are sold in different sizes, colors, and shield levels. 
For weapon items, there are different types and capabilities. 
Aside from those, the damage level of the weapon is also known.*/
public class Item{
	private String name;
	private String productID;
	private int quantityInStock;
	private double unitPrice;

	public Item(String name, String productID, int quantityInStock, double unitPrice){
		this.name = name;
		this.productID = productID;
		this.quantityInStock = quantityInStock;
		this.unitPrice = unitPrice;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setProductId(String productID){
		this.productID = productID;
	}

	public String getProductID(){
		return productID;
	}

	public void setQuantityInStock(int quantityInStock){
		this.quantityInStock = quantityInStock;
	}

	public int getQuantityInStock(){
		return quantityInStock;
	}

	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public boolean checkProductID(String prodID){
		if (this.productID.equals(prodID)){
			return true;
		}return false;
	}

}