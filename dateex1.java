import java.util.*;
class dateex1
{
	public static void main(String args[])
	{ 
	 long curentmilisec=System.currentTimeMillis();

	Date date=new Date(curentmilisec);

	long time =date.getTime()/(1000*60*60*24);

	System.out.println("calculate is "+time);
	}
}