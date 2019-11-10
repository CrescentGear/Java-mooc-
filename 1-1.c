/*
温度转换（5分）

题目内容：

写一个将华氏温度转换成摄氏温度的程序，转换的公式是：

    °F = (9/5)*°C + 32

其中C表示摄氏温度，F表示华氏温度。

程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。

提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：

    (int)x;

其中x是要转换的那个浮点数。


注意：除了题目要求的输出，不能输出任何其他内容，比如输入时的提示，输出时的说明等等都不能。这道题目要求转换后的数字，程序就只能输出这个数字，除此之外任何内容都不能输出。


输入格式:

一个整数。


输出格式：

一个整数。


输入样例：

100


输出样例：

37
*/

//代码：
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int f;
		int c;
		f=in.nextInt();
		c=(int)((f-32.0)*5.0/9.0);
		System.out.println(c);
	}

}
