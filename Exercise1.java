

// error : - the condition in the for loop should be "i<number.length" instead of "i<=number.length"


//correct code(fixed)
public class Exercise1 {

    public static void main(String args[])
    {
        int[] number = {1,2,3,4,5}; 
   for(int i = 0;i<number.length;i++){
    System.out.println(number[i]);
   }
}
}
  