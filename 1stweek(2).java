//1.分数
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
class Fraction  {
	int fenmu;
	int fenzi;
	Fraction (int a ,int b)
	{
		fenmu=b;
		fenzi=a;
	}
	double toDouble(int c) //将分数转换为double
	{
		double result;
		result=(double)c;
		return result;
	}
	Fraction plus(Fraction r) //将自己的分数和r的分数相加，产生一个新的Fraction的对象。
	{
		int temp1;
		int temp2;
		int result1;
		int result2;
		temp1=this.fenmu;
		temp2=this.fenzi;
		result2=temp1*r.fenmu;
		result1=temp2*r.fenmu+r.fenzi*temp1;
		Fraction result=new	Fraction (result1,result2);
		return result;
	}
	Fraction multiply(Fraction r) //将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	{
		int result1;
		int result2;
		result1=this.fenzi*r.fenzi;
		result2=this.fenmu*r.fenmu;
		Fraction result=new Fraction(result1,result2);
		return result;
	}
	void print()
	{
		int temp;
		int i;
		i=2;
		temp=1;
		while(i<fenmu)
		{
			if(fenzi%i==0 && fenmu%i==0)
			{
				temp=i;
			}
			i++;
		}
		if(fenzi%fenmu!=0)
		{
			if(fenzi%temp==0 && fenmu% temp==0)
			{
				System.out.print(fenzi/temp+"/");
				System.out.print(fenmu/temp);
			}
			else
			{
				System.out.print(fenzi+"/");
				System.out.print(fenmu);
			}
		}
		else
		{
			System.out.print(fenzi/fenmu);
		}
		System.out.println();
	}
//	将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
//	如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。

}
