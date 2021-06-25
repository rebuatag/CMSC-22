/*In a grocery store, the types of items sold are potion, food, armor, and weapon. 
Each item has product ID, name, quantity in stock, and unit price. 
The store labels each potion with its volume, key ingredients, and potion effect. 
For food items, the expiry date is monitored. 
Armor items, on the other hand, are sold in different sizes, colors, and shield levels. 
For weapon items, there are different types and capabilities. 
Aside from those, the damage level of the weapon is also known.*/
public class Weapon extends Item{
	private String types;
	private String capabilities;
	private int damageLevel;

	public Weapon(){
		this("Unknown", "None", 10, 99.99, "Heavy", "N/A", 11);
	}

	public Weapon(String name, String productID, int quantityInStock, double unitPrice, String types, String capabilities, int damageLevel){
		super(name, productID, quantityInStock, unitPrice);
		this.types = types;
		this.capabilities = capabilities;
		this.damageLevel = damageLevel;
	}

	public void setTypes(String types){
		this.types = types;
	}

	public String getTypes(){
		return types;
	}

	public void setCapabilities(String capabilities){
		this.capabilities = capabilities;
	}

	public String getCapabilities(){
		return capabilities;
	}

	public void setDamageLevel(int damageLevel){
		this.damageLevel =  damageLevel;
	}

	public int getDamageLevel(){
		return damageLevel;
	}

	public String toString(Weapon w){
		return ("Name: "+super.getName()+"Product ID: "+super.getProductID()+"Stock/s: "+super.getQuantityInStock()+"Unit Price: "+super.getUnitPrice()+
			"Type/s: "+w.getTypes()+"Capabilities: "+w.getCapabilities()+"Damage Level: "+w.getDamageLevel());
	}


}