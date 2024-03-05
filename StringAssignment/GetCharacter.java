// Get A Character From A String
import java.util.Scanner;
class GetCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "HELLOINDIA";
		System.out.println("My String : "+str);
		System.out.print("Enter Any Index Number : ");
		int index = sc.nextInt();
		if((index>=0)&&(index<str.length()))
			System.out.print("Character : "+str.charAt(index));
		else
			System.out.print("Wrond Index Entered!");
	}
}