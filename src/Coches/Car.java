package Coches;

import java.util.List;

public class Car extends Vehicle {
	private double frontWheels;
	private double backWheels;
	private String BrandfrontWheels;
	private String BrandbackWhells;

	
	public Car(String plate, String brand, String color,Double frontWheels, Double backWheels, String BrandfrontWheels, String BrandbackWhells) {
		super(plate, brand, color);
		this.frontWheels=frontWheels;
		this.BrandbackWhells=BrandbackWhells;
		this.BrandfrontWheels=BrandfrontWheels;
		this.backWheels=backWheels;
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	
	public static boolean comprobarDiametro(double x, double y) {
		if((x>0.4 && x<4.0) && (y>0.4 && y<4.0)) {
			return true;
		}
		return false;
	}

	
	public static boolean comprobarMatricula(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.length() < 7) {
				a = a + " ";
			}
		}
		if (a.length() == 7) {
			for (int i = 0; i < 4; i++) {
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				} else {
					return false;
				}
			}
			for (int i = 4; i < 6; i++) {
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				} else {
					return false;
				}
			}
			if (a.charAt(6) >= 'A' && a.charAt(6) <= 'Z' || a.charAt(6) == ' ') {
				return true;
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"Diametro DL: " + frontWheels + " Marca: " + BrandfrontWheels +"\n"+
								"Diametro TR: " + backWheels + " Marca: " + BrandbackWhells +"\n";
	}
}
