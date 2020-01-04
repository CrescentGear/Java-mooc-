//1.单词长度
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String a;
			a=in.nextLine();
			String count[]=a.split(" ");
			for(int i=0;i<count.length;i++)
			{
				if(count[i].length()==0)
				{
					continue;
				}
				if(i<count.length-1)
				{
					System.out.print(count[i].length());
					System.out.print(" ");
				}
				else
				{
					System.out.print(count[i].length()-1);
				}
			}
		
	}
}

//2.
