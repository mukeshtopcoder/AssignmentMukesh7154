//Sum of Two Elements is Close to Zero.
class CloseToZero{
	public static void main(String[] args){
		int[] arr = {3,7,4,-2,6,0,8,1,-5,-11,15,-12,18};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int flag=1;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(((arr[i]+arr[j])<2)&&((arr[i]+arr[j])>-2)){
					System.out.print("\nFound Combination : "+arr[i]+" And "+arr[j]);
				flag=0;
				}
			}
		}
		if(flag==1)
			System.out.print("\nNot Found Any Combination");
	}
}