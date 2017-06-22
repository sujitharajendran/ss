package guvi;
import java.util.Scanner;
public class Ro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   String s=sc.nextLine();
		   char cs[]=s.toCharArray();
		   String t=sc.nextLine();
		   char ds[]=t.toCharArray();
		   int h=0,ss=0,eee=0,ll=0;
		   if(cs.length==ds.length)
		   {
		       for(int i=0,j=i+1;i<cs.length&&j<cs.length;i++,j++)
		       {
		           if(cs[i]==cs[j])
		           {
		               h=i;
		               ss=j;
		           }
		       }
		       for(int i=0,j=i+1;i<ds.length&&j<ds.length;i++,j++)
		       {
		           if(ds[i]==ds[j])
		           {
		               eee=i;
		               ll=j;
		           }
		       }
		   }
		   else
		   {
		       System.out.println("enter the correct input");
		   }
		   if(h==eee&&ss==ll)
		   {
		       System.out.println("true");
		   }
		   else
		   {
		       System.out.println("false");
		   }
		}
	}

	  
	   
