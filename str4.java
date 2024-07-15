import java.util.Scanner;

class str4
{
	public static void main(String args[])
	{
	 String s;

	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();

	for(int i=0;i<s.length();i++)
	{
         for(int j=0;j<s.length();j++)
		{
		System.out.print(s.charAt(i));	
	}
}
}
}