// -----------------------------------------------------
// Assignment (1)
// Written by: (Omar Elkassouani,40080394)
// ------------------------------------

import java.util.Scanner;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (1)
 * Due Date (01/31/20)
 * 
 * class appliance creating an Appliance object which  will be  used in our driver 
 * @author Omar Elkassouani
 */
public class Appliance {
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * @param type type is a string that describes the type of the appliance
	 * @param brand brand is a string that describes the brand of the appliance 
	 * @param counter counter is the static variable that sets the serial number to start at 1000000
	 * @param serialNumber serial number is the long variable that keeps incrementing after each added item 
	 * @param price price is the variable that describes the price of the appliance
	 * @param count1 count1 is the static variable that keeps incrementing when a password is wrong 
	 * @param count2 count2 is the static variable that changes to 3 when count 1 is a multiple of 3 and changes back to 4 at the display of the main menu
	 */
	// variables 
	private String type;
	private String brand;
	private static int counter =1000000;
	private long serialNumber;
	private double price;
	public static int count1 = 0;
	public static int count2=0;
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this is the default constructor that constructs the appliance in the case where we did not choose the parameters 
	 */
	//default constructor 
	public Appliance() {
		type=null;
		brand=null;
		serialNumber=counter++;
		price=0;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this is the constructor that constructs the appliance using type brand and price as parameters 
	 * @param t type of the appliance 
	 * @param b brand of the appliance 
	 * @param p price of the appliance 
	 */
	//constructor
	public Appliance(String t, String b , double p) {
		type=t;
		brand=b;
		serialNumber=counter++;
		price=p;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * type accessor that gets the type
	 * @return type
	 */
	//type accessor
	public String getType() {
		return type;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * brand accessor that gets the brand 
	 * @return brand 
	 */
	//brand accessor 
	public String getBrand() {
		return brand;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * price accessor that gets the price 
	 * @return price
	 * 
	 */
	//price accessor 
	public double getPrice() {
		return price;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * type mutator that sets the type
	 * @param t type String 
	 */
	//type mutator 
	public void setType(String t) {
		type=t;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * brand mutator that sets the brand
	 * @param b brand String 
	 */
	//brand mutator 
	public void setBrand(String b) {
		brand=b;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * price mutator that sets the price
	 * @param p price double
	 */
	//price mutator
	public void setPrice(double p) {
		price=p;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * toString method that prints the appliance information
	 * @return String 
	 */
	//toString method that return the information of the appliance objects
	public  String toString() {
		return "this "+ this.getType() +" from "+ this.getBrand() + " has a serial number of "+
				this.serialNumber + " and a price of " + this.getPrice();
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this method find the number of created items by subtracting the serial number of the appliance object from the first serial number 
	 * @param a an appliance object 
	 * @return long
	 */
	//method that subtracts the serial number of the specific object from the general serial number 
	public long findNumberOfCreatedAppliances(Appliance a) {
		long number=a.serialNumber-1000000;
		return number;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this method is to compare between two objects and returns true if they equal and false otherwise 
	 * it compares each variable separately and connects them with ands 
	 * @param a an appliance object 
	 * @return boolean
	 */
	//method that checks if two appliance objects are equal and returns a boolean 
	public boolean equals(Appliance a) {
		return (this.brand==a.brand && this.price==a.price && this.type==a.type);
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this method returns the main menu and returns an integer b so we can use it to check the switch statement 
	 * @return integer 
	 */
	//method that displays the main menu and returns an integer 
	public static int mainMenu() {
		Scanner inM = new Scanner(System.in);
		//main menun text 
		System.out.println("What do you want to do?\r\n" + 
				"1. Enter new appliances (password required)\r\n" + 
				"2. Change information of an appliance (password required)\r\n" + 
				"3. Display all appliances by a specific brand\r\n" + 
				"4. Display all appliances under a certain a price.\r\n" + 
				"5. Quit\r\n" + 
				"Please enter your choice >");
		//input 
		int b= inM.nextInt();

		return b;
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this is a method that for loops an entire array of appliances to check if one of them has a brand name that matches the one typed  on the input 
	 * @param p p is an array of appliances  
	 */
	//method that scans all objects ignores null and displays all objects that have the same brand name as the input 
	public static void displayBrandNames(Appliance [] p) {
		//scanner 
		Scanner inB = new Scanner(System.in);
		System.out.println("you may enter a brand name :");
		//input
		String e = inB.next();
		System.out.println("these are the items that have a similar brand name:");
		System.out.println();
		//for loop that scans all appliance objects and only display the similar ones to the input 
		for(int i =0 ; i<p.length ; i++ ) {
			if(p[i]==null) {
				continue;
			}
			if (p[i].getBrand().compareTo(e)==0) {
				String display = p[i].toString();
				System.out.println(display);
			}
		}

	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this method scans an array of appliances to find all appliance objects that are under a certain price it also proceeds to display them 
	 * @param p p is an array of appliances
	 */
	//method that checks if an appliance object has a price lower than the input and displays it if it does 
	public static void findCheaperThan(Appliance [] p) {
		Scanner inf = new Scanner (System.in);
		System.out.println("you may enter a price :");
		double f = inf.nextDouble();
		System.out.println("these are the items that have a smaller value than the price entered:");
		System.out.println();
		//for loop that scans the entire array to check the price of each object and displays it if it is lower 
		for(int i =0 ; i<p.length ; i++ ) {
			if(p[i]==null) {
				continue;
			}
			if (p[i].getPrice()<f) {
				String display = p[i].toString();
				System.out.println(display);
			}
		}
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * 
	 * this is a method that updates the items it has four options using if statements
	 * option 1 changes the brand using setters
	 * option 2 changes the types using setters and checking that that type is already existing using while loops
	 * option 3 changes the price using setters 
	 * method repeats until 4 is typed using while loops
	 * option 4 exits the method
	 * @param p p is an array of appliances 
	 */
	// method that updates the item using mutators that has for options 
	public static void updateItem(Appliance[] p) {
		Scanner inU = new Scanner(System.in);
		System.out.println("enter the serial number of the item you want to modify : ");
		//input for the serial number of the item we want to change 
		long s = inU.nextLong();
		//for loop that scans the entire array looking for the item with that specific serial number ignores null
		for(int i=0 ; i<p.length ; i++) {
			if(p[i]==null) {
				continue;
			}
			//displays the information of the item with that serial number 
			if(s==p[i].serialNumber) {
				System.out.println("here is the item you were looking for: ");
				System.out.println("Appliance Serial # "+ p[i].serialNumber +" (where "+ p[i].serialNumber + " is the serial number)\r\n" + 
						"Brand: "+ p[i].brand+ "\r\n" + 
						"Type: "+p[i].type+"\r\n" + 
						"Price: "+p[i].price);
				System.out.println();
				System.out.println("What information would you like to\r\n" + 
						"change?\r\n" + 
						"1. brand\r\n" + 
						"2. type\r\n" + 
						"3. price\r\n" + 
						"4. Quit\r\n" + 
						"Enter your choice >");
				//input to choose the input 
				int num = inU.nextInt();
				//while loop that makes sure you enter a value between 1 and 4
				while(num>4 || num<1) {
					System.out.println("Wrong input please choose one of the four options available: ");
					num=inU.nextInt();
				}
				//while loop that make sit repeat until you enter 4
				while(num!=4) {
					//option 1 changes brand 
					if(num==1) {
						System.out.println("please enter the brand name you wish to change it to: ");
						String brandChange = inU.next();
						p[i].setBrand(brandChange);
						System.out.println();
						System.out.println(p[i]);
						System.out.println("What information would you like to\r\n" + 
								"change?\r\n" + 
								"1. brand\r\n" + 
								"2. type\r\n" + 
								"3. price\r\n" + 
								"4. Quit\r\n" + 
								"Enter your choice >");
						num=inU.nextInt();
					}
					//option 2 changes type
					else if(num==2) {
						boolean exitloop=true;
						String typeChange="";
						//while loop that makes sure you enter an existing type
						do {
							System.out.println("please enter the type you wish to change it to: ");
							System.out.println("PS:(the type should already be existing in the inventory please re-enter if it is not.)");
							typeChange=inU.next();
							for(int j=0 ; j<p.length ; j++) {
								if(p[j]==null) {
									continue;
								}
								else if(typeChange.compareTo(p[j].type)==0) {
									exitloop=false;
								}
							}

						}while(exitloop);
						p[i].setType(typeChange);
						System.out.println();
						System.out.println(p[i]);
						System.out.println("What information would you like to\r\n" + 
								"change?\r\n" + 
								"1. brand\r\n" + 
								"2. type\r\n" + 
								"3. price\r\n" + 
								"4. Quit\r\n" + 
								"Enter your choice >");
						num=inU.nextInt();
					}
					//option 3 changes price
					else if(num==3) {
						System.out.println("please enter the price you wish to change it to: ");
						double priceChange= inU.nextDouble();
						p[i].setPrice(priceChange);
						System.out.println();
						System.out.println(p[i]);
						System.out.println("What information would you like to\r\n" + 
								"change?\r\n" + 
								"1. brand\r\n" + 
								"2. type\r\n" + 
								"3. price\r\n" + 
								"4. Quit\r\n" + 
								"Enter your choice >");
						num=inU.nextInt();
					}
					// ensures you enter a valid number 
					else {
						System.out.println("Enter a valid number :");
						num=inU.nextInt();
					}
				}
				//option 4 exits the main menu option 2
				if(num==4) {
					count2=3;
					break;
				}
			}

		}
	}
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
	 * COMP249
	 * Assignment # (1)
	 * Due Date (01/31/20)
	 * driver method that runs the program  
	 *  
	 * @param args args contain command line arguments
	 */
	//driver 
	public static void main(String[] args) {
		//calling the scanner 
		Scanner in = new Scanner(System.in);
        //welcome message 
		System.out.println("Welcome to the store!");
		System.out.print ("Please enter the maximum number of appliance :");
		int a = in.nextInt();
		//creating inventory which is an appliance array 
		Appliance[] inventory=new Appliance[a];
		System.out.println();
		System.out.println("Thank you! the maximum number of appliances that can be stored in the inventory will be "+a);



		int ffi=0;
		boolean q=true;
		//do while loop that keeps bringing the code back to the main menu unless the password is wrong 12 times or we pressed 5
		do {
			count2=4;
			int b=mainMenu();
			//while loop that ensures you enter a number between 1 and 5
			while(!(1<=b && b<=5)) {
				b=mainMenu();
			}
            // switch statement that controls the code 
			switch(b) {
			//option 1 of main menu 
			case 1: 
				//password
				final String password="c249";
				System.out.println("Please enter the password:");
				String c = in.next();
				//if password is wrong let the user re input the password if it is wrong three times make count 2 = 3 which redisplays 
				//the main menu by skipping the entire switch  and terminates after 12 wrong passwords
				while(c.compareTo(password)!=0) {
					System.out.println("wrong password!");
					++count1;
					System.out.println("count is "+count1);
					if(count1%3!=0) {
						c=in.next();
					}
					if(count1%12==0) {

						System.out.println("Program detected suspicious activities and will terminate immediately!"); 

						q=false;
						break;
					}
					if(count1%3==0) {

						count2=3;

						break;
					}
				}
                //if password is right 
				if(c.compareTo(password)==0) {
					count1=0;
					count2=0;
					System.out.println("how many appliances do you want to enter?");
					int z = in.nextInt();
					//while loop that checks if there is enough space for the number of objects you want to input 
					while(z>(inventory.length-ffi) || (z<1)) {
						System.out.println("I am sorry the number you entered is either invalid or ecxeeding the space available there is "+(inventory.length-ffi)+" left");
						System.out.println("please enter a valid number(enter 0 if you wish to go back to the main menu): ");
						z=in.nextInt();
						if (z==0) {
							break;
						}
					}
                    //for loops that creates the objects 
					for(int j=0 ; j<z ; j++) {

						System.out.println("please enter type of item number "+(ffi+1) +":");
						String t = in.next();
						System.out.println("please enter brand of item number "+(ffi+1) +":");
						String v = in.next();
						System.out.println("please enter price of item number "+(ffi+1) +":");
						double p =in.nextDouble();
						Appliance k = new Appliance(t,v,p);

						inventory[ffi++]=k;


					}
					//for loop that displays the objects
					for(int i=0 ; i<inventory.length ; i++) {
						System.out.println(inventory[i]); 
					}

				}
				break;
            //option 2 of the main menu 
			case 2: 
				if(count2%3==0) {



					break;

				}
				final String password1="c249";
				System.out.println("Please enter the password:");
				c = in.next();
				//if password is wrong then same as option one but does not terminate at twelve 
				while(c.compareTo(password1)!=0) {
					System.out.println("wrong password!");
					++count1;
					System.out.println("count is "+count1);
					if(count1%3!=0) {
						c=in.next();
					}
					if(count1%3==0) {

						count2=3;

						break;
					}
				}
				//if password is right apply method update item
				if(c.compareTo(password1)==0) {
					count1=0;
					count2=0;
					updateItem(inventory);
				}
				break;
            //option 3 of the main menu executes method displayBrandNames
			case 3: 
				if(count2%3==0) {



					break;
				}
				displayBrandNames(inventory);

				break;

			//option 4 of the main menu executes method findCheaperThan
			case 4: 
				if(count2%3==0) {



					break;
				}
				findCheaperThan(inventory);

				break;
            //option 5 terminates the program and displays a thank you message 
			case 5: 
				if(count2%3==0) {



					break;
				}
				System.out.println("Thank you for using this software!");

				q=false;
				break;
			}
		}while(q);

	}



}


