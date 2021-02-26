package Coches;

public class Bike extends Vehicle {
	private double frontWheels;
	private double backWheels;
	private String BrandfrontWheels;
	private String BrandbackWhells;

	
	public Bike(String plate, String brand, String color, Double frontWheels, Double backWheels, String BrandfrontWheels, String BrandbackWhells) {
		super(plate, brand, color);
		this.frontWheels=frontWheels;
		this.BrandbackWhells=BrandbackWhells;
		this.BrandfrontWheels=BrandfrontWheels;
		this.backWheels=backWheels;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Diametro DL: " + frontWheels + " Marca: " + BrandfrontWheels +"\n"+
								"Diametro TR: " + backWheels + " Marca: " + BrandbackWhells +"\n";
	}
}
