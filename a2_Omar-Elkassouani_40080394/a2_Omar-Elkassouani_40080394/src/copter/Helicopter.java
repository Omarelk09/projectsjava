package copter;
import airplane.Airplane;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * this is the Helicopter class 
 * @author Omar Elkassouani
 *
 */
public class Helicopter extends Airplane {
	/**
	 * @param
	 * @param
	 * @param
	 */
	private  int numberOfCylinders;
	private int creationYear;
	private int passengerCapacity;
/**
 * Constructor
 */
	public  Helicopter() {
		super();
		numberOfCylinders=0;
		creationYear=0;
		passengerCapacity=0;
		
	}
	/**
	 * Parameterized constructor 
	 * @param b String for brand
     * @param p double for price 
     * @param hP integer for horse Power 
	 * @param noc integer for number of cylinders 
	 * @param cY integer for creation year 
	 * @param pC integer for passenger capacity 
	 */
	public Helicopter(String b,double p,int hP, int noc,int cY,int pC) {
		super(b,p,hP);
		numberOfCylinders=noc;
		creationYear=cY;
		passengerCapacity=pC;
	}
	/**
	 * Copy constructor
	 * @param h Helicopter Object
	 */
	public Helicopter(Helicopter h ) {
		super(h);
		numberOfCylinders=h.numberOfCylinders;
		creationYear=h.creationYear;
		passengerCapacity=h.passengerCapacity;
	}
	/**
	 * accessor 
	 * @return numberOfCylinders
	 */
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	/**
	 * mutator
	 * @param numberOfCylinders integer for the number of cylinders 
	 */
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
	/**
	 * accessor
	 * @return creation year 
	 */
	public int getCreationYear() {
		return creationYear;
	}
	/**
	 * mutator 
	 * @param creationYear integer for the creation year 
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * accessor 
	 * @return passengerCapacity
	 */
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	/**
	 * mutator 
	 * @param passengerCapacity integer for the passenger capacity
	 */
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	/**
	 * equals method that checks if the objects are the same 
	 * @param h Helicopter Object 
	 * @return boolean 
	 */
	public boolean equals(Helicopter h) {
		if (h == null || this.getClass()!=h.getClass() )
			return false;
		else
		return(this.getBrand()==h.getBrand() && this.getPrice()==h.getPrice() && this.getHorsePower()==h.getHorsePower() 
				     && this.numberOfCylinders==h.numberOfCylinders && this.creationYear==h.creationYear 
				     && this.passengerCapacity==h.passengerCapacity);
	}
	/**
	 * toString method 
	 */
	public String toString() {
		return"This Helicopter from " + this.getBrand() + " has a price of " + this.getPrice() + " $ and a horse power of " + this.getHorsePower() 
		+ " in addition it has "+ this.numberOfCylinders + " Cylinders " + " and was created in " + this.creationYear + " it has a passenger capacity of " 
		+ this.passengerCapacity +".";
	}
}
