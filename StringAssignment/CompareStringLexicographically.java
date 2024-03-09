// Compare Two String Lexicographically
class CompareStringLexicographically{
	public static void main(String[] args){
		String str1 = "MUKESH";
		String str2 = "ABHISHEK";
		if((str1.length()!=0)&&(str2.length()!=0)){
			int result = (int)str1.charAt(0)-(int)str2.charAt(0);
			if(result>0)
				System.out.print("1st String is Greater Than 2nd");
			else if(result==0)
				System.out.print("Both Strings Are Equal!");
			else
				System.out.print("2nd String is Greater Than 1st");
		}else{
			System.out.print("Is There Any Empty String?");
		}
	}
}