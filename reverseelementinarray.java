class Arrayyy{
     public static  void reverse(int num[]) {
        int swap,start=0,last=num.length-1;
        while(start<last){
            swap=num[last];
            num[last]=num[start];
            num[start]=swap;
            start++;
            last--;
}
} 
public static void main(String[] args)  {
        int num[]={2,5,6,9,8,7};
        int i;
        reverse(num);
        for(i=0;i<num.length;i++){
            System.out.print(num[i]+"	");
        }
        System.out.println();
}
}
