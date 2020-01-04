//1.多项式加法
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number1_coef= new int [100];
		int[] number1_expon= new int [100];
		int[] number2_coef=new int [100];
		int[] number2_expon=new int [100];
		int[] result_coef=new int [100];
		int[] result_expon=new int [100];
		Scanner in = new Scanner(System.in);
		int max1,max2; //个数
		int coef ,expon;//系数  指数
		int i,j,k;
		i=0;
		j=0;
		k=0;
		do
		{
			expon=in.nextInt();
			coef=in.nextInt();
			number1_expon[i]=expon;
			number1_coef[i]=coef;
			i++;
		}while(expon!=0);
		max1=i;
		do
		{
			expon=in.nextInt();
			coef=in.nextInt();
			number2_expon[j]=expon;
			number2_coef[j]=coef;
			j++;
		}while(expon!=0);
		max2=j;
		i=0;
		j=0;
		while(i<=max1 && j<=max2)
		{
			if(number1_expon[i]>number2_expon[j])
			{
				result_expon[k]=number1_expon[i];
				result_coef[k]=number1_coef[i];
				k++;
				i++;
			}
			else if(number1_expon[i]<number2_expon[j])
			{
				result_expon[k]=number2_expon[j];
				result_coef[k]=number2_coef[j];
				k++;
				j++;
			}
			else
			{
				result_expon[k]=number2_expon[j];
				result_coef[k]=number2_coef[j]+number1_coef[i];
				k++;
				j++;
				i++;
			}
		}
		for(i=0;i<k;i++)
		{
			if(result_coef[i]!=0 &&result_expon[i]!=0  )
			{
				if(result_expon[i]!=1)
				{
					System.out.print(result_coef[i]+"x"+result_expon[i]);
				}
				else
				{
					System.out.print(result_coef[i]+"x");
				}
			
			}
			else if(result_expon[i]==0 && result_coef[i]!=0)
			{
				System.out.print(result_coef[i]);
				break;
			}
			if(i<k-1)
			{
				System.out.print("+");
			}
		}
	}
}
