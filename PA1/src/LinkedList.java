
public class LinkedList<T> {
	private Node<T> head;
	private Node<T> current;
	public LinkedList() {
		head = current=null;
	}
	public boolean empty() {
		return head==null;
	}
	public boolean last() {
		return current.next==null;
	}
	public boolean full() {
		return false;
	}
	public void FindFirst() {
		current=head;
	}
	public void FindNext() {
		current=current.next;
	}
	public T retrive() {
		return current.data;
	}
	public void udpate(T data) {
		current.data = data;
		}
	public void remove() {
		
	}

public void SortedAdd(T contact) { 
		
		Node<T> c =new Node<T>(contact);	
		if(head==null ||((Contact)contact).compareTo( ((Contact) head.data) ) < 0) {
				c.next=head;
				head=c;	
}
		else {
		Node <T> cheacker = head;
		Node <T> tracker = null;
		while(cheacker!=null && ((Contact)contact).compareTo( ((Contact) cheacker.data) )>0 ) 
		 {
					
			tracker=cheacker;
			cheacker=cheacker.next;
			
	}
				c.next=cheacker;
				tracker.next=c;
		}		
				
	
}

		









public void search(String input){

			
			Node<T> tmp= head;
			
				while (tmp!=null) 
				{
				 if(( (Contact)tmp.data).getEmailAddress().equals(input) || ( (Contact)tmp.data).getPhoneNumber().equals(input)||
						 ( (Contact)tmp.data).getBirthday().equals(input) 
						 || ( (Contact)tmp.data).getContactName() .equals(input)|| ( (Contact)tmp.data).getAddress().equals(input))
					 
						 ((Contact)tmp.data).PrintContactInfo();
						 tmp=tmp.next;  
			
			}
			
			

}

public void deleteContact( ) {
	

                Node<T> temp = head;
                while(temp.next != current) {
                	temp=temp.next;
                }
                temp.next = current.next;
                	
                	
              	
                	
                	
}	
	
	
	
	
	
	
	
	
	
	
	public void display() {
		Node<T> temp=head;
		 while (temp.next!=null) {
			 T x = temp.data;
		((Contact)x).PrintContactInfo();
		temp=temp.next;}
	}
	/*
	public void printBy1stNme(String Fname, LinkedList<T>l1) {
	
		if(l1.empty()) {
			System.out.println("empty list");
			return;
		}
		Node <T> temp = head;
		while(temp!=null) {
			if(   Fname.equalsIgnoreCase(((Contact)temp.data).getContact1STname())   )
					((Contact)temp.data).PrintContactInfo();
			temp=temp.next;
		}
		
	}*/
}

//method to search for event based on 2 criteria title or contact name
//delete-->لازم نخليها تحذف event



