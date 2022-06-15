package FactoryDesignPattern;

public class FactoryObjectProvider {
	
	public MobileOs osObjectProviderBasedOnName(String osName){
		MobileOs osObject=null;
		if(osName.equalsIgnoreCase("Andriod")){
			osObject= new Andriod();
		}
		else if(osName.equalsIgnoreCase("Windows")){
			osObject= new Windows();
		}
		else if(osName.equalsIgnoreCase("IOS")){
			osObject= new Ios();
		}
		return osObject;
	}

}
