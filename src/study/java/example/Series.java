package study.java.example;

public class Series {

    public long nSum(int n){
        return (n *(n+1))/2;
    }

    public long factorial(int n){

        if(n==0){

           return 1;
        }
        else
        {
           return  (n * factorial(n-1));
        }

    }

    public long fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int n1 = 1; int n2 = 0;

        for(int count = 2; count <= n; count++){
           n2+= n1+count;

        }
        return n2;
    }
}
