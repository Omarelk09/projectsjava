package rotor;
import copter.Helicopter;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * this is the Airplane class 
 * @author Omar Elkassouani
 *
 */
public class Multirotor extends Helicopter {
	/**
	 * @param numberOfRotors integer for the number of rotors 
	 */
private int numberOfRotors;

	/**
	 * constructor 
	 */
	public  Multirotor() {
		super();
		numberOfRotors=0;
		
	}
	/**
	 * parameterized constructor 
	 * @param b String for the brand 
	 * @param p double for the price 
	 * @param hP integer for the horse power 
	 * @param noc integer for the number of cylinders 
	 * @param cY integer for the creation year 
	 * @param pC integer for the passenger capacity 
	 * @param nor integer for the number of rotors 
	 */
	public Multirotor(String b,double p,int hP, int noc,int cY,int pC,int nor) {
		super(b,p,hP,noc,cY,pC);
		numberOfRotors=nor;
	}
	/**
	 * copy constructor 
	 * @param r Multirotor object 
	 */
	public Multirotor(Multirotor r) {
		super(r);
		numberOfRotors=r.numberOfRotors;
	}
	/**
	 * accessor
	 * @return integer numberOfRotors 
	 */
	public int getNumberOfRotors() {
		return numberOfRotors;
	}
	/**
	 * accessor 
	 * @param nor integer for the number of rotors 
	 */
	public void setNumberOfRotors(int nor) {
		this.numberOfRotors = nor ;
	}
	/**
	 * equals method that checks if the two objects are equal 
	 * @param r Multirotor object 
	 * @return boolean 
	 */
	public boolean equals(Multirotor r) {
		if (r == null || this.getClass()!=r.getClass() )
			return false;
		else
		return(this.getBrand()==r.getBrand() && this.getPrice()==r.getPrice() && this.getHorsePower()==r.getHorsePower() 
				     && this.getNumberOfCylinders()==r.getNumberOfCylinders() && this.getCreationYear()==r.getCreationYear() 
				     && this.getPassengerCapacity()==r.getPassengerCapacity() && this.numberOfRotors==r.numberOfRotors);
	}
	/**
	 * toString method 
	 */
	public String toString() {
		return"This multirotor from " + this.getBrand() + "  has a price of " + this.getPrice() + " $ and a horse power of " + this.getHorsePower() 
		+ " in addition it has "+ this.getNumberOfCylinders() + " Cylinders " + " and was created in " + this.getCreationYear() + " it has a passenger capacity of " 
		+ this.getPassengerCapacity() +" and has  "+ this.numberOfRotors +" rotor blades .";
	}

}
