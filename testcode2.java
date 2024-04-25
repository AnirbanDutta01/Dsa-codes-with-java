
//import java.util.*;
/*class Shortname{
	public static void main(String[]args){
		String st1,st2,st3;
		char chr;
		int i,p,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name");
		st1=sc.nextLine();
		st1=' '+st1;
		 p=st1.length();  
		for(i=0;i<p;i++){// from gandhi g to last space
			chr=st1.charAt(i);
			if(chr==' '){
				c++;
				if (c!=3)
				System.out.print(st1.charAt(i+1)+".");
				else
				System.out.print(st1.substring(i+1, p));
			}
		}
		
	}
}*/
import java.util.*;
class Palindrom{
	public static void show(String str){
		int n=str.length();
		int c=0;
		for(int i=0;i<n/2;i++){
			if(str[i]==str[n-1-i])
				c++;
		}
		if(c==((n/2)+1))
			System.out.println("The string "+str+" is palindrom.");
		else
			System.out.println("The string "+str+" is not palindrom.");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String str=sc.next();
		show(str);
	}
}


 