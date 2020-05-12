import java.util.NoSuchElementException;



public class CellList  {
/**
 *Name(s) and ID(s) (Omar Elkassouani 40080394)
 *COMP249
 *Assignment # (4)
 *Due Date (04/19/20)
 *
 * @author Omar Elkassouani
 *
 */
public class CellNode {
	/**
	 * attributes 
	 * @param cp CellPhone object 
	 * @param next CellNode pointer
	 */
	private CellPhone cp;
	private CellNode next;
	/**
	 * default constructor
	 */
	public CellNode() {
		cp=null;
		next=null;
	}
	
	/**
	 * copy constructor 
	 * @param c CellNode 
	 */
	public CellNode(CellNode c) {
		this.cp=c.cp;
		this.next=c.next;
	}
	/**
	 * clone method for the CellNode
	 */
	public CellNode clone() {
		return new CellNode(this);
	}
	/**
	 * Parameterized constructor 
	 * @param ph CellPhone Object 
	 * @param xt CellNode pointer 
	 */
	public CellNode(CellPhone ph, CellNode xt) {
		cp=ph;
		next=xt;
	}
	/**
	 * getter
	 * @return cp CellPhone object
	 */
	public CellPhone getCp() {
		return cp;
	}
	/**
	 * setter
	 * @param cp CellPhone Object
	 */
	public void setCp(CellPhone cp) {
		this.cp = cp;
	}
	/**
	 * getter
	 * @return next CellNode pointer
	 */
	public CellNode getNext() {
		return next;
	}
	/**
	 * setter
	 * @param next CellNode pointer 
	 */
	public void setNext(CellNode next) {
		this.next = next;
	}
	
}
/***
 * attributes
 */
private int size=0;
private CellNode head;	
/**
 * default constructor for the CellList
 */
public CellList() {
	head=null;
	size=0;
}
/**
 * Copy constructor for the CellList
 * @param c CellList
 */
public CellList(CellList c){
	if (c.head == null) 
	{
		head = null;
		size = 0;
	} 
	else
	{
		head = null;
		CellNode t1, t2;
		t1 = c.head;
		t2 = null;
		
		while(t1 != null){
			if (head == null)
			{
				t2 = new CellNode(t1.cp, null);
				size++;
			}
			else
			{
				t2.next = new CellNode(t1.cp, null);
				t2 = t2.next;
				size++;
			}
			t1 = t1.next;
		}
		t2 = null; 
	}
}
/**
 * addToStart method
 * @param cp CellPhone Object
 */
public void addToStart(CellPhone cp){
	head = new CellNode(cp, head);	     	
	size++;
}

/**
 * insertAtIndex method
 * @param c CellPhone object
 * @param i integer 
 */
public void insertAtIndex(CellPhone c, int i) {
	try 
	{
		if (i == 0)
		{
			addToStart(c);
		}
		if ( 0 < i && i <= size-1)
		{
			CellNode t = head;
			int counter = 0;
			while (t.next != null)
			{
				t = t.next;
				counter++;
				if (counter+1 == i)
				{
					t.next = new CellNode(c, t.next);
					size++;
					break;
				}
			}
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
	catch(NoSuchElementException e)
	{
		System.out.println("index invalid."
				+ "\n program will terminate .");
		System.exit(0);
	}
	
}
/**
 * deleteFromStart method
 * @return boolean
 */
public boolean deleteFromStart(){
	if (head == null) {
		return false;
	}
	CellNode t = head;
	if (t.next == null)
	{
		head = null;
		size--;
		return true;
	}
	head = t.next;
	t = null;
	size--;
	return true;
}
/**
 *deleteFromIndex method 
 * @param i integer
 */
public void deleteFromIndex(int i) {
	try 
	{
		CellNode t = head;
		if ( 0 <= i && i <= size-1)
		{
			if (i == 0)
			{
				deleteFromStart();
			}
			int counter = 0;
			while (t.next != null)
			{
				t = t.next;
				counter++;
				if (counter+1 == i)
				{
					t.next = t.next.next;
					size--;
					break;
				}
			}
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
	catch(NoSuchElementException e)
	{
		System.out.println("index invalid."
				+ "\n program will terminate .");
		System.exit(0);
	}
}
/**
 * 
 * @param c1 CellPhone object 
 * @param i integer
 * @return boolean
 */
public boolean replaceAtIndex(CellPhone c1, int i){
	if (0 <= i && i <= size-1)
	{
		CellNode t = head;
		int counter = 0;
		while (t.next != null)
		{
			t = t.next;
			counter++;
			if (counter == i)
			{
				t.cp = c1;
				return true;
			}
		}	
	}
	return false;
}
/**
 * find method 
 * @param l long
 * @return CellNode pointer
 */
public CellNode find(long l){
	CellNode t = head;
	int counter = 0;
	while (t != null && (Long.compare(t.cp.getSerialNum(), l) != 0))
	{
		t = t.next;
		counter++;
	}
	if (counter == size) {
		return null;
	}
	return t;
	
}
/**
 * contains method 
 * @param l long
 * @return boolean
 */
public boolean contains(long l){
	CellNode t = find(l);
	if (t == null) {
		return false;
	}
	return true;
}
/**
 * showContents method
 */
public void showContents()
{
	System.out.println("size of the list is " + this.size 
			+ ". Content of the list:"
			+ "\n===============================================================================");
	CellNode t = head;
	int counter = 0;
	while (t.next != null)
	{
		System.out.print(t.cp.toString() + " ---> ");
		counter++;
		if (counter%4 == 0) {
			System.out.print("\n");
		}
		t = t.next;
	}
	System.out.print(t.cp.toString() + " ---> "+"X\n");
}
/**
 * equals method
 * @param c CellList 
 * @return boolean
 */
public boolean equals(CellList c){
	CellNode t1 = head;
	CellNode t2 = c.head;
	int counter = 0;
	if (this.size != c.size) {
		return false;
	}
	while (t1.next != null && t2.next != null)
	{
		t1 = t1.next;
		t2 = t2.next;
		if (t1.cp.equals(t2.cp))
		{ 
			counter++;
			continue;
		}
		else
		{
			return false;
		}
	}
	return true;
}



}







