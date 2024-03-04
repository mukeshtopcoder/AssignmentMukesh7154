// Insert A String Into Another String
class InsertString{
	public static String Insert(String s,String r,int i){
		StringBuffer sb = new StringBuffer(s);
		for(int m=0;m<r.length();m++){
			sb.insert(i,r.charAt(m));
			i++;
		}
		return sb.toString();
	}
	public static void main(String[] args){
		String str1 = "Computer  Department";
		String str2 = "Science";
		String str = Insert(str1,str2,9);
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		System.out.println("Inserted String : "+str);
	}
}