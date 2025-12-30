//Problem:Reversing Array
//Approach : 2- pointer
import java.util.Arrays;
public class ReverseArray{
    public static void reverseArray(int[] arr){
        int left=0,right=arr.length-1;  //using 2-pointers
        while(left<right){ // if left is greater than or equal to right then we will be swapping the elements of reversed array. 
            int temp=arr[left]; //swapping
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));//to print in array form.
    }
}
//Space complexity:O(n);
//Time complexity:1;
