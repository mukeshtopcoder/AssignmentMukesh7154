// Check String Is Palindrome
class CheckPalindrome{
	public static boolean CheckPalin(String s){
		int start = 0;
		int end = s.length()-1;
		int flag = 1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end))
				flag=0;
			start++;
			end--;
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		String str = "MADAM";
		boolean result = CheckPalin(str);
		if(result)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}