class UnevenArray{
	public static void main(String[] args){
		int arr[][];
		int val = 0;
		arr = new int[4][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[6];
		arr[3] = new int[5];
		for(int row=0; row < arr.length; row++){
			for(int col=0; col < arr[row].length; col++){
				arr[row][col] = val++; 
			}
		}
		System.out.println("Array contents are:");
		for(int row=0; row < arr.length; row++){
			for(int col=0; col < arr[row].length; col++){
				System.out.print(arr[row][col]+"\t"); 
			}
			System.out.println();
		}
	}
}