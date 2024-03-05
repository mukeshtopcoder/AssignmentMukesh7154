//Check Pangram String
// Pangram is string contains all character from a-z
class CheckPangram{
	public static boolean Pangram(String s){
		int count=0;
		for(int i=97;i<=122;i++){
			for(int j=0;j<s.length();j++){
				if(i==(int)s.charAt(j)){
					count++;
					break;
				}
			}
		}
		if(count==26)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "he quick brown fox jumps over the lazy dog";
		String str3 = "my friend abhishek chauhan";
		if(Pangram(str1))
			System.out.println("String : "+str1+"\nIt is Pangram");
		else
			System.out.println("String : "+str1+"\nIt is not Pangram");
		if(Pangram(str2))
			System.out.println("String : "+str2+"\nIt is Pangram");
		else
			System.out.println("String : "+str2+"\nIt is not Pangram");
		if(Pangram(str3))
			System.out.println("String : "+str3+"\nIt is Pangram");
		else
			System.out.println("String : "+str3+"\nIt is not Pangram");
		
		
	}
}