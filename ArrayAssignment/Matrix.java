// Check Identity Matrix
import java.util.Scanner;
/*          ij
1 0 0		00	01	02
0 1 0 		10	11	12
0 0 1		20	21	22
*/
class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] m1 = {{1,0,0},{0,1,0},{0,0,1}};
		int even=0,odd=0;
		System.out.println("\n--- Your Matrix ---");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}	
		int flag=1;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++){
				if((m1[i][j]!=0)&&(i!=j))
					flag=0;
				if((m1[i][j]!=1)&&(i==j))
					flag=0;
			}
		if(flag==1)
			System.out.print("\nIdentity Matrix");
		else
			System.out.print("\nNot Identity Matrix");
	}
}