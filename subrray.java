import java.util.*;
class subarray {
    public static void printsubarray(int num[]) {
        int i,j,k,ts=0;
        for(i=0;i<num.length;i++){
            int start=i;
            for(j=i;j<num.length;j++){
                int end=j;
                for(k=start;k<=end;k++){
                     System.out.print(num[k]+" ");
                     
                     //System.out.print("sum is :"+(start+end) );
                }
                ts++;
            
                System.out.println();
            }
        }
        System.out.println("total sub array:"+ts);
    }
        public static void main(String[]args){
           int num[]={2,4,6,8,10};
           printsubarray(num);
        }
}
