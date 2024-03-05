//Remove Leading Zeros
class RemoveLeadingZeros{
	public static void main(String[] args){
		String str = "002703";
		String str1 = "";
		System.out.println("Our Number : "+str);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='0'){
				for(int j=i;j<str.length();j++)
					str1=str1+str.charAt(j);
				break;
			}
		}
		System.out.print("Removed Leading Zeros : "+str1);
	}
}