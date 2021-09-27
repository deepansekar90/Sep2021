package week1.day2;

public class Arguments {

	public int sum() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		return sum;
	}
	
	public void printResult(int result) {
		System.out.println(" Result:" + result);
	}
	
	public static void main(String[] args) {
		
		Arguments obj = new Arguments();
		
		int sumValue = obj.sum();
		
		obj.printResult(sumValue);
	}

}