// Check Number is less than 100 or between 100 to 500 or greater than 500
class nestedif5{
	public static void main(String[] args){
		int num = 346;
		if(num>100){
			if(num>500)
				System.out.print("Number is Above 500");
			else
				System.out.print("Number is between 100 and 500");
		}else
			System.out.print("Number is Below 100");
	}
}