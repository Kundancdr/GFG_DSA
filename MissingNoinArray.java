public class MissingNoinArray{
    public static void MissingNumber(int numbers[],int n){
        int Totalsum=0;
        Totalsum=n*(n+1)/2;
        int sum=0;

        for(int i=0;i<numbers.length;i++){
          sum=sum+numbers[i];
        }
        // for(int j=0;j<6;j++){
        //     Totalsum +=j;
        // }
       int Result=Totalsum-sum;
       System.out.println(Result);

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,5};
        int n=5;
        MissingNumber(numbers,n);

    }


    
}