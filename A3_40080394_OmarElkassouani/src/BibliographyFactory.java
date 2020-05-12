import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.NoSuchElementException;
/**
 * Name(s) and ID(s) (Omar Elkassouani 40080394)
 * COMP249
 * Assignment # (3)
 * Due Date (03/20/20)
 * 
 * class BibligraphyFactory creating a program that gives you the content in the json file in IEEE ACM and NJ form  
 * @author Omar Elkassouani
 */
public class BibliographyFactory {
	public static void displayFile(BufferedReader br) throws IOException {
		int x;
		x=br.read();
		while(x!=-1) {
			
			System.out.print((char)x);
			x=br.read();
		}
		br.close();
	}
	/**
	 * method that creates the NJ files 
	 * @param sc Scanner that reads the file content 
	 * @param pw PrintWriter that prints in a specific file
	 * @throws FileNotFoundException exception that is thrown when the file is not found 
	 * @throws IOException exception that is thrown when there is a problem with file and it is invalid for some
	 * @throws NoSuchElementException exception that is thrown when the file has an empty bracket and is therefore invalid 
	 */
public static void NJ(Scanner sc , PrintWriter pw) throws FileNotFoundException , IOException , NoSuchElementException {
	
	sc.useDelimiter("(\\{|\\})+");
	
	sc.next();
		while(sc.hasNextLine()) {
	
	sc.next();
	String author = sc.next();
	String author2 = author.replace("and", "&");
	sc.next();
	String journal= sc.next();
	sc.next();
	String title= sc.next();
	sc.next();
	String year= sc.next();
	sc.next();
	String volume= sc.next();
	sc.next();
	String number= sc.next();
	sc.next();
	String pages= sc.next();
	sc.next();
	String keyword= sc.next();
	sc.next();
	String DOI= sc.next();
	sc.next();
	String ISSN= sc.next();
	sc.next();
	String month= sc.next();
	String last =sc.next();
	String last1 =sc.next();
	if(author==null || journal==null || title==null || year==null || volume==null || number==null || pages==null || keyword==null || DOI==null || ISSN==null || month==null) {
		throw new IOException();
	}
	pw.println(author2+". "+ title + ". " + journal + ". " + volume + ", " + pages + "(" + year + ")" + " . ");
	pw.println();
		}
	sc.close();
	pw.close();
}
/**
 * method that creates the ACM files
 * @param sc Scanner that reads the file content 
 * @param pw PrintWriter that prints in a specific file
 * @throws FileNotFoundException exception that is thrown when the file is not found 
 * @throws IOException exception that is thrown when there is a problem with file and it is invalid for some
 * @throws NoSuchElementException exception that is thrown when the file has an empty bracket and is therefore invalid 
 */
public static void ACM(Scanner sc , PrintWriter pw)throws FileNotFoundException , IOException , NoSuchElementException{
    int i=1;
	
	sc.next();
		while(sc.hasNextLine()) {
	sc.useDelimiter("(\\{|\\}| and )+");
	sc.next();
	String author = sc.next();
	sc.nextLine();
	sc.useDelimiter("(\\{|\\})+");
	sc.next();
	String journal= sc.next();
	sc.next();
	String title= sc.next();
	sc.next();
	String year= sc.next();
	sc.next();
	String volume= sc.next();
	sc.next();
	String number= sc.next();
	sc.next();
	String pages= sc.next();
	sc.next();
	String keyword= sc.next();
	sc.next();
	String DOI= sc.next();
	sc.next();
	String ISSN= sc.next();
	sc.next();
	String month= sc.next();
	String last =sc.next();
	String last1 =sc.next();
	if(author==null || journal==null || title==null || year==null || volume==null || number==null || pages==null || keyword==null || DOI==null || ISSN==null || month==null) {
		throw new IOException();
	}
	pw.println("["+ (i++) +"]" + "    " + author +" et al . "+ year + ". " + title + ". " + journal + ". " + volume + ", " + number + " ("+ year + "), " + pages +". DOI:https://doi.org/" + DOI + ".");
	pw.println();
		}
	sc.close();
	pw.close();
}
/**
 * method that creates the IEEE files
 * @param sc Scanner that reads the file content 
 * @param pw PrintWriter that prints in a specific file
 * @throws FileNotFoundException exception that is thrown when the file is not found 
 * @throws IOException exception that is thrown when there is a problem with file and it is invalid for some
 * @throws NoSuchElementException exception that is thrown when the file has an empty bracket and is therefore invalid 
 */
public static void IEEE(Scanner sc , PrintWriter pw) throws FileNotFoundException , IOException , NoSuchElementException {
sc.useDelimiter("(\\{|\\})+");
	
	sc.next();
		while(sc.hasNextLine()) {
	
	sc.next();
	String author = sc.next();
	String author2 = author.replace("and",",");
	sc.next();
	String journal= sc.next();
	sc.next();
	String title= sc.next();
	sc.next();
	String year= sc.next();
	sc.next();
	String volume= sc.next();
	sc.next();
	String number= sc.next();
	sc.next();
	String pages= sc.next();
	sc.next();
	String keyword= sc.next();
	sc.next();
	String DOI= sc.next();
	sc.next();
	String ISSN= sc.next();
	sc.next();
	String month= sc.next();
	String last =sc.next();
	String last1 =sc.next();
	if(author==null || journal==null || title==null || year==null || volume==null || number==null || pages==null || keyword==null || DOI==null || ISSN==null || month==null) {
		throw new IOException();
	}
	pw.println(author2+". \""+ title + "\", " + journal + ", vol. " + volume + ", no. " + number + ", p. " + pages + ", " + month + " " + year + ".");
	pw.println();
		}
	sc.close();
	pw.close();
}

