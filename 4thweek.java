//1.素数和
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m;
		n=in.nextInt();
		m=in.nextInt();
		int i,k,index,result;
		i=2;
		k=0;
		index=0;
		result=0;
		//求素数
		while(i>1)
		{
			for(k=2;k<i;k++)
			{
				if(i%k==0)
				{
					break;
				}
			}
			if(i==k)
			{
				index++;
				if(index>=n && index<=m)
				{
					result=result+i;
				}
				if(index==m)
				{
					break;
				}
			}
			i=i+1;
		}
		System.out.println(result);
	}
}

//2.念整数
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int number2;
		int temp;
		int length;
		int count;
		number=in.nextInt();
		if(number<0)
		{
			System.out.print("fu ");
			number=0-number;
		}
		else if(number==0)
		{
			System.out.print("ling");
		}
		number2=number;
		temp=number/10;
		count=1;
		while(number2>10)
		{
			number2=number2/10;
			count++;
		}
		temp=number2;

		while(number>0)
		{
			switch(temp)
			{
				case 0:
					System.out.print("ling");
					break;
				case 1:
					System.out.print("yi");
					break;
				case 2:
					System.out.print("er");
					break;
				case 3:
					System.out.print("san");
					break;
				case 4:
					System.out.print("si");
					break;
				case 5:
					System.out.print("wu");
					break;
				case 6:
					System.out.print("liu");
					break;
				case 7:
					System.out.print("qi");
					break;
				case 8:
					System.out.print("ba");
					break;
				case 9:
					System.out.print("jiu");
					break;
			}
			number=(int)(number-temp*Math.pow(10.0, (double)(count-1)));
			count=count-1;
			if(count>=1)
			{
				System.out.print(" ");
			}
			if(number>10)
			{
				temp=number/10;
			}
			else
			{
				temp=number;
			}
		}
	}
}
