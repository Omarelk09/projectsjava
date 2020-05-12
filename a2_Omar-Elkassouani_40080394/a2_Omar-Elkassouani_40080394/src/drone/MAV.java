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
public class MAV extends UAV {
	/**
	 * @param String for the model
	 * @param double for the size 
	 */
	private String model;
	private double size;
	/**
	 * constructor 
	 * 
	 */
	public  MAV() {
		super();
		model=null;
		size=0;
		
	}
	/**
	 * parameterized constructor 
	 * @param w double for the weight 
	 * @param p double for the price 
	 * @param m String for the model 
	 * @param s double for the size 
	 */
	public MAV(double w,double p,String m,double s) {
		super(w,p);
		model=m;
		size=s;
	}
	/**
	 * copy constructor 
	 * @param m MAV object 
	 */
	public MAV(MAV m) {
		super(m);
		model=m.model;
		size=m.size;
	}
	/**
	 * accessor
	 * @return String model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * mutator 
	 * @param model String for the model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * accessor 
	 * @return double size 
	 */
	public double getSize() {
		return size;
	}
	/**
	 * mutator 
	 * @param size double for the size 
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * equals method that checks if the two objects are equal 
	 * @param m MAV object 
	 * @return boolean 
	 */
	public boolean equals(MAV m) {
		if (m == null || this.getClass()!=m.getClass() )
			return false;
		else
		return(this.getWeight()==m.getWeight() && this.getPrice()==m.getPrice() && this.model==m.model && this.size==m.size);
	}
	/**
	 * toString method 
	 */
	public String toString() {
		return"This Micro Air Vehicle weights " + this.getWeight() + " and has a price of " + this.getPrice() + " $ its model is " + this.model
				+ "it has a size of "+ this.size + " .";
	}
}
