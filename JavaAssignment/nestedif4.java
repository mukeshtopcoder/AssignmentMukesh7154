// Number is Divisible By 5 or 7
class nestedif4{
	public static void main(String[] args){
		int num = 35;
		if(num%5==0){
			if(num%7==0)
				System.out.print("Number is Divisible By 5 and 7");
			else
				System.out.print("Number is Divisible by 5");
		}else
			System.out.print("Number is Niether Divisible by 5 nor 7");
	}
}