//Posible Triangle In Array
//Hint : two sides sum must be equal to greater than third side
class CheckTriangle{
	public static void main(String[] args){
		int[] arr = {12,43,56,78,45,23,23,56,7,34,23,45};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Find Triangle Sides
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if((arr[i]+arr[j])>=arr[k])
						System.out.print("\nCombination Found : "+arr[i]+" And "+arr[j]+" And "+arr[k]);
				}
			}
		}
	}
}