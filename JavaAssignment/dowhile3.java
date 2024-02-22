// Even Numbers from 1 to 20
class dowhile3{
	public static void main(String[] args){
		int a=1;
		do{
			if(a%2==0)
				System.out.println(a);
			a=a+1;
		}while(a<=20);
	}
}