import java.util.Arrays;
import java.util.Scanner;


public class ColumnarTranspo 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String key,plain;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enetr the message:- ");
		plain = sc.nextLine();
		char[] plainArray = new char[plain.length()];
		plainArray = plain.toCharArray();
		
		System.out.print("Enetr the key:- ");
		key = sc.nextLine();
		char[] keyArray = new char[key.length()];
		char[] copyKeyArray=new char[key.length()];
		
		keyArray = key.toCharArray();
		
		copyKeyArray = key.toCharArray();;
	
	
		int temp=(int)Math.ceil(plain.length()/key.length());
		int temp1=key.length();
		int count=0;
		//int count1=0;
		
		char cipher[][]=new char[temp+1	][temp1]; 
		
		for(int row=0;row<=temp;row++)
		{
			for(int col=0;col<temp1;col++)
			{
				if(count < plain.length())
				{
					cipher[row][col]=plainArray[count++];
				}
				else
				{
					cipher[row][col]='*';
				}
			}
		}
		
		int pos[]=new int[temp1];
		
		Arrays.sort(copyKeyArray);
		for(int i =0;i<temp1;i++)
		{
			for(int j=0;j<temp1;j++)
			{
				if(copyKeyArray[i]==keyArray[j])
				{
					pos[i]=j;
				}
			}
			
		}
		
		
		System.out.println();
		System.out.println("\n Matrix of plain text ");
		
		for(int row=0;row<=temp;row++)
		{
			for(int col=0;col<temp1;col++)
			{
				System.out.print(cipher[row][col]+" ");
			}
			System.out.println();
		}
		
		/*for(int row=0;row<temp1;row++)
		{
			for(int col=0;col<=temp;col++)
			{
				System.out.print(cipher[col][pos[row]]);
			}
		}
		*/
		char ciphertext[]=new char[100];
		count=0;
		for(int row=0;row<temp1;row++)
		{
			for(int col=0;col<=temp;col++)
			{
				System.out.print(ciphertext[count++]=cipher[col][pos[row]]);
			}
		}
	}
}
