import java.util.*;
/*class patterns1 {
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int j=0;j<4;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class patterns2{
    public static void main(String[]args){
        int i,j,m=4,n=5;
        for(i=1;i<=m;i++){  //outer loop 
            for(j=1;j<=n;j++){  //inner loop
                if(i==1||j==1||i==m||j==n){     //for boundary ..we can clearly see that only for i=1 and i=4 and j=1 and j=5 there are complete stars
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");     //for others like .. for i=2 and i=3 corresponding j=2thand j=3rd and j=4th pos there are no  stars
                }
            }
            System.out.println();
        }
    }
}*/
/*class pattern3{
    public static void main(String[]args){
        int i,j,n=4;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class pattern4{
    public static void main(String[]args){
        int i,j,n=4;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class pattern5{  //right side pyramid..space priting
    public static void main(String[]args){
        int i,j,k,n=4;
        for(i=0;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class pattern6{     //number printing
    public static void main(String[]args){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}*/
/*class pattern6{     //number printing
    public static void main(String[]args){
        
        int n = 6;
        for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+"");
      }
      System.out.println();
        }
    }
}*/
/*class pattern7{     //number printing..floyd triangle
    public static void main(String[]args){
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}*/
/*class pattern8{     //0-1 triangle printing
    public static void main(String[]args){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}*/
/*class pattern8{           //perfect pyramid
    public static void main(String[]args){
        int i,j,k,n=6,p=0;
        for(i=0;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(p+" ");
            }
            System.out.println();
            p++;
        }
    }
}*/
/*class pattern9{       //perfect rhombus
    public static void main(String[]args){
        int i,j,k,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class pattern10{
    public static void main(String[]args){
        int n=4 ;
        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            //right half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            //right half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/
/*class Pattern11{          //palindrome no pyramid
	public static void main(String[] args){
            int n=4;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}*/
/*class pattern12{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
            //lower half
            for( int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                
                System.out.println();
        }
        
    }
}
*/