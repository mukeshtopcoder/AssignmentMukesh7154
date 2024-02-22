// Add Natural Numbers From 1 to 10.
class dowhile5{
	public static void main(String[] args){
		int a=1;
		int sum=0;
		do{
			sum=sum+a;
			a=a+1;
		}while(a<=10);
		System.out.print("Addition : "+sum);
	}
}