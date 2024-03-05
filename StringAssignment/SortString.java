// Sort A String
class SortString{
	public static void main(String[] args){
		String str = "HELLOINDIA";
		System.out.println("Our String : "+str);
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted String : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}