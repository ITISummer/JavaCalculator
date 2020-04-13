package java计算器;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

@SuppressWarnings("serial")
public class Calc extends JFrame implements ActionListener {
	/**********************成员变量的申明与实例化***********************/
	//按钮
	JButton b[] = new JButton[19];
	//面板
	JPanel JP1 = new JPanel();
	JPanel JP2 = new JPanel();
	JPanel JP3 = new JPanel();
	JPanel JP4 = new JPanel();
	JPanel JP5 = new JPanel();
	JPanel JP6 = new JPanel();
	JPanel JP7 = new JPanel();
	JPanel JP8 = new JPanel();
	//标签和文本框
	JLabel JL1 = new JLabel("输入框：");
	JTextArea JA1 = new JTextArea(1, 12);
	JLabel JL2 = new JLabel("十进制：");
	JTextField JT2 = new JTextField(12);

	JLabel JL3 = new JLabel("二进制：");
	JTextField JT3 = new JTextField(12);
	//创建一个数组,向其中添加输入的表达式
	//char[] arraychar=new char[30];
/**********************成员变量的申明与实例化***********************/
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * 构造方法
	 */
	public Calc() {
		initialize();//调用初始化方法
		this.setTitle("Calculator");
		this.setBounds(1100, 200, 320, 500);
		this.setVisible(true);
		this.setLayout(new GridLayout(8, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭模式
	}//构造方法结束
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * 初始化方法
	 */
	public void initialize() {

		//定义与添加按钮
		String button_name[] = {"clear", "←", "%", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "="};
		for (int i = 0; i < button_name.length; i++) {
			b[i] = new JButton(button_name[i]);
			b[i].setForeground(Color.BLUE);//数字键 设置前景色为 蓝颜色
			b[i].setFont(new Font("宋体", Font.PLAIN, 30));//设置字体格式
			b[i].addActionListener(this);
			if (i >= 0 && i <= 3)
				JP4.add(b[i]);
			else if (i >= 4 && i <= 7)
				JP5.add(b[i]);
			else if (i >= 8 && i <= 11)
				JP6.add(b[i]);
			else if (i >= 12 && i <= 15)
				JP7.add(b[i]);
			else if (i >= 16 && i <= 18)
				JP8.add(b[i]);
		}
		//添加面板
		JP1.add(JL1);
		JP1.add(JA1);//添加输入框标签
		JP2.add(JL2);
		JP2.add(JT2);//添加十进制框和标签
		JP3.add(JL3);
		JP3.add(JT3);//添加二进制框和标签
		//设置文本区字体
		JA1.setFont(new Font("宋体", Font.ITALIC, 30));
		JT2.setFont(new Font("宋体", Font.ITALIC, 30));
		JT3.setFont(new Font("宋体", Font.ITALIC, 30));
		this.add(JP1);
		this.add(JP2);
		this.add(JP3);
		this.add(JP4);
		this.add(JP5);
		this.add(JP6);
		this.add(JP7);
		this.add(JP8);
		b[1].setEnabled(false);//刚开始设置单选删除键不可操作

	}//初始化方法结束

	////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		new Calc();
		//operandStack.pop()
	}//主方法结束
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * 事件监听方法
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b[0]) {
			JA1.setText("");//清空文本区
			JT2.setText("");//清空文本框
			JT3.setText("");//清空文本框
			JA1.setEnabled(true);
			isJA1empty();
		} else if (e.getSource() == b[1]) {
			int length = JA1.getText().length();
			JA1.setText(JA1.getText().substring(0, length - 1));
			length--;
			isJA1empty();
		} else if (e.getSource() == b[2]) {
			JA1.append(b[2].getText());
			isJA1empty();
		} else if (e.getSource() == b[3]) {
			JA1.append(b[3].getText());

			isJA1empty();

		} else if (e.getSource() == b[4]) {
			JA1.append(b[4].getText());
			isJA1empty();
		} else if (e.getSource() == b[5]) {
			JA1.append(b[5].getText());
			isJA1empty();
		} else if (e.getSource() == b[6]) {
			JA1.append(b[6].getText());
			isJA1empty();
		} else if (e.getSource() == b[7]) {
			JA1.append(b[7].getText());
			isJA1empty();
		} else if (e.getSource() == b[8]) {
			JA1.append(b[8].getText());
			isJA1empty();
		} else if (e.getSource() == b[9]) {
			JA1.append(b[9].getText());
			isJA1empty();
		} else if (e.getSource() == b[10]) {
			JA1.append(b[10].getText());
			isJA1empty();
		} else if (e.getSource() == b[11]) {
			JA1.append(b[11].getText());
			isJA1empty();
		} else if (e.getSource() == b[12]) {
			JA1.append(b[12].getText());
			isJA1empty();
		} else if (e.getSource() == b[13]) {
			JA1.append(b[13].getText());
			isJA1empty();
		} else if (e.getSource() == b[14]) {
			JA1.append(b[14].getText());
			isJA1empty();
		} else if (e.getSource() == b[15]) {
			JA1.append(b[15].getText());
			isJA1empty();
		} else if (e.getSource() == b[16]) {
			JA1.append(b[16].getText());
			isJA1empty();
		} else if (e.getSource() == b[17]) {
			JA1.append(b[17].getText());
			isJA1empty();
		} else if (e.getSource() == b[18]) {
			//JA1.append(b[18].getText());
			//arraychar=JA1.getText().toCharArray();
			isJA1empty();
			isCharacter();
			//count();
		}

	}//事件监听方法结束
