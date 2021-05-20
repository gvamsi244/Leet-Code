/**
 * @author Vamsi Krishna Govada on  5/19/2021.
 * @project Leet-Code
 */

public class Solution392 {
    public boolean isSubsequence(String s, String t) {

        int len_s = s.length(), len_t = t.length();
        int index_s =0, index_t=0;
        int result=0;

        while((index_s<len_s) && (index_t<len_t)){
            if(s.charAt(index_s)==t.charAt(index_t)){
                index_s++;
                // index_j++;
                result++;
            }
            index_t++;
        }

        if(len_s==result)
            return true;
        else
            return false;

    }
}