	public static void main(String[] args) {
		/**
	     * @param br Buffered reader that reads the file content 
         * @param sc Scanner that reads the file content 
	     * @param pw PrintWriter that prints in a specific file
         * @param f1 file number 1
	     * @param f2 file number 2
		 */
		BufferedReader br=null;
		Scanner sc=null;
		PrintWriter pw=null;
		File f1= null;
		File f2= null;
		File f3= null;
		for(int i=1 ; i<=10 ; i++)  {
			System.out.println("here is the documents extracted from Latex"+i+".bib :");
			//creating the IEEE files
		try {
			f1= new File("Latex"+i+".bib");
			 f2= new File("IEEE"+i+".json");
			 sc = new Scanner(new FileInputStream(f1));
			 pw = new PrintWriter(new FileOutputStream(f2));
			
		IEEE(sc,pw);
		 if(f2.isFile()) {	 
				System.out.println("IEEE"+i+".json created");
				 }else {
					 throw new FileNotFoundException() ; 
				 }
		
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not open input file Latex"+i+".bib for reading . /n"
					+ "/n"
					+ "Please check if file exists! Program will terminate after closing any opened files ");
		}
		catch (NoSuchElementException e) {
			
			System.out.println("Invalid file the IEEE"+i+".json could not be created");
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		}
		catch (IOException e) {
			System.out.println("Invalid file the IEEE"+i+".json could not be created");
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		}
		//creating the NJ files
		try {
			 f1= new File("Latex"+i+".bib");
			 f2= new File("NJ"+i+".json");
			 sc = new Scanner(new FileInputStream(f1));
			 pw = new PrintWriter(new FileOutputStream(f2));
			
			
		NJ(sc,pw);
		 if(f2.isFile()) {	 
		System.out.println("NJ"+i+".json created");
		 }else {
			 throw new FileNotFoundException() ; 
		 }
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not open input file Latex"+i+".bib for reading . /n"
					+ "/n"
					+ "Please check if file exists! Program will terminate after closing any opened files ");
		}
		catch (NoSuchElementException e) {
			System.out.println("Invalid file the NJ"+i+".json could not be created");
			
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		}
		catch (IOException e) {
			System.out.println("Invalid file the NJ"+i+".json could not be created");
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		}
		//creating the ACM files
		try {
			 f1= new File("Latex"+i+".bib");
			 f2= new File("ACM"+i+".json");
			 sc = new Scanner(new FileInputStream(f1));
			 pw = new PrintWriter(new FileOutputStream(f2));
			 
		ACM(sc,pw);
		if(f2.isFile()) {
		System.out.println("ACM"+i+".json created.");
		}
		else {
			throw new FileNotFoundException() ;
		}
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not open input file Latex"+i+".bib for reading . /n"
					+ "/n"
					+ "Please check if file exists! Program will terminate after closing any opened files ");
		}
		catch (NoSuchElementException e) {
			
			
			System.out.println("Invalid file the ACM"+i+".json could not be created");
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		}
		catch (IOException e) {
			System.out.println("Invalid file the ACM"+i+".json could not be created");
			sc.close();
			pw.close();
			if(f2.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("File was not deleted");
			}
		
		}
		finally {
			System.out.println("-------------------------------------------------------------");
		}

		}
		//asking for a file to display and exiting if its wrong twice
		int j =0;
		Scanner kb = null;
		String s=null;
		try {
		kb = new Scanner(System.in);
		System.out.println("Please enter a valid file name to display from the ones that were created :");
		 s= kb.nextLine();
		br = new BufferedReader(new FileReader(s));
		displayFile(br);
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File Not Found ");
			
			System.out.println("You have one more chance to enter a valid file so enter the file name:");
			s=kb.nextLine();
			try {
			br = new BufferedReader(new FileReader(s));
			displayFile(br);
			}
			catch (FileNotFoundException e1) {
				
				System.out.println("File Not Found ");
			
			System.out.println("Wasted chances program terminates.");
			System.exit(0);
			}
            catch (IOException e1) {
				
				System.out.println("File Not Found ");
			
			System.out.println("Wasted chances program terminates.");
			System.exit(0);
			}
		}
			catch (IOException e) {
				
					System.out.println("Invalid file ");
					
					System.out.println("You have one more chance to enter a valid file so enter the file name:");
					s=kb.nextLine();
					try {
						br = new BufferedReader(new FileReader(s));
						displayFile(br);
						}
						catch (FileNotFoundException e1) {
							
							System.out.println("Ivalid file");
						
						System.out.println("Wasted chances program terminates.");
						System.exit(0);
						}
			            catch (IOException e1) {
							
							System.out.println("Invalid file ");
						
						System.out.println("Wasted chances program terminates.");
						System.exit(0);
						}
				
			}
		
		}
	}


