// Replace A Character At Specific Index
import java.util.Scanner;
class ReplaceCharacterAtIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "HELLOINDIA";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Our String : "+str);
		System.out.print("Enter A Character : ");
		char c = sc.next().charAt(0);
		System.out.print("Enter Index To Replace This Character : ");
		int i = sc.nextInt();
		sb.setCharAt(i-1,c);
		str = sb.toString();
		System.out.println("Updated String : "+str);
	}
}