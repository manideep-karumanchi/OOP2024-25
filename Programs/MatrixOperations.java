import java.util.Scanner;
class MatrixOperations{
	public static void main(String[] args){
		int[][] m1, m2;
		Scanner s = new Scanner(System.in);
		int r1, c1, r2, c2;
		System.out.println("Enter No. or Rows for Matrix1");
		r1 = s.nextInt();
		System.out.println("Enter No. or Columns for Matrix1");
		c1 = s.nextInt();
		m1 = new int[r1][c1];
		readMatrix(m1, r1, c1);
		System.out.println("Enter No. or Rows for Matrix2");
		r2 = s.nextInt();
		System.out.println("Enter No. or Columns for Matrix2");
		c2 = s.nextInt();
		m2 = new int[r2][c2];
		readMatrix(m2, r2, c2);
		multiplymatrices(m1,m2);
	}
	static void multiplymatrices(int[][] m1, int[][] m2){
		int res[][] = new int[m1.length][m2[0].length];
		if(m1[0].length == m2.length){
			for(int i = 0; i < m2.length; i++){
				for(int j=0; j < m1[0].length; j++){
					for(int k=0; k<m1.length;k++){
						res[i][j] += m1[i][k]*m2[k][j]; 
					}
				}  
			}
			System.out.println("Matrix multiplication result:");
			for(int r=0; r< res.length;r++){
				for(int c=0; c< res[0].length; c++){
					System.out.print(res[r][c]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Matrix multiplication Not Possible");
		}
	}
	static void readMatrix(int[][] m, int r, int c){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter "+(r*c)+" no. of elements:");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				m[i][j] = s.nextInt();
			}
		}
	}
}