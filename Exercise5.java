// error:- the  conditionfor prime nuber was not implemented properly

//correct code (fi)
import java.util.*;
public class Exercise5 {
    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i % j ==0){
                    isPrime = false;
                 break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
        return primes;
}

public static void main(String[] args) {
    int n = 20;
    List<Integer> primeNumbers = findPrimes(n);
    System.out.println(primeNumbers);
}

}
