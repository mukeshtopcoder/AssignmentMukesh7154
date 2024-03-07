//Check Equality Of Two Arrays
class CheckEquality{
	public static void main(String[] args){
		int[] arr1 = {86,65,43,43,45,56,67,45};
		int[] arr2 = {86,65,43,43,45,56,67,45};
		System.out.print("Our 1st Array :- ");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.print("\nOur 2nd Array :- ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		if(arr1.length==arr2.length)
		{
			int flag=1;
			for(int i=0;i<arr1.length;i++)
				if(arr1[i]!=arr2[i])
					flag=0;
			if(flag==1)
				System.out.print("\nArrays Are Equal!");
			else
				System.out.print("\nArrays Are Not Equal!");
		}else{
			System.out.print("\nArrays Are Not Equal!");
		}
	}
}