//You are given a string s. You need to reverse the string.
//GFG
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char []A = str.toCharArray();
        char B[] = new char[A.length];
        for(int i=0;i<A.length;i++){
            int j = str.length() -1 -i;
            B[j] = A[i];
        }
            String str1 = new String(B);
            return str1;
    }
}