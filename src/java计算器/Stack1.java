package java计算器;

import java.util.Stack;

public class Stack1 {
	//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入一个数：");
//		int N = scan.nextInt();
//		String s;
//		for (int i = 0; i < N; i++) {
//			s = scan.next();
//			if (isMatch(s)) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//		}
//	}//main方法结束
	private static boolean isMatch(String s) {
		Stack<Character> sk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			//'('和')'符号
			if (s.charAt(i) == '(') {
				sk.push('(');//入栈
			}
			if (s.charAt(i) == ')') {
				if (!sk.isEmpty() && sk.pop() == '(')//出栈 sk.pop() == '('判断sk栈顶部元素是否为'('
					continue;
				else
					return false;
			}
			//'['和']'符号
			if (s.charAt(i) == '[') {
				sk.push('[');//入栈
			}
			if (s.charAt(i) == ']') {
				if (!sk.isEmpty() && sk.pop() == '[')
					continue;
				else
					return false;
			}
			//'{'和'}'符号
			if (s.charAt(i) == '{') {
				sk.push('{');//入栈
			}
			if (s.charAt(i) == '}') {
				if (!sk.isEmpty() && sk.pop() == '}')
					continue;
				else
					return false;
			}
		}//for循环结束
		if (sk.isEmpty())
			return true;
		else
			return false;
	}
}
/**/