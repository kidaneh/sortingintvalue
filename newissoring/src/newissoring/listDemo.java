package newissoring;

//Returns true if the list is in sorted order otherwise returns false

class ListNode
	{
	public int data;
	public ListNode next;
	
	public ListNode()
	{
	this(0, null);
	}
	public ListNode(int data)
	{
	  this(data, null);
	}
	public ListNode(int data, ListNode next)
	{
	this.data=data;
	this.next=next;
	}
	}

	class LinkedIntList
	{
	private ListNode front;
	public String tostring()
	{
	if (front==null)
	{
	return "[]";
	}
	else
	{
	String result="[" + front.data;
	ListNode current=front.next;
	while(current !=null){
	result +="," +current.data;
	current=current.next;
	}
	result+="]";

	return result;
	}
	}


	public void add (int value)
	{
	if (front==null)
	{
	front=new ListNode(value);
	}else{
	ListNode current=front;
	while(current.next !=null)
	{
	current=current.next;
	}
	current.next=new ListNode(value);
	}
	}

	public int indexOf(int value)
	{
	int index=0;
	ListNode current=front;
	while(current !=null)
	{
	if (current.data==value)
	{
	return index;
	}
	index= index +1;
	current =current.next;
	}

	System.out.println("The number" + value + "is not found in the list.");
	return -1;
	}

	public boolean issorted()
	{
	if (front==null)
	{
	return true;
	}
	else
	{
	ListNode prev=front;
	ListNode current = front.next;
	while (current !=null)
	{
	if (prev.data<=current.data)
	{
	prev=current;
	current=current.next;
	}
	else
	{
	return false;
	}
	}
	return true;
	}
	}
	}
	public class listDemo
	{
		public static void main(String[] args)
		{
	LinkedIntList  l1= new LinkedIntList();
	l1.add(100);
	l1.add(101);
	l1.add(102);
	l1.add(103);
	l1.add(104);
	if (l1.issorted())
	System.out.print("List Sorted");
	else
	System.out.print("Not sorted");
	}
	}
