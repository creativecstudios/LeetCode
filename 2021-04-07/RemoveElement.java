//https://leetcode.com/problems/remove-element/

package Leetcode;
import java.util.Scanner;

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2]

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3]

class RemoveElement{

	public static int removeElement(int arr[], int value){
		int point = 0;
		for(int tempIndex=0; tempIndex<arr.length; tempIndex++){
			if(arr[i] != value){
				arr[point++] = arr[i];
			}
		}
		for(int tempIndex2 = 0; tempIndex2<point; tempIndex2++){
			System.out.println("["+arr[tempIndex2]+" "+"]");
		}	
		System.out.println("");
		return point;
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		System.out.println("Enter the target to remove");
		int target = scanner.nextInt();
		
		//array declaration
		int arr[] = new int[size];
		//method calling form mergesorted class for geting input

		Merge_Sorted_Array obj = new Merge_Sorted_Array();
		obj.inputArray(arr,size);

		System.out.println(removeElement(arr,target));
	}
}
