/**
 * @Auther: yuguo
 * @Date: 2022/12/30 - 12 - 30 - 17:23
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class pritacelongest {
    public static void main(String[] args) {
        String[] strs = {"floigh","flosizh","flosiwe"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(String str : strs){
            while(!str.startsWith(s)){
                s = s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
