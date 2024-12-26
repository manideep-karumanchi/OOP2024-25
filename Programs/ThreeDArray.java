class ThreeDArray{
	public static void main(String[] args){
		int [][][] a = {
							{{1,2},{1,2}},
							{{1,2},{1,2}},
							{{1,2},{1,2}}
						};
		System.out.println("Array Elements are:");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				for(int k = 0; k < a[0][0].length; k++){
					System.out.println(a[i][j][k]);
				}
			}
		}
	}
}