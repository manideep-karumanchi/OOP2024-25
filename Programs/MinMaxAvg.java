import java.util.*;
class MinMaxAvg{
	public static void main(String[] args){
		int[] nums;
		int size, min, max, avg, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number of Elements:");
		size = s.nextInt();
		nums = new int[size];
		System.out.println("Enter "+size+" no of Elements:");
		for(int i=0;i<size;i++){
			nums[i] = s.nextInt();
		}
		min = nums[0];
		max = nums[0];
		for(int num : nums){
			if(num < min)
				min = num;
			if(num > max)
				max = num;
			sum += num;
		}
		avg = sum / size;
		System.out.println("Minimum Value: "+min);
		System.out.println("Maximum Value: "+max);
		System.out.println("Average Value: "+avg);
	}
}