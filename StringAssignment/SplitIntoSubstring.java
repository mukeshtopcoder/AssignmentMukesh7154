// Split String Into Number Of Sub-String
import java.util.Scanner;
class SplitIntoSubstring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("My String : "+str);
		System.out.print("Enter Any Number : ");
		int numOfSubstring = sc.nextInt();
		int len = str.length()/numOfSubstring;
		int m=0;
		for(int i=0;i<str.length()/len;i++){
			for(int j=0;j<len;j++){
				System.out.print(str.charAt(m));
				m=m+1;
			}
			System.out.println();
		}
	}
}