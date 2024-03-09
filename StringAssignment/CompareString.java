//Compare Two Strings
class CompareString{
	public static void main(String[] args){
		String str1 = "MUKESH";
		String str2 = "ABHISHEK";
		int result = str1.compareTo(str2);
		if(result>0)
			System.out.print("1st String is Greater Than 2nd");
		else if(result==0)
			System.out.print("Both Strings Are Equal");
		else
			System.out.print("2nd String is Greater Than 1st");
	}
}