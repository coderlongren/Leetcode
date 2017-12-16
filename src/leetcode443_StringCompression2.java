/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月16日 上午11:52:50
* 类说明:  两点法 two points and a counter
*/
public class leetcode443_StringCompression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int compress(char[] chars){
		int start = 0;
        for(int end = 0, count = 0; end < chars.length; end++) {
            count++;
            if(end == chars.length-1 || chars[end] != chars[end + 1] ) {
                //We have found a difference or we are at the end of array
                chars[start] = chars[end]; // Update the character at start pointer
                start++;
                if(count != 1) {
                    // Copy over the character count to the array
                    char[] arr = String.valueOf(count).toCharArray();
                    for(int i=0;i<arr.length;i++, start++)
                        chars[start] = arr[i];
                }
                // Reset the counter
                count = 0;
            }
        }
        return start;
	}

}
