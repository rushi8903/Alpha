package Alpha;
import java.util.*;

public class arrays {

    public static void binarySearch(int arr[],int key) {
        int len = arr.length;
        int end = len-1;
        int start =0,mid,index=-1;
        while(end>=start){
            mid = (start+end)/2;
            if(arr[mid]==key){
                index = mid;
                start = end +1;
            }else if(arr[mid]>key){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        System.out.println("Key found at index :"+index);        
    }

    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr){
        int temp,n = arr.length;
        for(int i=0;i<n/2;i++){
            temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        printArray(arr);
    }

    public static void kadanesMaxSumOfSubarray(int[] arr){
        int curruntSum=0,len = arr.length;
        int maxSum;
        if(arr[0]>0){
            maxSum=arr[0];
            curruntSum=arr[0];
        }else{
            maxSum=0;
        }
        
        for(int i=1;i<len;i++){
            curruntSum=curruntSum+arr[i];
            if(curruntSum>=maxSum){
                maxSum=curruntSum;
            }else if(curruntSum<0){
                curruntSum=0;
            }  
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        // binarySearch(arr,10);
        // reverseArray(arr);
        // printArray(arr);
        // kadanesMaxSumOfSubarray(arr);
    }
    
}
