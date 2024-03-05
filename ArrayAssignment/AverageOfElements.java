// Find Average Of Elements of An Array
class AverageOfElements{
	public static void main(String[] args){
		int[] arr = {23,54,56,67,78,54};
		int sum=0;
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		int avg = sum/arr.length;
		System.out.print("\nAverage of Elements : "+avg);
	}
}