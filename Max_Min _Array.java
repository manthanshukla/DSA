// Given an array A of size N of integers. 
//Your task is to find the sum of minimum and maximum element in the array.
//GFG Question 
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        Arrays.sort(A);
            int sum = A[0] + A[N-1];
            return sum;
        
    }
    
}
