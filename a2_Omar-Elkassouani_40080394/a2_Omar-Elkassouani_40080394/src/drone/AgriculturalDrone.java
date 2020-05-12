package drone;
import uav.UAV;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * this is the Airplane class 
 * @author Omar Elkassouani
 *
 */
public class AgriculturalDrone extends UAV {
	/**
	 * @param String for brand 
	 * @param integer for carry capacity
	 */
private String brand;
private int carryCapacity;
/**
 * default Constructor 
 */
public  AgriculturalDrone() {
	super();
	brand=null;
	carryCapacity=0;
	
}
/**
 * parameterized constructor
 * @param w double for weight 
 * @param p double for price 
 * @param b String for brand 
 * @param cC integer for carry capacity
 */
public AgriculturalDrone(double w,double p,String b,int cC) {
	super(w,p);
	brand=b;
	carryCapacity=cC;
}
/**
 * copy constructor 
 * @param a AgriculturalDrone Object 
 */
public AgriculturalDrone(AgriculturalDrone a) {
	super(a);
	brand=a.brand;
	carryCapacity=a.carryCapacity;
}
/**
 * accessor 
 * @return String brand 
 */
public String getBrand() {
	return brand;
}
/**
 * mutator 
 * @param brand String for the brand 
 */
public void setBrand(String brand) {
	this.brand = brand;
}
/**
 * accessor 
 * @return integer carry capacity 
 */
public int getCarryCapacity() {
	return carryCapacity;
}
/**
 * mutator 
 * @param carryCapacity integer for carry capacity 
 */
public void setCarryCapacity(int carryCapacity) {
	this.carryCapacity = carryCapacity;
}
/**
 * equals method that checks if the two objects are equal 
 * @param a AgriculturalDrone Object 
 * @return boolean 
 */
public boolean equals(AgriculturalDrone a) {
	if (a == null || this.getClass()!=a.getClass() )
		return false;
	else
	return(this.getWeight()==a.getWeight() && this.getPrice()==a.getPrice() && this.brand==a.brand && this.carryCapacity==a.carryCapacity);
}
/**
 * toString method 
 */
public String toString() {
	return"This Agricultural Drone weights " + this.getWeight() + " and has a price of " + this.getPrice() + " $ its brand is " + this.brand
			+ "it has a carry capacity of"+ this.carryCapacity + " Kg.";
}
}
