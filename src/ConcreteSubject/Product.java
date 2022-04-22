package ConcreteSubject;

import BaseObserver.Observer;
import BaseSubject.Subject;

import java.util.ArrayList;

public class Product implements Subject
{
		private ArrayList<Observer> observers = new ArrayList<>();
		private String productName;
		private String productType;
		private String productPrice;
		//important tag to work upon
		private String availability;

		public Product( String productName, String productType, String productPrice, String availability )
		{
				super();
				this.productName = productName;
				this.productType = productType;
				this.productPrice = productPrice;
				this.availability = availability;
		}

		public ArrayList<Observer> getObservers()
		{
				return observers;
		}

		public void setObservers( ArrayList<Observer> observers )
		{
				this.observers = observers;
		}

		public String getProductName()
		{
				return productName;
		}

		public void setProductName( String productName )
		{
				this.productName = productName;
		}

		public String getProductType()
		{
				return productType;
		}

		public void setProductType( String productType )
		{
				this.productType = productType;
		}

		public String getProductPrice()
		{
				return productPrice;
		}

		public void setProductPrice( String productPrice )
		{
				this.productPrice = productPrice;
		}

		public String getAvailability()
		{
				return availability;
		}

		public void setAvailability( String availability )
		{
				this.availability = availability;
				System.out.println("Availability changed now");
				//notifyObservers();
		}

		@Override
		public void registerObserver( Observer observer )
		{
				observers.add(observer);

		}

		@Override
		public void removeObserver( Observer observer )
		{
				observers.remove(observer);

		}

		@Override
		public void notifyObservers()
		{
				System.out.println("Product Name :"
				                + this.getProductName() + ", Product Type : " + this.productType + ", product Price : "
				                + this.productPrice + " It's availability has changed .So notifying all the users ");
				System.out.println();
				for( Observer observer : observers )
				{
						observer.update(this.availability);
				}

		}
}
