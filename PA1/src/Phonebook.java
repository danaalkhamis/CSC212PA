import java.util.Scanner;
public class Phonebook {
public static void main(String[] args) {
		
		LinkedList<Contact> contact = new LinkedList<Contact>();
		Scanner input = new Scanner(System.in ) ; 
		char choice;
		System.out.println("Welcome to the Linked Tree Phonebook");
		do{
			System.out.println("Please choose an option:");
			System.out.println("1. Add a contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Delete a contact ");
			System.out.println("4. Schedule an event ");
			System.out.println("5. Print event details ");
			System.out.println("6. Print contacts by first name ");
			System.out.println("7. Print all events alphabetically ");
			System.out.println("8. Exit ");
			System.out.println("Enter your choice: ");
			 

			
			 choice =input.next().charAt(0) ;
			switch( choice ){
			case '1' :
				
			Contact c = new Contact();
			c.ReadData();
			/*if(contact.empty()) {
				contact.SortedAdd(c);
				System.out.println("Contact added successfully!");
				return ;
			}
			else {
				
				contact.FindFirst();
			while(!contact.last()) {
			if( ( contact.retrive().getContactName().equalsIgnoreCase(c.getContactName()) ) ||( contact.retrive().getPhoneNumber().equalsIgnoreCase(c.getPhoneNumber()))  )	
			return;
			contact.FindNext();
			}
			if( ( contact.retrive().getContactName().equalsIgnoreCase(c.getContactName()) ) ||( contact.retrive().getPhoneNumber().equalsIgnoreCase(c.getPhoneNumber()))  )	
				return;*/
			
			
			contact.SortedAdd(c);
			System.out.println("Contact added successfully!");
			//}	
				
			break ;
			
			case '2' :
			
				System.out.println("Enter search criteria:");
				System.out.println("1. Name ");
				System.out.println("2. Phone Number");
				System.out.println("3. Email Address");
				System.out.println(" 4. Address ");
				System.out.println( "5. Birthday");
				System.out.println("Enter your choice: ");
				char criteria =input.next().charAt(0) ;
				if(contact.empty()) {
					System.out.println("Contact Not Found!");
				    return;}
					
				switch(criteria) {
				case'1':
					System.out.println("Enter the contact's name:");
					String name= input.nextLine();
					contact.search(name);
							
				break;
				case'2':
					System.out.println("Enter the contact's  Phone Number:");
					String number= input.nextLine();
					contact.search(number);
						
				break;
				case'3':
					System.out.println("Enter the contact's Email Address:");
					String Eadress= input.nextLine();	
					contact.search(Eadress);

					
						
				break;
				case'4':
					System.out.println("Enter the contact's Address:");
					String adress= input.nextLine();	
					contact.search(adress);	
				break;
				case'5':
					System.out.println("Enter the contact's Address:");
					String birthday= input.nextLine();
					contact.search(birthday);
				break;
				}
			
			break ;
			
			case '3' :
				System.out.println("Enter the contact's :");
			break ;
			
			case '4' :
			/*System.out.println("Enter event title:");
				String title=input.nextLine();
				System.out.println("Enter contact name:");
				String Contactname=input.nextLine();
				System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
				String dateTime=input.nextLine();
				System.out.println("Enter event location:");
				String location=input.nextLine();
				
				contact.FindFirst();
				while(!contact.last()) {
				if( ( !contact.retrive().getContactName().equalsIgnoreCase(Contactname) ) ){
				System.out.println("Contact Not Found!");	
				return;
				}//End of if
				contact.FindNext();
				
				if( ( !contact.retrive().getContactName().equalsIgnoreCase(Contactname) ) ) {
					System.out.println("Contact Not Found!");
					return;
					}//end of if
				}//End of while*/
				
				
				
				
			
			break ;
			
			case '5' :
				System.out.println("Enter search criteria:");
				System.out.println("1. contact name ");
				System.out.println("2. Event tittle");
				System.out.println("Enter your choice: ");
				  criteria =input.next().charAt(0) ;
					switch(criteria) {
					case'1':
						/*System.out.println("Enter the contact's name:");
						String name= input.nextLine();	
						*/	
					break;
					case'2':
						/*System.out.println("Enter the Event tittle");
						String title= input.nextLine();	
						*/	
					break;
					}
				
			break ;
			
			case '6' :
				System.out.println("Enter the first name");
				String name= input.next();
				if(contact.empty()) {
					System.out.println("empty list");
					return;
				}
				contact.FindFirst();
				while(!contact.last()) {
					if(   name.equalsIgnoreCase(contact.retrive().getContact1STname())     )
							contact.retrive().PrintContactInfo();
					contact.FindNext();
				}
					
			break ;
			
			case '7' :
				
			break ;
		
			}// end switch
			}while(choice!='8') ;
			System.out.println("Goodbay ");
			


		
		
		
		
		
		
		
		
	}

}

// schedule event اتوقع انها بكلاس لينكد ليست- لازم اتأكد ان جهة الاتصال موجود ومافي تعارض
//method printing all contact share an even or contact share first name



