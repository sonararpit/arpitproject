package javapratices;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler t = new TwoWheeler();
		t.running();
		System.out.println(t.color);
		t.twoWheelerGearChangingMachnism();
	}

	String manufacturer;
	String munufacturingDate;
	String color;
	String speed;

	public void running() {

		System.out.println("Vehicles are running very fast");

	}

}

class TwoWheeler extends Vehicle {

	public void twoWheelerGearChangingMachnism() {
		System.out.println("change gear by foot");
	}

}

class FourWheeler extends Vehicle {

}

class BajajTwoWheelers extends TwoWheeler {

}


