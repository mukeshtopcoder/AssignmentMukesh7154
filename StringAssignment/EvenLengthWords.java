// Print only even length words.
class EvenLengthWords{
	public static void main(String[] args){
		String str = "Hello My Name is Aman Kumar";
		System.out.println("My String : "+str);
		String[] words = str.split(" ");
		System.out.println("Even Length Words");
		for(int i=0;i<words.length;i++){
			if(words[i].length()%2==0)
				System.out.print(words[i]+" ");
		}
	}
}