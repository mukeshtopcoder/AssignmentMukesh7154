// Majority Element of an Array
class MajorityElement{
	public static void main(String[] args){
		int[] arr = {3,3,1,3,1,1,1,1,2,1,1,3,1,1};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//Count Majority Element
		int maj=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++)
				if(arr[i]==arr[j])
					count++;
			if(count>=arr.length/2)
				maj=arr[i];
		}
		if(maj!=0)
			System.out.print("\nMajority Element : "+maj);
		else
			System.out.print("\nThere is no Majority Element!");
	}
}