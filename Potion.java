
/*In a grocery store, the types of items sold are potion, food, armor, and weapon. 
Each item has product ID, name, quantity in stock, and unit price. 
The store labels each potion with its volume, key ingredients, and potion effect. 
For food items, the expiry date is monitored. 
Armor items, on the other hand, are sold in different sizes, colors, and shield levels. 
For weapon items, there are different types and capabilities. 
Aside from those, the damage level of the weapon is also known.*/
class Potion extends Item{
	private int volume;
	private String keyIngredients;
	private String potionEffect;

	public Potion(String name, String productID, int quantityInStock, double unitPrice, int volume, String keyIngredients, String potionEffect){
		super(name, productID, quantityInStock, unitPrice);
		this.volume = volume;
		this.keyIngredients = keyIngredients;
		this.potionEffect = potionEffect;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public int getVolume(){
		return volume;
	} 

	public void setKeyIngredients(String keyIngredients){
		this.keyIngredients = keyIngredients;
	}

	public String getKeyIngredients(){
		return keyIngredients;
	}

	public void setPotionEffect(String potionEffect){
		this.potionEffect = potionEffect;
	}

	public String getPotionEffect(){
		return potionEffect;
	}


	public String toString(Potion p){
		return ("Name: "+super.getName()+"Product ID: "+super.getProductID()+"Stock/s: "+super.getQuantityInStock()+"Unit Price: "+super.getUnitPrice()+
			"Volume: "+p.getVolume()+"Key Ingredients: "+p.getKeyIngredients()+"Potion Effect: "+p.getPotionEffect());
	}


}