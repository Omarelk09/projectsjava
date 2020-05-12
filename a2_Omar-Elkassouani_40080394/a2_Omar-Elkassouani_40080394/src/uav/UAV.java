package uav;
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
public class UAV extends FlyingVehicles {
	/**
	 * @param weight double for the weight 
	 * @param price double for the price 
	 */
	private double weight;
	private double price;
	/**
	 * constructor 
	 */
	public  UAV() {
		weight=0;
		price=0;
	}
	/**
	 * parameterized constructor 
	 * @param w double for the weight 
	 * @param p double for the price 
	 */
	public UAV(double w,double p ) {
		weight=w;
		price=p;
	}
	/**
	 * copy constructor 
	 * @param u UAV object 
	 */
	public UAV(UAV u ) {
		weight=u.weight;
		price=u.price;
	}
	/**
	 * accessor 
	 * @return double weight 
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * mutator 
	 * @param weight double for the weight 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * accessor 
	 * @return double price 
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * mutator 
	 * @param price double for the price 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * equals that checks if the two objects are equal 
	 * @param u UAV object 
	 * @return boolean 
	 */
	public boolean equals(UAV u) {
		if (u == null || this.getClass()!=u.getClass() )
			return false;
		else
		return(this.weight==u.weight && this.price==u.price);
	}
	/**
	 * toString method 
	 */
	public String toString() {
		return"This Unmanned aerial vehicle weights " + this.weight + " and has a price of " + this.price + " $ .";
	}
}
