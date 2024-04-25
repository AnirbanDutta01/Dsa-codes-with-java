import java.util.*;
class Test2{
    public static void main(String[]args){
       /* int n,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of animal:");
        n=sc.nextInt();
        System.out.println("enter total no of legs:");
        l=sc.nextInt();
        if(l==0 || n>l){
            System.out.println("not possible.");
        }
        else{
            int x=(4*n-l)/2;
            System.out.println("total number of 2 legged animals="+x);
            System.out.println("total number of 4 legged animals="+(200-x));
        }*/
        int[]nums={0,1,0,3,12};
        int i,c=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                al.add(nums[i]);
            }
        }
        while(c!=0){
            al.add(0);
            c--;
        }
        Integer[]nums2=al.toArray(new Integer[al.size()]);
        for(i=0;i<nums2.length;i++){
            System.out.println(nums2[i]);
            
        }
    }
}