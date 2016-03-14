//package pracadomowa;

public class Glasses extends Accessories{
	
	protected String Brand;
	
	@Override
	public void getPrice() {
		price += 20;
		System.out.println("This glasses cost: " + price);
	}

	@Override
	public String getColor(){
		color = "black";
		return color;
	}
	
	protected String getBrand(){
		return Brand;
	}
	
}