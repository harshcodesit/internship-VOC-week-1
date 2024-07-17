// error : Divide(10,0) calls 10/0 which is an arithematic exception hence try and catch block is required 


//correct code (fixed)
public class Exercise3 {

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        try{
            System.out.println(numbers[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds");
        }
        try{
            int result = divide(10,0);
        System.out.println("Result:"+result);
        }catch(ArithmeticException e){
            System.out.println("Arithemagtic error");
        }
        
        
    }
    public static int divide(int a, int b){
        return a/b;
    }
}