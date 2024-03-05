// Reverse String Using Stack
import java.util.Stack;
class ReverseUsingStack{
	public static String Reverse(String s){
		char[] arr = new char[s.length()];
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++)
			st.push(s.charAt(i));
		int m=0;
		while(!st.isEmpty())
			arr[m++]=st.pop();
		return new String(arr);
	}
	public static void main(String[] args){
		String str1 = "HELLOINDIA";
		String str2 = "HELLOWORLD";
		System.out.println("String : "+str1+" --Reverse : "+Reverse(str1));
		System.out.println("String : "+str2+" --Reverse : "+Reverse(str2));
	}
}