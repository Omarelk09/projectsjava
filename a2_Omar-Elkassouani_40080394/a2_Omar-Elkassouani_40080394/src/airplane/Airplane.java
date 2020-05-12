package airplane;
import flyingvehicles.FlyingVehicles;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * this is the Airplane class 
 * @author Omar Elkassouani
 *
 */
public class Airplane extends FlyingVehicles {
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
     * COMP249
     * Assignment # (2)
     * Due Date (02/21/20) 
     * @param brand String that specifies the brand 
     * @param price double that specifies the price  
     * @param horsePower integer that specifies the horse power 
	 */
private String brand;
private double price;
private int horsePower;
/**
 * Constructor 
 */
public  Airplane() {
	brand=null;
	price=0;
	horsePower=0;
}
/**
 * parameterized constructor 
 * @param b String for brand
 * @param p double for price 
 * @param hP integer for horse Power 
 */
public Airplane(String b,double p,int hP ) {
	brand=b;
	price=p;
	horsePower=hP;
}
/**
 * copy constructor 
 * @param a Airplane object 
 */
public Airplane(Airplane a ) {
	brand=a.brand;
	price=a.price;
	horsePower=a.horsePower;
}
/**
 * accessor
 * @return brand
 */
public String getBrand() {
	return brand;
}
/**
 * accesssor 
 * @return price
 */
public double getPrice() {
	return price;
}
/**
 * acccessor 
 * @return horsePower
 */
public int getHorsePower() {
	return horsePower;
}
/**
 * mutator
 * @param b String for brand 
 */
public void setBrand(String b) {
	brand=b;
}
/**
 * mutator 
 * @param p double for  price
 */
public void setPrice(double p) {
	price=p;
}
/**
 * mutator 
 * @param hP integer for horsePower 
 */
public void setHorsePower(int hP) {
	horsePower=hP;
}
/**
 * equals method that checks if the two objects are the same 
 * @param a Airplane object
 * @return boolean
 */
public boolean equals(Airplane a) {
	if (a == null || this.getClass()!=a.getClass() )
		return false;
	else

	return(this.brand==a.brand && this.price==a.price && this.horsePower==a.horsePower);
}
/**
 * toString method 
 */
public String toString() {
	return"This airplane from " + this.brand + " has a price of " + this.price + " $ and a horse power of " + this.horsePower + ".";
}
}
