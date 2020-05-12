package copter;

/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * this is the Airplane class 
 * @author Omar Elkassouani
 *
 */
public class Quadcopter extends Helicopter{
	/**
	 * @param maxFlyingSpeed integer 
	 */
	private int maxFlyingSpeed;

	/**
	 * constructor 
	 */
	public  Quadcopter() {
		super();
		maxFlyingSpeed=0;
		
	}
	/**
	 * Parameterized constructor 
	 * @param b String for brand
     * @param p double for price 
     * @param hP integer for horse Power 
	 * @param noc integer for number of cylinders 
	 * @param cY integer for creation year 
	 * @param pC integer for passenger capacity
	 * @param mfs integer for the maximum flying speed 
	 */
	public Quadcopter(String b,double p,int hP, int noc,int cY,int pC,int mfs) {
		super(b,p,hP,noc,cY,pC);
		maxFlyingSpeed=mfs;
	}
	/**
	 * 
	 * @param q Quadcopter Object 
	 */
	public Quadcopter(Quadcopter q) {
		super(q);
		maxFlyingSpeed=q.maxFlyingSpeed;
	}
	/**
	 * accessor
	 * @return integer maxFlyingSpeed 
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	/**
	 * mutator 
	 * @param mfs integer for maximum flying speed 
	 */
	public void setMaxFlyingSpeed(int mfs) {
		this.maxFlyingSpeed = mfs;
	}
	/**
	 * equals method 
	 * @param q Quadcopter Object
	 * @return boolean 
	 */
	public boolean equals(Quadcopter q) {
		if (q == null || this.getClass()!=q.getClass() )
			return false;
		else
		return(this.getBrand()==q.getBrand() && this.getPrice()==q.getPrice() && this.getHorsePower()==q.getHorsePower() 
				     && this.getNumberOfCylinders()==q.getNumberOfCylinders() && this.getCreationYear()==q.getCreationYear() 
				     && this.getPassengerCapacity()==q.getPassengerCapacity() && this.maxFlyingSpeed==q.maxFlyingSpeed);
	}
	/**
	 * toString method 
	 */
	public String toString() {
		return"This Quadcopter from " + this.getBrand() + "  has a price of " + this.getPrice() + " $ and a horse power of " + this.getHorsePower() 
		+ " in addition it has "+ this.getNumberOfCylinders() + " Cylinders " + " and was created in " + this.getCreationYear() + " it has a passenger capacity of " 
		+ this.getPassengerCapacity() +" and has a maximum speed of "+ this.maxFlyingSpeed +".";
	}
}
