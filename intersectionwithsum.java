package practice;
class unionandintersection{
  public static void intersection(int arr1[],int arr2[]){       //intersection is the common one
    int i,j,it=0,sum=0;
     int digit,number=0;
    int arr3[]=new int[50];
    for(i=0;i<arr1.length;i++){
        for(j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                arr3[it]=arr1[i];
                it=it+1;
            }
        }
    }
    for(i=0;i<it;i++){
        System.out.print(arr3[i]+" ");
    }
    for(i=0;i<arr3.length-1;i++){
        sum=sum+arr3[i];
    }
    System.out.println();
    System.out.println(sum);
    for(i=0;i<1;i++){
        if(sum%10==0){
            System.out.println(sum);
        }
        else{
            while(sum>0){
                digit=sum%10;//1
                number=digit+number;//0+1
                sum=sum/10;//4
            }
            System.out.print("sum of digits:"+number);
        }
    }
  } 
  public static void main(String[]args){
    int arr1[]={11,2,33,6};
    int arr2[]={33,6,7,2};
    intersection(arr1, arr2);
  }
}