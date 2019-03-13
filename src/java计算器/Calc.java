package java������;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

import javax.swing.*;

@SuppressWarnings("serial")
public class Calc extends JFrame implements ActionListener{
/**********************��Ա������������ʵ����***********************/
	   //��ť 
	    JButton b[] = new JButton[19];
       //���
       JPanel JP1=new JPanel();
       JPanel JP2=new JPanel();
       JPanel JP3=new JPanel();
       JPanel JP4=new JPanel();
       JPanel JP5=new JPanel();
       JPanel JP6=new JPanel();
       JPanel JP7=new JPanel();
       JPanel JP8=new JPanel();
       //��ǩ���ı���
       JLabel JL1=new JLabel("�����");
       JTextArea JA1=new JTextArea(1,12);
       JLabel JL2=new JLabel("ʮ���ƣ�");
       JTextField JT2=new JTextField(12);
       
       JLabel JL3=new JLabel("�����ƣ�");
       JTextField JT3=new JTextField(12);
       //����һ������,�������������ı��ʽ
       //char[] arraychar=new char[30];
/**********************��Ա������������ʵ����***********************/
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**���췽��*/ 
public Calc() {
   initialize();//���ó�ʼ������	   
   this.setTitle("Calculator");
   this.setBounds(1100, 200, 320, 500);
   this.setVisible(true);
   this.setLayout(new GridLayout(8,1));
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô���ر�ģʽ
}//���췽������
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**��ʼ������*/
public void initialize() {
	  
	//��������Ӱ�ť
	String button_name[]={"clear","��","%","/","7","8","9","*","4","5","6","-","1","2","3","+","0",".","="};
	for(int i=0;i<button_name.length;i++) {
		b[i] = new JButton(button_name[i]);
		b[i].setForeground(Color.BLUE);//���ּ� ����ǰ��ɫΪ ����ɫ
		b[i].setFont(new Font("����",Font.PLAIN,30));//���������ʽ
		b[i].addActionListener(this);
		if(i>=0&&i<=3) 
			JP4.add(b[i]);
		else if(i>=4&&i<=7)
			JP5.add(b[i]);
		else if(i>=8&&i<=11)
			JP6.add(b[i]);
		else if(i>=12&&i<=15)
			JP7.add(b[i]);
		else if(i>=16&&i<=18)
			JP8.add(b[i]);
	}
	//������
	JP1.add(JL1);JP1.add(JA1);//���������ǩ
    JP2.add(JL2);JP2.add(JT2);//���ʮ���ƿ�ͱ�ǩ
    JP3.add(JL3);JP3.add(JT3);//��Ӷ����ƿ�ͱ�ǩ
    //�����ı�������
    JA1.setFont(new Font("����",Font.ITALIC,30));
    JT2.setFont(new Font("����",Font.ITALIC,30));
    JT3.setFont(new Font("����",Font.ITALIC,30));
    this.add(JP1);this.add(JP2);this.add(JP3);this.add(JP4);
    this.add(JP5);this.add(JP6);this.add(JP7);this.add(JP8);
    b[1].setEnabled(false);//�տ�ʼ���õ�ѡɾ�������ɲ���
    
    }//��ʼ����������
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
public static void main(String[] args) {
	new Calc();
	//operandStack.pop()
}//����������
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**�¼���������*/
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b[0]) {
		JA1.setText("");//����ı���
	    JT2.setText("");//����ı���
	    JT3.setText("");//����ı���
	    JA1.setEnabled(true);
	    isJA1empty();
	}
	else if(e.getSource()==b[1]) {
			int length=JA1.getText().length();
			JA1.setText(JA1.getText().substring(0,length-1));
	        length--;
	        isJA1empty();
	}
	else if(e.getSource()==b[2]) {
		JA1.append(b[2].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[3]) {
		JA1.append(b[3].getText());
		 
		 isJA1empty();
		
	}
	else if(e.getSource()==b[4]) {
		JA1.append(b[4].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[5]) {
		JA1.append(b[5].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[6]) {
		JA1.append(b[6].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[7]) {
		JA1.append(b[7].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[8]) {
		JA1.append(b[8].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[9]) {
		JA1.append(b[9].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[10]) {
		JA1.append(b[10].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[11]) {
		JA1.append(b[11].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[12]) {
		JA1.append(b[12].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[13]) {
		JA1.append(b[13].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[14]) {
		JA1.append(b[14].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[15]) {
		JA1.append(b[15].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[16]) {
		JA1.append(b[16].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[17]) {
		JA1.append(b[17].getText());
		 isJA1empty();
	}
	else if(e.getSource()==b[18]) {
		//JA1.append(b[18].getText());
	    //arraychar=JA1.getText().toCharArray();
	    isJA1empty();
	    isCharacter();
	    //count();
	}

}//�¼�������������
//��arraychar������������ݽ����жϺͼ���
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**@��������ķ���*/
/*public void questionsOf0() {
	for(int i=0;i<arraychar.length;i++) {
    	
    	if(arraychar[i]=='/') {
    		if(arraychar[i+1]=='0') {
    			JA1.setText("��Ч����");
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
    			JA1.setText("��Ч����");
    			JA1.setEnabled(false);
    		}
    		else {
    		int s=(arraychar[i-1]-48)%(arraychar[i+1]-48);
			JT2.setText(Integer.toString(s));
			JT3.setText(Integer.toBinaryString(s));
    		}
    		}
	}
}*///��������ķ�������
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**@������������þ���ʹ�ÿո�ָ��ַ������Ա����ʹ�÷ָ��ʹ�ý��ַ����ָ������*/
public String resetExpression(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                s.charAt(i) == '+' || s.charAt(i) == '-'
                || s.charAt(i) == '*' || s.charAt(i) == '/'|| s.charAt(i) == '%')
            result += " " + s.charAt(i) + " ";
        else
            result += s.charAt(i);
    }
    System.out.println(result);
    return result;
}//���ñ��ʽ��������
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**@��������������ݷ����ж���ջ����*/
public int evaluateExpression(String expression) {
    Stack<Integer> operandStack = new Stack<>();//����һ������ջ
    Stack<Character> operatorStack = new Stack<>();//����һ�������ջ
    expression = resetExpression(expression);//������ʽ,�����ǰ��ӿո�
    String[] tokens = expression.split(" ");//����ƥ�������������ʽ����ִ��ַ����� ����ֵ���ַ�������
//    for(int i=0;i<tokens.length;i++)
//    System.out.print(tokens[i]);
//    System.out.println();
    //�÷��������þ�����ʹ�ø����ı��ʽ�����Ʋ��� 0 ������������ split ���ط�������ˣ����������в�������β���ַ�����
    for (String token : tokens) {//����������ַ�����һ���ַ���
    	if (token.length() == 0)   //����ǿո�Ļ��ͼ���ѭ����ʲôҲ������
            continue;
    	//����ǼӼ��Ļ�����Ϊ�Ӽ������ȼ���ͣ���������ֻҪ�����Ӽ��ţ����۲�����ջ�е���ʲô�������Ҫ����
        else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
            //��ջ���ǿյģ�����ջ���������һ��Ԫ���ǼӼ��˳�������һ��
            while (!operatorStack.isEmpty()&&(operatorStack.peek() == '-' || operatorStack.peek() == '+' 
            		|| operatorStack.peek() == '/' || operatorStack.peek() == '*'|| operatorStack.peek() == '%')) {
                processAnOperator(operandStack, operatorStack);   //��ʼ����
            }
            operatorStack.push(token.charAt(0));   //������֮�󽫵�ǰ���������ջ
        }//else if������
        //��ǰ������ǳ˳���ʱ����Ϊ���ȼ����ڼӼ������Ҫ�ж���������Ƿ��ǳ˳�������ǳ˳������㣬����Ļ�ֱ����ջ
        else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%') {
        		while (!operatorStack.isEmpty()&&(operatorStack.peek() == '/' || operatorStack.peek() == '*'|| operatorStack.peek() == '%')) {
                processAnOperator(operandStack, operatorStack);
            }
            operatorStack.push(token.charAt(0));   //����ǰ��������ջ
        }//else if������
        //����������ŵĻ�ֱ����ջ��ʲôҲ���ò���,trim()����������ȥ���ո�ģ���������ķָ�������ܻ�����������пո�
        else if (token.trim().charAt(0) == '(') {
            operatorStack.push('(');
        }
        //����������ŵĻ������ջ�е������ֱ��������
        else if (token.trim().charAt(0) == ')') {
            while (operatorStack.peek() != '(') {
                processAnOperator(operandStack, operatorStack);    //��ʼ����
            }
            operatorStack.pop();   //�������������֮����������ţ��������ų������ջ
        }
        //������������ֵĻ�ֱ�������ݵ�ջ
        else {
            operandStack.push(Integer.parseInt(token));   //�������ַ���ת��������Ȼ��ѹ��ջ��
        }
    }//forѭ������
    //��������ջ�в��ǿյ�ʱ��������㣬ֱ��ջ��Ϊ�ռ���
    while (!operatorStack.isEmpty()) {
        processAnOperator(operandStack, operatorStack);
    }
    return operandStack.pop();    //��ʱ����ջ�е����ݾ�������Ľ��
}//����������ݷ���ջ��������

////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
/**
 * @��������������Ǽ��㵯������������
 * */
public void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
    char op = operatorStack.pop();  //����һ��������
    int op1 = operandStack.pop();  //�Ӵ洢���ݵ�ջ�е������������������Ͳ�����op����
    int op2 = operandStack.pop();
    if (op == '+')  //���������Ϊ+��ִ�м�����
        operandStack.push(op2 + op1);
    else if (op == '-')
        operandStack.push(op2 - op1);   //��Ϊ�����ջ�Ľṹ����Ȼ������������Ǻ���ģ������op2-op1
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
/**@�ж��ı���JA1�Ƿ�Ϊ�յķ���*/
public void isJA1empty() {
	if("".equals(JA1.getText())) 
   	 	b[1].setEnabled(false);
   else
   		b[1].setEnabled(true);
}//�ж��ı����Ƿ�Ϊ�յķ�������
/**@�ж��ı�������ĵ�һ���ַ��Ƿ�Ϊ���ֵķ���
 * @1.��������������ı���Ϊ��Ч����
 * @2.����������
 * */
public void isCharacter() {
	if(JA1.getText().charAt(0)=='+'||JA1.getText().charAt(0)=='-'
			||JA1.getText().charAt(0)=='*'||JA1.getText().charAt(0)=='/'
			||JA1.getText().charAt(0)=='%') {
	JA1.setText("��Ч����");
	JA1.setEnabled(false);
	
	}
	else {
		JT2.setText(Integer.toString(evaluateExpression(JA1.getText())));
		JT3.setText(Integer.toBinaryString(evaluateExpression(JA1.getText())));
		
	}
	
}
}
