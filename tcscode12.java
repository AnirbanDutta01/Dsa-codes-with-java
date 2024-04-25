import java.util.*;
public class tcscode12 {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting day:: ");
		String d=sc.nextLine();
		d=d.toLowerCase();
		System.out.println("Enter the number of days:: ");
		int nd=sc.nextInt();
		System.out.println("THe no of sun days are:: "+output(d,nd));
	}
	public static int output(String d,int nd){
		String week[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int res=0;
		int temp=0;
		for(int i=0;i<week.length;i++){
			if(week[i].equals(d)){
				if((week.length-1-i)<=nd){
					//res++;
					temp=week.length-1-i;
					break;
				}
			}
		}
		//System.out.println("Temp:: "+temp);
		while(temp<=nd){			
			res++;
			temp+=7;
        }
		return res;
	}

}
