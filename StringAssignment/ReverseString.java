// Reverse A String
class ReverseString{
	public static void main(String[] args){
		String str = "MOHAN KUMAR";
		StringBuffer sb = new StringBuffer();
		System.out.println("Our String : "+str);
		for(int i=str.length()-1;i>=0;i--)
			sb.append(str.charAt(i));
		str = sb.toString();
		System.out.print("Reverse String : "+str);
	}
}