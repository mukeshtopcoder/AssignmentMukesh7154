// Convert String to String Array
class ConvertToArray{
	public static void main(String[] args){
		String str = "HELLOINDIA";
		System.out.println("My String : "+str);
		char[] arr = str.toCharArray();
		System.out.println("Now Converted To Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}