//对arraychar数组里面的内容进行判断和计算
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**@进行运算的方法*/
/*public void questionsOf0() {
	for(int i=0;i<arraychar.length;i++) {
    	
    	if(arraychar[i]=='/') {
    		if(arraychar[i+1]=='0') {
    			JA1.setText("无效输入");
    			JA1.setEnabled(false);
    		}
    		else {
    			int s=(arraychar[i-1]-48)/(arraychar[i+1]-48);
    			JT2.setText(Integer.toString(s));
    			JT3.setText(Integer.toBinaryString(s));
    			
    		}
    		
    	}
    	
    	if(arraychar[i]=='%') {
    		if(arraychar[i+1]=='0') {
    			JA1.setText("无效输入");
    			JA1.setEnabled(false);
    		}
    		else {
    		int s=(arraychar[i-1]-48)%(arraychar[i+1]-48);
			JT2.setText(Integer.toString(s));
			JT3.setText(Integer.toBinaryString(s));
    		}
    		}
	}
}*///进行运算的方法结束
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * @这个方法的作用就是使用空格分割字符串，以便后面使用分割函数使得将字符串分割成数组
	 */
	public String resetExpression(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
					s.charAt(i) == '+' || s.charAt(i) == '-'
					|| s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%')
				result += " " + s.charAt(i) + " ";
			else
				result += s.charAt(i);
		}
		System.out.println(result);
		return result;
	}//重置表达式方法结束
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * @进行运算符和数据符的判断入栈操作
	 */
	public int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();//创建一个数据栈
		Stack<Character> operatorStack = new Stack<>();//创建一个运算符栈
		expression = resetExpression(expression);//处理表达式,运算符前后加空格
		String[] tokens = expression.split(" ");//根据匹配给定的正则表达式来拆分此字符串。 返回值是字符串数组
//    for(int i=0;i<tokens.length;i++)
//    System.out.print(tokens[i]);
//    System.out.println();
		//该方法的作用就像是使用给定的表达式和限制参数 0 来调用两参数 split 重载方法。因此，所得数组中不包括结尾空字符串。
		for (String token : tokens) {//单个运算符字符就是一个字符串
			if (token.length() == 0)   //如果是空格的话就继续循环，什么也不操作
				continue;
				//如果是加减的话，因为加减的优先级最低，因此这里的只要遇到加减号，无论操作符栈中的是什么运算符都要运算
			else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				//当栈不是空的，并且栈中最上面的一个元素是加减乘除的任意一个
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '-' || operatorStack.peek() == '+'
						|| operatorStack.peek() == '/' || operatorStack.peek() == '*' || operatorStack.peek() == '%')) {
					processAnOperator(operandStack, operatorStack);   //开始运算
				}
				operatorStack.push(token.charAt(0));   //运算完之后将当前的运算符入栈
			}//else if语句结束
			//当前运算符是乘除的时候，因为优先级高于加减，因此要判断最上面的是否是乘除，如果是乘除就运算，否则的话直接入栈
			else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%') {
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '/' || operatorStack.peek() == '*' || operatorStack.peek() == '%')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));   //将当前操作符入栈
			}//else if语句结束
			//如果是左括号的话直接入栈，什么也不用操作,trim()函数是用来去除空格的，由于上面的分割操作可能会令运算符带有空格
			else if (token.trim().charAt(0) == '(') {
				operatorStack.push('(');
			}
			//如果是右括号的话，清除栈中的运算符直至左括号
			else if (token.trim().charAt(0) == ')') {
				while (operatorStack.peek() != '(') {
					processAnOperator(operandStack, operatorStack);    //开始运算
				}
				operatorStack.pop();   //这里的是运算完之后清除左括号，让左括号出运算符栈
			}
			//这里如果是数字的话直接入数据的栈
			else {
				operandStack.push(Integer.parseInt(token));   //将数字字符串转换成数字然后压入栈中
			}
		}//for循环结束
		//最后当运算符栈中不是空的时候继续运算，直到栈中为空即可
		while (!operatorStack.isEmpty()) {
			processAnOperator(operandStack, operatorStack);
		}
		return operandStack.pop();    //此时数据栈中的数据就是运算的结果
	}//运算符合数据符入栈方法结束

////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * @这个方法的作用是计算弹出的两个数据
	 */
	public void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop();  //弹出一个操作符
		int op1 = operandStack.pop();  //从存储数据的栈中弹出连个两个数用来和操作符op运算
		int op2 = operandStack.pop();
		if (op == '+')  //如果操作符为+就执行加运算
			operandStack.push(op2 + op1);
		else if (op == '-')
			operandStack.push(op2 - op1);   //因为这个是栈的结构，自然是上面的数字是后面的，因此用op2-op1
		else if (op == '*')
			operandStack.push(op2 * op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '%')
			operandStack.push(op2 % op1);
	}
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////

	/**
	 * @判断文本区JA1是否为空的方法
	 */
	public void isJA1empty() {
		if ("".equals(JA1.getText()))
			b[1].setEnabled(false);
		else
			b[1].setEnabled(true);
	}//判断文本区是否为空的方法结束

	/**
	 * @判断文本区输入的第一个字符是否为数字的方法
	 * @1.如果不是则设置文本区为无效输入
	 * @2.如果是则继续
	 */
	public void isCharacter() {
		if (JA1.getText().charAt(0) == '+' || JA1.getText().charAt(0) == '-'
				|| JA1.getText().charAt(0) == '*' || JA1.getText().charAt(0) == '/'
				|| JA1.getText().charAt(0) == '%') {
			JA1.setText("无效输入");
			JA1.setEnabled(false);

		} else {
			JT2.setText(Integer.toString(evaluateExpression(JA1.getText())));
			JT3.setText(Integer.toBinaryString(evaluateExpression(JA1.getText())));

		}

	}
}
