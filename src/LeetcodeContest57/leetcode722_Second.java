package LeetcodeContest57;

import java.util.ArrayList;
import java.util.List;

public class leetcode722_Second {
//	Given a C++ program, remove comments from it. The program source is an array where source[i] is the i-th line of the source code. This represents the result of splitting the original source code string by the newline character \n.
//
//	In C++, there are two types of comments, line comments, and block comments.
//
//	The string // denotes a line comment, which represents that it and rest of the characters to the right of it in the same line should be ignored.
//
//	The string /* denotes a block comment, which represents that all characters until the next (non-overlapping) occurrence of */ should be ignored. (Here, occurrences happen in reading order: line by line from left to right.) To be clear, the string /*/ does not yet end the block comment, as the ending would be overlapping the beginning.
//
//	The first effective comment takes precedence over others: if the string // occurs in a block comment, it is ignored. Similarly, if the string /* occurs in a line or block comment, it is also ignored.
//
//	If a certain line of code is empty after removing comments, you must not output that line: each string in the answer list will be non-empty.
//
//	There will be no control characters, single quote, or double quote characters. For example, source = "string s = "/* Not a comment. */";" will not be a test case. (Also, nothing else such as defines or macros will interfere with the comments.)
//
//	It is guaranteed that every open block comment will eventually be closed, so /* outside of a line or block comment always starts a new comment.
//
//	Finally, implicit newline characters can be deleted by block comments. Please see the examples below for details.
//
//	After removing the comments from the source code, return the source code in the same format. 
	// 去掉 C/C++代码里面的 注释 包括 多行注释 单行注释 
	
	
	public static void main(String[] args) {
		String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
		
		System.out.println(removeComments(source));
	}
	 public static List<String> removeComments(String[] source) {
		 List<String> list  = new ArrayList<String>();
		 String result = "";
		 StringBuilder stringBuilder = new StringBuilder();
		 //用于  /* */注释 判断  
		 boolean flag = false;
		 
		 for (int k = 0; k < source.length; k++){
			 String string = source[k];
			 int i;
			 for (i = 0; i < string.length(); i++){
				 if (flag){
					 //遇到了 /* 开头的行 
					  if (string.charAt(i) == '*' && i < string.length() - 1 && string.charAt(i + 1) == '/'){
						  flag = false;
						  i++;
					  } 
				 }
				 else {
					//遇到了 //开头的一行 忽略后面的 字符
					 if (string.charAt(i) == '/' && i < string.length() - 1 && string.charAt(i + 1) == '/'){
						 if (stringBuilder.length() > 0){
							 list.add(stringBuilder.toString());
						 }
						 stringBuilder = new StringBuilder();
						 break;
					 }
					 //遇到了 /*开头  忽略 直到 遇到  */
					 else if (string.charAt(i) == '/' && i < string.length() - 1 && string.charAt(i + 1) == '*'){
						 flag = true;
						 i++;
					 }
					 else {
						stringBuilder.append(string.charAt(i));
					}
						 
					 
				}
			 }
			 
			 if (i == string.length() && !flag && stringBuilder.length() > 0){
				 list.add(stringBuilder.toString());
				 stringBuilder = new StringBuilder();
			 }
		 }
		 return list;
		 
	 }

}
