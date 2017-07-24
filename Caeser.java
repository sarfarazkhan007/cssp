import java.util.*;
public class Caeser 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String pts=sc.nextLine();

		System.out.println("enter the shift key ");
		int ki=sc.nextInt();
				
		char pta[]=pts.toCharArray();
		System.out.println();
		System.out.println();
		//for(int i=0;i<pts.length();i++)
		  //  System.out.print(pta[i]);
		
		
		for(int i=0;i<pts.length();i++)
			if(pta[i]!=' ')
			{
				int a1 = (int)pta[i];
				//System.out.println(a1+ki);
				if(a1+ki > 90 && a1+ki < 97)
				{
					a1 = a1+ki;
					a1=a1-26;					
				}
				else if(a1+ki > 122)
				{
					a1 = a1+ki;
					a1=a1-26;
				}
				else
				{
					a1 = a1+ki;
				}
		//	System.out.println(pta[i]=(char)a1);
			pta[i]=(char)a1;
			}
			else
				pta[i]=pta[i];
				
				
				
				System.out.println();
		System.out.println();
		
		for(int i=0;i<pts.length();i++)
		    System.out.print(pta[i]);
		    
		    
		    
		    for(int i=0;i<pts.length();i++)
			if(pta[i]!=' ')
			{
				int a1 = (int)pta[i];
				//System.out.println(a1+ki);
				if(a1+ki > 90 && a1+ki < 97)
				{
					a1 = a1+ki;
					a1=a1-26;					
				}
				else if(a1+ki > 122)
				{
					a1 = a1+ki;
					a1=a1-26;
				}
				else
				{
					a1 = a1+ki;
				}
		//	System.out.println(pta[i]=(char)a1);
			pta[i]=(char)a1;
			}
			else
				pta[i]=pta[i];
				
				
				
				System.out.println();
		System.out.println();
		
		for(int i=0;i<pts.length();i++)
		    System.out.print(pta[i]);
		    
		    
		    /*for(int i=0;i<pts.length();i++)
			if(pta[i]!=' ')
			{
				int a1 = (int)pta[i]+ki;
				if(a1>90 && a1<97)
				{
					a1=a1-26;
				pta[i]=(char)a1;
				}
				else if(a1>122)
					a1=a1-26;
				pta[i]=(char)a1;
			}
			else
				pta[i]=pta[i];
		System.out.println();
		System.out.println();
		
		for(int i=0;i<pts.length();i++)
		    System.out.print(pta[i]);
	*/
	}
}
