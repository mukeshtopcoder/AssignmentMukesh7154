// Sort An Array of Integer Value and String Array
class SortAnArray{
	public static void main(String[] args){
		String[] st = {"Ram","Shyam","Mohan","Krishna"};
		int[] arr = {23,6,34,67,34,56,73,23,54};
		System.out.print("String Array : ");
		for(int i=0;i<st.length;i++)
			System.out.print(st[i]+" ");
		System.out.print("\nSorted String Array : ");
		for(int i=0;i<st.length;i++){
			for(int j=i+1;j<st.length;j++){
				if(st[i].compareTo(st[j])>0){
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		for(int i=0;i<st.length;i++)
			System.out.print(st[i]+" ");
		System.out.print("\nInteger Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nSorter Integer Array : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}