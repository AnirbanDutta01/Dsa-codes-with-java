import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
/*class Test {
  public static void main(String[] args) {
    int age,i,sum=0,price=0;
    Scanner sc=new Scanner(System.in);
    //int n=sc.nextInt();
    System.out.println("enter 20 ages:");
    for(i=0;i<5;i++){
      age=sc.nextInt();
      if(age<17){
        price=200;
      }
      else if(age<17 && age<=40){
        price=400;
      } 
      else if(age>40){
        price=300;
      } 
      sum=sum+price;
     }
     System.out.println(sum);
  }
}*/
/*class test2{
  public static void main(String[]args) {
    String str1,str2="";
    char chr1;
    int i,k=0,p,c=0;
    System.out.println("enter the words:");
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
    str1=' '+str1;
    //char chr2[20];
    int l1=str1.length();
    for(i=0;i<l1;i++){
      chr1=str1.charAt(i);
      if(chr1==' '){
        str2=str2+str1.charAt(i+1);
      }
    }
    char [] arr2=str2.toCharArray();
    
    Arrays.sort(arr2);
   System.out.println(arr2);



   char arr3[]=new char[arr2.length];
    
    for(i=0;i<arr2.length-1;i++){
      c=0;
      for(int j=0;j<arr3.length;j++)
      {
        
        if(arr3[j]==arr2[i]){
          c++;
        }
        if(c==0)
        arr3[k++]=arr2[i];}
        //arr3[c]=arr2[arr2.length-1];
       // System.out.println("new eliminated array is :"+ arr2[i]);
    }
    //String s3=new String(arr3);
    for(i=0;i<arr3.length;i++){
    System.out.print( arr3[i]);
  }
  }
}
*/
/*class Solution {
     public static void main(String[] args) {
        int i=0;
        String [] s =  {"h","e","o"}; 
        System.out.print("[");
        for(i=s.length-1;i>=0;i--){
        System.out.print(s[i]+",");
        }
        System.out.print("]");

    }
}*//*public class Test {
    public static int countGreatPartitions(int[] nums, int k) {
        int MOD = 1000000007;
        int n = nums.length;
        
        // Create a dp array to store the number of distinct great partitions
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                // Include nums[i-1] in the second group
                dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                
                // Include nums[i-1] in the first group
                if (j > 0 && nums[i - 1] >= k) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }
            }
        }
        
        // Calculate the total number of distinct great partitions
        int total = 0;
        for (int j = 1; j <= n; j++) {
            total = (total + dp[n][j]) % MOD;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
      Test radhika = new Test();
      Scanner sc=new Scanner(System.in);
      //int a[]=new int[u];
      int u=sc.nextInt();
      int v=sc.nextInt();
      int a[]=new int[u];
      for(int i=0;i<v;i++){
          a[i]=sc.nextInt();
      }
      //int k = 4;
      int count = Test.countGreatPartitions(a, u);
      System.out.println(count);

    }
}*/
/*import java.util.*;
public class Test{
	public static void cal(String str,int num){
		int a=(int)str.charAt(0);
		int b=(int)str.charAt(1);
		while(a>10)
			a=val(a);
		while(b>10)
			b=val(b);
		if((num %a!=0)&&(num%b!=0))
			System.out.println("Not Possible");
		else{
			int a1=0;
			int b1=0;
			if(num%a==0){
				a1=num/a;
				while(a1>0){
					a1=a1-b;
					b1=b1+a;
					System.out.println(str.charAt(1)+b1+" "+str.charAt(0)+a1);

				}
			}
			
		}
	}
	public static int val(int num){
		int res=0;
		while(num!=0){
			res+=(num%10);
			num/=10;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String str=sc.next();
		System.out.println("Enter the number:: ");
		int n=sc.nextInt();
		cal(str,n);
	}
}*/
/*/import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int placementleloo = 0;
        List<Integer> a = new ArrayList<>();
        for (char i : s1.toCharArray()) {
            a.add((int) i);
        }
        Collections.sort(a);
        int res = 0;
        int prev = (int) s1.charAt(0);
        for (char i : s2.toCharArray()) {
            int b = (int) i;
            int l = 0, r = a.size() - 1;
            int placementlelo = Integer.MAX_VALUE;
            int curr = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (a.get(mid) == b) {
                    curr = prev;
                    placementlelo = 0;
                    break;
                } else if (a.get(mid) < b) {
                    if (Math.abs(a.get(mid) - b) < placementlelo) {
                        placementlelo = Math.abs(a.get(mid) - b);
                        curr = a.get(mid);
                    } else if (Math.abs(a.get(mid) - b) == placementlelo) {
                        if (Math.abs(curr - prev) > Math.abs(a.get(mid) - prev)) {
                            curr = a.get(mid);
                            placementlelo = Math.abs(a.get(mid) - prev);
                        } else {
                            placementlelo = Math.abs(curr - prev);
                        }
                    }
                    l = mid + 1;
                } else {
                    if (Math.abs(a.get(mid) - b) < placementlelo) {
                        placementlelo = Math.abs(a.get(mid) - b);
                        curr = a.get(mid);
                    } else if (Math.abs(a.get(mid) - b) == placementlelo) {
                        if (Math.abs(curr - prev) > Math.abs(a.get(mid) - prev)) {
                            curr = a.get(mid);
                            placementlelo = Math.abs(a.get(mid) - prev);
                        } else {
                            placementlelo = Math.abs(curr - prev);
                        }
                    }
                    r = mid - 1;
                }
            }
            prev = curr;
            res += placementlelo;
        }
        System.out.println(res);
    }
}
*/
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int good = 0;
        List<Integer> a = new ArrayList<>();
        for (char i : s1.toCharArray()) {
            a.add((int) i);
        }
        Collections.sort(a);
        int res = 0;
        int prev = (int) s1.charAt(0);
        for (char i : s2.toCharArray()) {
            int b = (int) i;
            int l = 0, r = a.size() - 1;
            int minGood = Integer.MAX_VALUE;
            int curr = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (a.get(mid) == b) {
                    curr = prev;
                    minGood = 0;
                    break;
                } else if (a.get(mid) < b) {
                    if (Math.abs(a.get(mid) - b) < minGood) {
                        minGood = Math.abs(a.get(mid) - b);
                        curr = a.get(mid);
                    } else if (Math.abs(a.get(mid) - b) == minGood) {
                        if (Math.abs(curr - prev) > Math.abs(a.get(mid) - prev)) {
                            curr = a.get(mid);
                            minGood = Math.abs(a.get(mid) - prev);
                        } else {
                            minGood = Math.abs(curr - prev);
                        }
                    }
                    l = mid + 1;
                } else {
                    if (Math.abs(a.get(mid) - b) < minGood) {
                        minGood = Math.abs(a.get(mid) - b);
                        curr = a.get(mid);
                    } else if (Math.abs(a.get(mid) - b) == minGood) {
                        if (Math.abs(curr - prev) > Math.abs(a.get(mid) - prev)) {
                            curr = a.get(mid);
                            minGood = Math.abs(a.get(mid) - prev);
                        } else {
                            minGood = Math.abs(curr - prev);
                        }
                    }
                    r = mid - 1;
                }
            }
            prev = curr;
            res += minGood;
        }
        System.out.println(res);
    }
}*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        //System.out.println(containsDuplicate(nums));
    //}
    //public static boolean containsDuplicate(int[] nums) {
        int i;
        boolean b=false;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Integer j:map.values()){
            if(j>=2){
                b=true;
                System.out.println(j);
                System.out.println(b);
            }
            else{
                b=false;
                System.out.println(j);
                System.out.println(b);
            }
            
        }
        //return b;
    }
}




