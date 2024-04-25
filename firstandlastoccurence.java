package recursion;

public class firstandlastoccurence {
     public static int occur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occur(arr, key, i+1); //if notfound
    }
    public static int lastoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastoccur(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        
        return isfound;
    }
    public static void main(String[]args){
        int arr[]={1,2,5,6,5,7};
        System.out.println(occur(arr, 5, 0));
        System.out.println(lastoccur(arr, 5, 0));
    }
}
