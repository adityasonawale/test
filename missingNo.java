import java.util.*;
class missingNo
{
	public static void main(String[]args)
	{
		int[]a={1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=1;i<=9;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("missing element is :"+(sum1-sum));
	}
}