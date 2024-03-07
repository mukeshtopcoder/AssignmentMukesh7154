//Convert Array to A ArrayList
import java.util.ArrayList;
class ArrayToArrayList{
	public static void main(String[] args){
		int[] arr = {23,65,45,37,43,56,45,43,57,24,31,46,43};
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Our Array:-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//Converting Array To ArrayList
		for(int i=0;i<arr.length;i++)
			al.add(arr[i]);
		System.out.println("\nPrinting ArrayList :-");
		for(int i=0;i<arr.length;i++)
			System.out.print(al.get(i)+" ");
	}
}