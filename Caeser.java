/*
Name :-    SARFARAZ KHAN
Roll No :- 14CO42
Batch :-   3
Experiment 1 

 */
 
import java.util.*;
public class Caeser 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the text :- ");
		String pts=sc.nextLine();

		System.out.print("\nEnter the shift key :- ");
		int ki=sc.nextInt();
		while(ki>6)
		{
			System.out.print("Choose another shift key between 1 to 6 :- ");
			ki=sc.nextInt();
		}
				
		char pta[]=pts.toCharArray();
		System.out.println();
		System.out.println();
		//for(int i=0;i<pts.length();i++)
		//System.out.print(pta[i]);
		
		
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
		System.out.print("After Encryption :- ");
		
		for(int i=0;i<pts.length();i++)
		    System.out.print(pta[i]);
		    
		    
		    
		    for(int i=0;i<pts.length();i++)
				if(pta[i]!=' ')
				{
					int a1 = (int)pta[i];
					//System.out.println(a1+ki);
					if(a1-ki < 65)
					{
						a1 = a1-ki;
						a1=a1+26;					
					}
					else if(a1-ki > 91 && a1-ki < 97)
					{
						a1 = a1-ki;
						a1=a1+26;
					}
					else
					{
						a1 = a1-ki;
					}
					//System.out.println(pta[i]=(char)a1);
					pta[i]=(char)a1;
				}
				else
					pta[i]=pta[i];
					
				
				
		System.out.println();
		System.out.print("\nAfter Decrytpion :- ");
		
		for(int i=0;i<pts.length();i++)
		    System.out.print(pta[i]);
		    
		    
	}
}

/*

OUTPUT :-
 
Enter the text :- Hello How Are You

Enter the shift key :- 2



After Encryption :- Jgnnq Jqy Ctg Aqw

After Decrytpion :- Hello How Are You

*/
