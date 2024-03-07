//Convert ArrayList To Array
import java.util.ArrayList;
class ArrayListToArray{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(43);
		al.add(64);
		al.add(56);
		al.add(24);
		al.add(58);
		int[] arr = new int[al.size()];
		System.out.println("Our ArrayList : -");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		// Coping ArrayList to Array
		for(int i=0;i<al.size();i++)
			arr[i]=al.get(i);
		System.out.println("\nOur ArrayList : -");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}