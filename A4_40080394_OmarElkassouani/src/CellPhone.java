/**
 *Name(s) and ID(s) (Omar Elkassouani 40080394)
 *COMP249
 *Assignment # (4)
 *Due Date (04/19/20)
 *
 * @author Omar Elkassouani
 *
 */

public class CellPhone {
private long serialNum;
private static long serialNumCounter=1000000;
private String brand;
private int year;
private  double price;
/**
 * Default constructor 
 */
public CellPhone() {
	brand = null;
	year = 0;
	price = 0;
	serialNum = serialNumCounter;
	serialNumCounter++;
}
/**
 * Parameterized constructor
 * @param b String brand 
 * @param y integer year
 * @param p double price 
 * @param s long serial number 
 */
public CellPhone(String b, int y, double p, long s ) {
	serialNum=s;
	brand=b;
	year=y;
	price=p;
}
/**
 * Copy constructor
 * @param c CellPhone Object
 * @param s long serial number
 */
public CellPhone(CellPhone c, long s) {
	serialNum=s;
	brand=c.brand;
	year=c.year;
	price=c.price;
}

/**
 * clone method 
 * @param s long serial number
 * @return CellPhone Object
 */
public CellPhone clone(long s) {
	return new CellPhone(this,s);
}
/**
 * getter
 * @return String brand 
 */
public String getBrand() {
	return brand;
}
/**
 * setter
 * @param brand String brand
 */
public void setBrand(String brand) {
	this.brand = brand;
}
/**
 * getter
 * @return integer year
 */
public int getYear() {
	return year;
}
/**
 * setter
 * @param year integer year
 */
public void setYear(int year) {
	this.year = year;
}
/**
 * getter
 * @return double price
 */
public double getPrice() {
	return price;
}
/**
 * setter
 * @param price double price
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * getter 
 * @return long serial number
 */
public long getSerialNum() {
	return serialNum;
}
/**
 * setter
 * @param serialNum long serial number 
 */
public void setSerialNum(long serialNum) {
	this.serialNum = serialNum;
}


/**
 * toString method
 */
	public String toString() {
	return "[" + this.serialNum + ": " + this.brand + " " + this.price + " " + this.year + "]";
}
/**
 * equals method 
 * @param c CellPhone object 
 * @return boolean
 */
public boolean equals(CellPhone c) {
	return(this.brand==c.getBrand() && this.year==c.getYear() && this.price==c.getPrice());
}

}
	
	
	
	
	
