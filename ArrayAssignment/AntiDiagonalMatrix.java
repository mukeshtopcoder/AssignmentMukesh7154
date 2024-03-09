//Print All Anti-diagonal of a Matrix
class AntiDiagonalMatrix{	
	public static void main(String[] args){
		int[][] arr = {{2,5,7},{2,5,2},{8,4,7}};
		System.out.print("Our Array : \n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("Anti Diagnal Matrix");
		int m=0;
		for(int i=0;i<arr.length*2-1;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if((j+k)==m)
						System.out.print(arr[j][k]+" ");
				}
			}
			System.out.println();
			m++;
		}
	}
}