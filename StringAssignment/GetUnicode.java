//Get Unicode Point at a given index in a string
import java.util.Scanner;
class GetUnicode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "HELLOINDIA";
		System.out.println("Our String : "+str);
		System.out.print("Enter Any Index : ");
		int i = sc.nextInt();
		if((i>=0)&&(i<str.length()))
		{
			System.out.print("Character : "+str.charAt(i)+" Index is "+(int)str.charAt(i));
		}else{
			System.out.print("Index Not Found!");
		}
	}
}