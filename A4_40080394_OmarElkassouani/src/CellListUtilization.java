import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *Name(s) and ID(s) (Omar Elkassouani 40080394)
 *COMP249
 *Assignment # (4)
 *Due Date (04/19/20)
 *
 * @author Omar Elkassouani
 *
 */

public class CellListUtilization {

	public static void main(String[] args) {
		//attributes
		CellList list1= new CellList();
		Scanner read = null;
		long s;
		String b;
		double p;
		int y;

		try
		{
			read = new Scanner(new FileInputStream("Cell_Info.txt"));
			while (read.hasNextLine()) 
			{
				s = read.nextLong();
				b = read.next();
				p = read.nextDouble();
				y = read.nextInt();
				//contains and find method
				if (list1.contains(s) == false)
				{
					CellPhone cp = new CellPhone(b,y,p,s);
					list1.addToStart(cp);
					
				}
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("file not found.\n"
					+ "\n Program will terminate.");
			System.exit(0);
		}
		//show contents 
		list1.showContents();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("I am creating a second list that is empty ");
		CellList list2= new CellList();
		System.out.println("----------------------------------------------------------------");
		System.out.println("checking if both Lists are equal ");
		//equals
		if(list1.equals(list2)) {
			System.out.println();
			System.out.println("The lists are equal!");
		}else {
			System.out.println("The lists are not equal");
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets create a bunch of Cellphones now: ");
		System.out.println("----------------------------------------------------------------");
		CellPhone cell1 = new CellPhone("Apple", 2015 ,520.63 ,  6544567);
		CellPhone cell2 = new CellPhone("Samsung", 2019 ,750.36 ,  1568746 );
		CellPhone cell3 = new CellPhone("Huawei", 2020 , 621.45,  1954823);
		CellPhone cell4 = new CellPhone("LG",2017 , 456.23,  9854215);
		CellPhone cell5 = new CellPhone("XIAOMI", 2018 , 256.32,  5642987);
		CellPhone cell6 = new CellPhone("Google",2016 , 352.85,  7456321);
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets add all the phones to the empty list2: ");
		System.out.println("----------------------------------------------------------------");
		//add to start
		list2.addToStart(cell1);
		list2.addToStart(cell2);
		list2.addToStart(cell3);
		list2.addToStart(cell4);
		list2.addToStart(cell5);
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets show the contents of list2: ");
		System.out.println("----------------------------------------------------------------");
		//show contents
		list2.showContents();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets add cell 6 to the index 3 of list2: ");
		System.out.println("----------------------------------------------------------------");
		list2.insertAtIndex(cell6, 2);
		list2.showContents();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets replace index 4 which has cell2 by cell 6 ");
		System.out.println("----------------------------------------------------------------");
		//replace at index
		if (list2.replaceAtIndex(cell6, 4)) {
			System.out.print("Replacement was done.");
		}
		else {
			System.out.print("Replacement failed.");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets show the contents of list2: ");
		System.out.println("----------------------------------------------------------------");
		list2.showContents();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets delete cell6 from index 2 and show the content: ");
		System.out.println("----------------------------------------------------------------");
		//delete from index
		list2.deleteFromIndex(2);
		list2.showContents();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Lets delete from start and show the content: ");
		System.out.println("----------------------------------------------------------------");
		//delete from start
		if (list2.deleteFromStart()) {
			System.out.print("Deletion was done.");
		}
		else {
			System.out.print("Deletion failed.");
		}
		list2.showContents();
		
	}
    
}
