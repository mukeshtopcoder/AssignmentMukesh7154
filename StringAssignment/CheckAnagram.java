// Check Anagram
class CheckAnagram{
	public static boolean CheckAna(String s1,String s2){
		StringBuffer sb = new StringBuffer(s1);
		int count=0;
		if(s1.length()==s2.length()){
		for(int i=0;i<s2.length();i++){
			for(int j=0;j<sb.length();j++){
				if(s1.charAt(i)==sb.charAt(j)){
					sb.setCharAt(j,'*');
					count++;
				}
			}
		}
		if(s1.length()==count)
			return true;
		else
			return false;
		}else
			return false;
	}
	public static void main(String[] args){
		String str1 = "LISTEN";
		String str2 = "SILENT";
		boolean result = CheckAna(str1,str2);
		if(result)
			System.out.print("Anagram");
		else
			System.out.print("Not Anagram");
	}
}