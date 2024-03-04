// Add Characters To A String
// HELLO : H$E$L$L$O
class AddCharacters{
	public static void main(String[] args){
		String str = "HELLO-INDIA";
		System.out.println("Our String : "+str);
		StringBuffer sb = new StringBuffer(str);
		for(int i=1;i<sb.length();i=i+2){
			sb.insert(i,'$');
		}
		str = sb.toString();
		System.out.print("Added String : "+str);
	}
}