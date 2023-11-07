class duplicateElement
{
	public static void main(String[]args)
	{
		String[]str={"Aditya","Ashish","Mandar","Ganesh","Ganesh","Aditya"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate elements are::"+str[i]);
				}
			}
		}
	}
}