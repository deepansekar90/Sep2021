package week3.day1;

public class InheritExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b=new BMW();
		
		b.driveVehicle();
		b.driveVehicle();
		b.enableAirBag();
		
		int airbag=b.airbag;
		
		System.out.println("Number of Airbag = " + airbag);

	}

}

