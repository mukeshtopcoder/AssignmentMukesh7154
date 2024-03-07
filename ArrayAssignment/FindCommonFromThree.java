// Find Common Elements From 3 different Arrays
class FindCommonFromThree{
	public static void main(String[] args){
		int[] arr1 = {23,54,67,87,56,43,23,45,67};
		int[] arr2 = {23,51,69,87,56,83,23,45,77,23,67};
		int[] arr3 = {23,54,64,87,56,67,23,05,67,23,56,78};
		System.out.print("Our 1st Array: ");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.print("\nOur 2nd Array: ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.print("\nOur 3rd Array: ");
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
		System.out.println("\nCommon Elements");
		for(int i=0;i<arr1.length;i++){
			int flag=0;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					for(int m=0;m<arr3.length;m++)
						if(arr1[i]==arr3[m])
							flag=1;
				}
			}
			if(flag==1)
				System.out.print("\nFound : "+arr1[i]);
		}
	}
}