package java������;

import java.util.Scanner;
import java.util.Stack;
public class Stack1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("������һ������");
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
//	}//main��������
	private static boolean isMatch(String s) {
		Stack <Character>sk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			//'('��')'����
			if (s.charAt(i) == '(') {
				sk.push('(');//��ջ
			}
			if (s.charAt(i) == ')') {
				if (!sk.isEmpty() && sk.pop() == '(')//��ջ sk.pop() == '('�ж�skջ����Ԫ���Ƿ�Ϊ'('
					continue;
				else
					return false;
			}
			//'['��']'����
			if (s.charAt(i) == '[') {
				sk.push('[');//��ջ
			}
			if (s.charAt(i) == ']') {
				if (!sk.isEmpty() && sk.pop() == '[')
					continue;
				else
					return false;
			}
			//'{'��'}'����
			if (s.charAt(i) == '{') {
				sk.push('{');//��ջ
			}
			if (s.charAt(i) == '}') {
				if (!sk.isEmpty() && sk.pop() == '}')
					continue;
				else
					return false;
			}
		}//forѭ������
		if (sk.isEmpty())
			return true;
		else
			return false;
	}
}
/**/