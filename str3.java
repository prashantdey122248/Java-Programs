import java.util.Scanner;

class str3
{
	public static void main(String args[])
	{	
	String s1,rev=" ";

	Scanner sc=new Scanner(System.in);
	s1=sc.nextLine();

	String s2=s1;

		for(int i=0;i<s1.length();i++)
		{
		 char st=s1.charAt(i);

		rev=st+rev;
		}
		System.out.println(rev);
	
		if(rev.equals(s2))
		{
		System.out.println("is polingrom");
		}
		else
		{
		System.out.println("is not polingrom");
		}

}
}