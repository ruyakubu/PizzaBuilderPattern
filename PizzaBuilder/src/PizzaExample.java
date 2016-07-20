
public class PizzaExample {
	
    public static void main(String args[]) {
        
        //Customize Pizza object using Builder pattern in java
        Pizza cheesePizza = new Pizza.Builder().sugar(3).butter(3.5).  eggs(5).yeast(2).flour(4.5). bakingpowder(6.75).milk(0.5).cheese(10).sauce(5).build();
     
        //Pizzas order ready
        System.out.println("Ingredident to build your Cheese Pizza...." + cheesePizza);
        
        
        Pizza pepperoniPizza = new Pizza.Builder().sugar(3).butter(3.5).  eggs(5).yeast(2).flour(4.5). bakingpowder(6.75).milk(0.5).cheese(10).sauce(5).pepperoni(50).build();
        
        //Pizzas order ready
        System.out.println("\nIngredident to build your Pepperoni Pizza...." + pepperoniPizza);
    }
}

class Pizza {
    
    //must have for crust
    private final double sugar; 
    private final double salt;
    private final double butter;  
    private final int eggs;
    private final int yeast;     
    private final double flour;   
    private final double bakingpowder; 
    private final double milk; 
    
    //optional toppings - units in cup
    private final int sauce;
    private final int pepperoni;
    private final int sausage;
    private final int cheese;
    private final int pineapple;
    private final int mushroom;
    private final int olives;
    private final int bellpeppers;

    public static class Builder {

    //all ingredients
    private double sugar; 
    private double salt;
    private double butter;  
    private int eggs;
    private int yeast;     
    private double flour;   
    private double bakingpowder; 
    private double milk; 
    private int sauce;
    private int pepperoni;
    private int sausage;
    private int cheese;
    private int pineapple;
    private int mushroom;
    private int olives;
    private int bellpeppers;

    //builder methods for setting property
     public Builder sugar(double amt)
	 {
	 this.sugar = amt; 
	 return this; 
	 } 
	public Builder salt(double amt)
	 {
	 this.salt = amt; 
	 return this; 
	 }
	public Builder butter(double amt)
	 {
	 this.sugar = amt; 
	 return this; 
	 }  
	public Builder eggs(int amt)
	 {
	 this.eggs = amt; 
	 return this; 
	 }
	public Builder yeast(int amt)
	 {
	 this.yeast = amt; 
	 return this; 
	 }     
	public Builder flour(double amt)
	 {
	 this.flour = amt; 
	 return this; 
	 }   
	public Builder bakingpowder(double amt)
	 {
	 this.sugar = amt; 
	 return this; 
	 } 
	public Builder milk(double amt)
	 {
	 this.milk = amt; 
	 return this; 
	 } 
	public Builder sauce(int amt)
	 {
	 this.sauce = amt; 
	 return this; 
	 }
	public Builder pepperoni(int amt)
	 {
	 this.pepperoni = amt; 
	 return this; 
	 }
	public Builder sausage(int amt)
	 {
	 this.sausage = amt; 
	 return this; 
	 }
	public Builder cheese(int amt)
	 {
	 this.cheese = amt; 
	 return this; 
	 }
	public Builder pineapple(int amt)
	 {
	 this.pineapple = amt; 
	 return this; 
	 }
	public Builder mushroom(int amt)
	 {
	 this.mushroom = amt; 
	 return this; 
	 }
	public Builder olives(int amt)
	 {
	 this.olives = amt; 
	 return this; 
	 }
        public Builder bellpeppers(int amt)
	 {
	 this.bellpeppers = amt; 
	 return this; 
	 }
 
     
     
        //pizza build object
        public Pizza build() {
            return new Pizza(this);
        }
    }    
    
    //private constructor enforcement
    private Pizza(Builder builder) {
        this.sugar = builder.sugar;
        this.salt = builder.salt;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.yeast = builder.yeast;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.sauce = builder.sauce;
		this.pepperoni = builder.pepperoni;
		this.sausage = builder.sausage;
		this.cheese = builder.cheese;
		this.pineapple = builder.pineapple;
		this.mushroom = builder.mushroom;
		this.olives = builder.olives;
        this.bellpeppers = builder.bellpeppers;     
    }

    @Override
    public String toString() {
        return "Pizza{" + "sugar=" + sugar + ", salt=" + salt + ", butter=" + butter + ", eggs=" + eggs + ", yeast=" + yeast + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", sauce=" + sauce + ", milk=" + milk + ", pepperoni=" + pepperoni + ", sausage=" + sausage + ", cheese=" + cheese + ", pineapple=" + pineapple + ", mushroom=" + mushroom + ", olives=" + olives + ", bellpeppers=" + bellpeppers + '}';

    }
    
}
