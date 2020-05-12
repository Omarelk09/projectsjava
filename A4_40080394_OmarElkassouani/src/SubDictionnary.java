import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *Name(s) and ID(s) (Omar Elkassouani 40080394)
 *COMP249
 *Assignment # (4)
 *Due Date (04/19/20)
 *
 * @author Omar Elkassouani
 *
 */
public class SubDictionnary {
	/**
	 * 
	 * @param <T> parameter of the array list 
	 * @param list Arraylist list 
	 * @return it returns the same arraylist without duplicates 
	 */
	public static <T> ArrayList<T> removeRepeating(ArrayList<T> list) 
    { 
        ArrayList<T> correctList = new ArrayList<T>(); 
        for (T item : list) { 
            if (!correctList.contains(item)) { 
                correctList.add(item); 
            } 
        } 
        return correctList; 
    } 
	public static void main(String[] args) {
		//initializing everything we need 
		ArrayList<String> Array1 = new ArrayList<String>();
		Scanner read = null;
		Scanner in = new Scanner(System.in);
		PrintWriter write = null;
		String numbers[]= {"0","1","2","3","4","5","6","7","8","9"};
		String letters[]= {"b","c","d","e","f","g","h","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		boolean containsNum = false;
		boolean containsLet = false;
		String store = null;
		char c1='A';
		try {
	    //asking for user input 
		System.out.println("write the name of the file you want to format into a subdictionnary:");
		String input = in.nextLine();
		read = new Scanner(new  FileInputStream(input));
		write = new PrintWriter(new FileOutputStream("test1.txt"));
		//while loop that parses each word and satisfies the conditions 
		while(read.hasNext()) {
			store = read.next();
			// deleting the punctuation
			store=store.replaceAll("[\\.$|,|;|!|?|:|=]", " ");
			store=store.replaceAll("'s|'m", "");
			//checks for letters
			for(int j = 0 ; j<letters.length ; j++) {
		    	containsLet=store.equalsIgnoreCase(letters[j]);
		    	if(containsLet) {
		    		break;
		    	}
		    }
			//checks for numbers
		    for(int i = 0 ; i<numbers.length ; i++) {
		    	containsNum=store.contains(numbers[i]);
		    	if(containsNum) {
		    		break;
		    	}
		    	
		    }
			if(containsNum || containsLet) {
				continue;
			}else {
				store=store.toUpperCase();
				Array1.add(store);
			}
		}
		//adds it  to the arraylist
		for(int k = 0; k < Array1.size(); k++)
		{
			write.println(Array1.get(k));
		}
		read.close();
		write.close();
		//puts it in a temporary file 
		read = new Scanner(new  FileInputStream("test1.txt"));
		write = new PrintWriter(new FileOutputStream("SubDictionary.txt"));
		Array1.clear();
		//removes any space between two words and makes them seperate 
		while(read.hasNext()) {
			store = read.next();
			//checks for letters 
			for(int j = 0 ; j<letters.length ; j++) {
		    	containsLet=store.equalsIgnoreCase(letters[j]);
		    	if(containsLet) {
		    		break;
		    	}
		    }
			//checks for numbers 
		    for(int i = 0 ; i<numbers.length ; i++) {
		    	containsNum=store.contains(numbers[i]);
		    	if(containsNum) {
		    		break;
		    	}
		    	
		    }
			if(containsNum || containsLet) {
				continue;
			}else {
				store=store.toUpperCase();
				
			}
			Array1.add(store);
		}
		//removes duplicates and sorts them by alphabetical order
		Array1=removeRepeating(Array1);
		Array1.sort(String::compareToIgnoreCase);
		write.println("The document produced this sub-dictionary, which includes " + Array1.size() + " entries.");
		write.println();
		write.println(c1);
		write.println("==");
		//checks the letters to start each specific letter section 
		for(int k = 0; k < Array1.size(); k++)
		{
			if(Array1.get(k).charAt(0)!=c1 ) {
				if(Array1.get(k).charAt(0)==++c1) {
				write.println(c1);
				write.println("==");
				}else{
					char temp=Array1.get(k).charAt(0);
					c1=temp;
					write.println(c1);
					write.println("==");
				}
			}
			
			write.println(Array1.get(k));
		}
		System.out.println("SubDictionary.txt was created");
		}
		//catch in the case of a filenotfound 
		catch(FileNotFoundException e) {
			System.out.println("File was not found");
		}
		//closes the scanner and printwriter
		finally {
			read.close();
			write.close();
		}
		
		
	}

}
