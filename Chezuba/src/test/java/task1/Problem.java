package task1;
import java.util.Arrays;
public class Problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Problem
		//You are given a large integer represented as an integer array digits, 
		//where each digits[i] is the ith digit of the integer. 
		//The digits are ordered from most significant to least significant in left-to-right order. 
		//The large integer does not contain any leading 0's. 
		//Increment the large integer by one and return the resulting array of digits. 
		//Example: Input: digits = [1,2,3] Output: [1,2,4] 
		//Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. 
		//Thus, the result should be [1,2,4]. 
// Solution:
		// input array
       int [] arr= {1,2,4};
       //for length of array
       int len=arr.length;
       //count variable
       int sz=1;
       //result array
       int [] result=new int[len+1];
       //Reverse loop
       for(int i=len-1;i>=0;i--) {
    	   //for normal 1 to 8
    	   if(arr[i]<9) {
    		   //for increase value by 1
    		   arr[i]=arr[i]+1;
    		   sz++;
    		   break;
    	   }
    	   //if it is greater than 8
    	   else {
    		   arr[i]=0;
    		   sz++;
    	   }
       }
       //if value is  99 or 999
       if(arr[0]==0) {
    	   //at first place it will store 1
    	   result[0]=1;
    	 //for printing array in once
    	   System.out.println(Arrays.toString(result));
       }else {
       //for printing array in once
       System.out.println(Arrays.toString(arr));
       }
}
	//Approach:
	// 1.First we create one array like  int [] arr= {9,9,9,9};
	// 2.One more array which will hold array but it have one length extra so it can hold 1 more for edge case like 999
	// 3.Initialize  one  count variable which will store the no of items in array by running in loop
	// 4.Run the loop in reverse so it will start from end.
	// 5.If value is between 1 to 8 simply it will increase it by one
	// 6.If it is greater than 8 then replace it to 0
	// 7.For Edge case if arr[0] is 0 that means it need one more place to hold value so at first place we will change it to 1
	// 8.Then it will print array result in string format so array will print in one go
	// 9.For normal case where value size is same just it got increased by 1
	// 10.Then it will print array arr in string format 
};
