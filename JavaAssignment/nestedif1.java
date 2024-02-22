// Find Greater Value Among three
class nestedif1{
	public static void main(String[] args){
		int a = 24;
		int b = 98;
		int c = 67;
		if(a>b){
			if(a>c)
				System.out.print(a+" is Greater Value");
			else
				System.out.print(c+" is Greater Value");
		}else{
			if(b>c)
				System.out.print(b+" is Greater Value");
			else
				System.out.print(c+" is Greater Value");
		}
	}
}