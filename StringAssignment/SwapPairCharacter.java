// Swapping Pair Of Character In A String
class SwapPairCharacter{
	public static void main(String[] args){
		String str = "HELLOINDIAWORLD";
		char[] arr = str.toCharArray();
		System.out.println("My String : "+str);
		for(int i=0;i<str.length()-2;i=i+2){
			char temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.print("Swapped String : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}