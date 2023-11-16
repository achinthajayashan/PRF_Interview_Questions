import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int [] nums = {7,-1,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to search for: ");
        int number = scanner.nextInt();
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        System.out.println("Sorted array: "+ Arrays.toString(nums));
        find(nums,number);


    }

    public static void find(int[] nums,int number){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(nums[mid]==number){
                System.out.println("Number found at index: "+mid);
                break;
            }
            else if(nums[mid]<number){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;

        }

        if (start>end){
            System.out.println("Number not found!");

        }




    }
}