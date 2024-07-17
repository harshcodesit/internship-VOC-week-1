// error :- the refrence should be with respect to 1 as first three numbers in fibonacci series are 0,1,1 

//correct code(fixed)
public class Exersise4 {
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int result = fibonacci(n);
        System.out.println("the fibonacci number at position "+ n + "is:" + result);
    }
}
