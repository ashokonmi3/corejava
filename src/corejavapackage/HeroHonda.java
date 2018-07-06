package corejavapackage;

public class HeroHonda extends Bike {

	@Override
	public void engine() {
System.out.println("Bikes have engines");
		
	}

	@Override
	public void wheels() {
System.out.println("Bike have wheel");
		
	}
	
	public static void main(String[] args) {
		
		HeroHonda objHH= new HeroHonda();
		objHH.engine();
		objHH.wheels();
		objHH.seat();
		objHH.handle();
		
		
		
	}
	
	

}
