//
public class Solution {
    public static int hammingDistance(int x, int y) {

        int z=x^y,count=0;
        String str=Integer.toBinaryString(z);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}