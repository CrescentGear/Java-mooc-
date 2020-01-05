//1.分解质因数
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number,temp,i;
		number=in.nextInt();
		temp=number;
		i=2;
		System.out.print(number+"=");
		while(i<temp)
		{
			if(number%i==0)
			{
				if(number==temp)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("x"+i);
				}
				number=number/i;
				i=2;
			}
			else
			{
				i++;
			}
		}
	}
}

//2.完数
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number,i,result,number1,number2,count;
		boolean flag;
		number1=in.nextInt();
		number2=in.nextInt();
		number=number1;
		count=0;
		flag=false;
		while(number<number2)
		{
			i=1;
			result=0;
			while(i<number)
			{
				if(number%i==0)
				{
					result+=i;
				}
					i++;
			}
			if(result==number)
			{
				if(count!=0)
				{
					System.out.print(" ");
				}
				System.out.print(result);
				count++;
				flag=true;
			}
			number++;
		}
		if(flag==false)
		{
			System.out.print(" ");
		}
	}
}
