package driver;
import airplane.Airplane;
import copter.Helicopter;
import copter.Quadcopter;
import drone.AgriculturalDrone;
import drone.MAV;
import flyingvehicles.FlyingVehicles;
import rotor.Multirotor;
import uav.UAV;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20)
 * 
 * class appliance creating an Appliance object which  will be  used in our driver 
 * @author Omar Elkassouani
 */
public class Driver {
	/*The method is not going to work because polymorphism is not going to work since we are 
	 * calling the highest class so there is no overriding therefore no polymorphism so
	 * the copy constructor will create all objects using the copy constructor of FlyingVehicles
	 * which has not body so it  will only show the to string method of FlyingVehicles class 
	 */
	/**
	 * Name(s) and ID(s) (Omar Elkassouani 40080394)
     * COMP249
     * Assignment # (2)
     * Due Date (02/21/20) 
     * this is a method that creates a copy constructor to create an array of flying objects
	 * @param f array of FlyingVehicles 
	 * @return an array of FlyingVehicles 
	 */
public static FlyingVehicles[] copyFlyingObjects(FlyingVehicles[] f) {
	FlyingVehicles[] copyarray=new FlyingVehicles[f.length];
	for(int i =0 ; i<f.length ; i++ ) {
		copyarray[i]=new FlyingVehicles(f[i]);
	}
	
	return copyarray;
}

	public static void main(String[] args) {
     /**
      * creating 15 Objects 
      * @param a1 Airplane object 
      * @param a2 Airplane object 
      * @param h1 Helicopter object
      * @param h2 Helicopter object 
      * @param h3 Helicopter object 
      * @param q1 Quadcopter object
      * @param q2 Quadcopter object 
      * @param m1 Multirotor object 
      * @param m2 Multirotor object
      * @param u1 UAV object 
      * @param u2 UAV object 
      * @param u3 UAV object
      * @param mav1 MAV object 
      * @param mav2 MAV object 
      * @param agri1 AgriculturalDrone object
      * @param agri2 AgriculturalDrone object 
      * @param mav3 MAV object
      */
     Airplane a1 = new Airplane("Airbus",4000000,600);
     Airplane a2 = new Airplane("Boeing",2000000,400);
     Helicopter h1 = new Helicopter("Airbus",100000,125,5,2013,15);
     Helicopter h2 = new Helicopter("Airbus",1000000,150,6,2010,10);
     Helicopter h3 = new Helicopter(h2);
     Quadcopter q1= new Quadcopter("DJI",4000,60,5,2012,2,700);
     Quadcopter q2= new Quadcopter("Attop",40000,50,4,2017,1,500);
     Multirotor m1=new Multirotor("Attop",50000,30,5,2016,2,5);
     Multirotor m2=new Multirotor("DJI",40000,50,4,2017,1,4);
     UAV u1=new UAV(25,30000);
     UAV u2=new UAV(15,10000);
     UAV u3=new UAV(u2);
     MAV mav1=new MAV(4,7000,"Entomopter",5);
     MAV mav2=new MAV(3,2000,"Delfly",5);
     AgriculturalDrone agri1=new AgriculturalDrone(70,8000,"Dell",100);
     AgriculturalDrone agri2=new AgriculturalDrone(30,5000,"Dell",50);
     MAV mav3=new MAV(2,4000,"Entomopter",4);
/**
 *  Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (2)
 * Due Date (02/21/20) 
 * array of Flying vehicles 
 * @param factory array of FlyingVehicles 
 */
     FlyingVehicles [] factory = {a1,a2,h1,h2,h3,q1,q2,m1,m2,u1,u2,u3,mav1,mav2,agri1,agri2,mav3};
     for(int i=0 ; i<factory.length ; i++) {
    	 System.out.println(factory[i]);
     }
     System.out.println();
     if(h2.equals(h3)) {
    	 System.out.println("they are equal");	 
     }else {
    	 System.out.println("they are not equal");
     }
     System.out.println();
     if(a1.equals(h3)) {
    	 System.out.println("they are equal");	 
     }else {
    	 System.out.println("they are not equal");
     }
     System.out.println();
     /**
      * Name(s) and ID(s) (Omar Elkassouani 40080394)
      * COMP249
      * Assignment # (2)
      * Due Date (02/21/20) 
      * this is an algorithm to find the smallest and second smallest number 
      */
     double n1=0;
     double smallestnumber=Integer.MAX_VALUE;
     double secondsmallestnumber=Integer.MAX_VALUE;
     int indexnumsmallest=0;
     int indexnumsecondsmallest=0;
     String a="";
     String b="";
     for(int i=0 ; i<factory.length ; i++) {
    	 if(factory[i] instanceof Airplane){
    	 n1=((Airplane) factory[i]).getPrice();
    	 }
    	 if(factory[i] instanceof UAV){
         n1=((UAV) factory[i]).getPrice();
         }
    	 if(n1<smallestnumber) {
    		 smallestnumber=n1;
    		  a= factory[i].toString();
    		  indexnumsmallest=i;
    	 }
    	 if(n1>smallestnumber && n1<secondsmallestnumber) {
    		 secondsmallestnumber=n1;
    		  b= factory[i].toString();
    		 indexnumsecondsmallest=i;
    	 }
     }
     System.out.print("the smallest price is in index number "+ indexnumsmallest + " and it is ");
     System.out.println(a);
     System.out.println();
     System.out.print("the second smallest price is in index number "+ indexnumsecondsmallest + " and it is ");
     System.out.println(b);
     System.out.println();
     FlyingVehicles [] factorycopy =copyFlyingObjects(factory);
     
     for(int i=0 ; i<factorycopy.length ; i++) {
    	 System.out.println(factorycopy[i]);
     }
	}

}
