package insertion_sort;

/**
 *
 * @author Faizal Nasrullah
 */
import java.util.Arrays;
        
public class insertion_sort1 {
    void insertion_sort1(int[] nums){
        for(int q= 1; q < nums.length; q++){
        int value = nums[q];
        int b = q - 1;
        while(b >= 0 && nums[b] > value){
            nums[b + 1] = nums[b];
            b = b -1;
            
        }
        nums [b + 1] = value;
    }
    }
    public static void main(String args[])
    {
       insertion_sort1 ob = new insertion_sort1();
       int nums[] = {8,-5,4,2,0,47};
       System.out.println("Original Array:");
       System.out.println(Arrays.toString(nums));
       ob.insertion_sort1(nums);
       System.out.println("sorted Array");
       System.out.println(Arrays.toString(nums));
    }
}
