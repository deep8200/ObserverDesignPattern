import BaseObserver.Observer;
import ConcreteObseervers.Person;
import ConcreteSubject.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverPatternMain
{

		public static void main( String[] args )
		{
			/*
			here we are setting the baminton Not available-out of stock
			 */
				Product badminton = new Product(
						"Yonex Gr303",
						"Racket",
						"600Rs",
						" available");

				/*Person
			    Deep object will be created and
			    person Deep object will be registered to the subject badminton*/
				Person deep = new Person("Deep",badminton);



				/*Person
			    prayas object will be created and
			    person prayas object will be registered to the subject badminton*/
				Person prayas = new Person("prayas",badminton);


				/*
				now try getting the list of observers
				as it will be holded by Product/Subject;
				 */
				ArrayList<Observer> subscribers= badminton.getObservers();
				for( Iterator<Observer> iterator = subscribers.iterator(); iterator.hasNext(); )
                {
		                Person person = (Person) iterator.next();
		                System.out.println("This person has subscribed when their object was created : " + person.getPersonName());
                }
				System.out.println();
				System.out.println("badminton current state : "+badminton.getAvailability());
				System.out.println();
				// Let's say  product is not available now
				badminton.setAvailability(" not Available");
		}

}
