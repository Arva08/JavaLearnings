package FactoryDesignPattern;

public class Mobile {
	public static void main(String args[]){
		//Fetch the mobileOs object based on the string 
		// Advantage we can easily add a new OS class which will implements the mobile OS interface and we can add a line in FactoryObject provider class
		MobileOs mobileOs= new FactoryObjectProvider().osObjectProviderBasedOnName("andriod");
		mobileOs.spec();
		mobileOs= new FactoryObjectProvider().osObjectProviderBasedOnName("Windows");
		mobileOs.spec();
	}

}
