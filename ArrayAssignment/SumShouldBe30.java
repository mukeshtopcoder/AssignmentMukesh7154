//Sum of all 10's should be 30
class SumShouldBe30{
	public static void main(String[] args){
		int[] arr = {23,56,23,10,56,23,10,32,56,10,63};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//addition of 10s
		int sum=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==10)
				sum=sum+arr[i];
		if(sum==30)
			System.out.print("\nTrue\nAdditon : "+sum);
		else
			System.out.print("\nFalse\nAdditon : "+sum);
	}
}