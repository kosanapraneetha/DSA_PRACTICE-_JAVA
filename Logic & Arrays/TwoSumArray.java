Problem:TwoSumArray
Approach: 1.HashMap
          2.Nested for loop//Brute Force Approach
  //Mentioned both approaches:
Solution:[1]
  Time complexity:O(n);
  Space Complexity:1;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class TwoSumArrray{
    public static int[] twosum(int[] arr,int target){
       Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new  int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
       System.out.println(Arrays.toString(twosum(arr,target)));
    }
}

[2]:
  Time Complexity:O(n^2);
  Space Complexity:O(1);
import java.util.Arrays;
public class TwoSumArray{
    public static int[] twosum(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                   return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
       System.out.println(Arrays.toString(twosum(arr,target)));
    }
}
                
