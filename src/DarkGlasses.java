//package pracadomowa;

public class DarkGlasses extends Glasses implements SunProtection{
	
	@Override
	public void getPrice() {
		price += 30;
		System.out.println("This glasses cost: " + price);
	}
	
	@Override
	protected String getBrand(){
		String Brand = "RayBan";
		return Brand;
	}
	
	@Override
	public void UVfilter(){
		System.out.println("This glasses contain UVfilter");
	}
	
	public static void main(String[] args){
		
		Glasses sunglasses = new DarkGlasses();
		System.out.println(sunglasses.getBrand());
		sunglasses.getPrice();
		System.out.println(sunglasses.getColor());
		sunglasses.UVfilter();
	}
}
