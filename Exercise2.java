// error - the String make and model should be public instead of private, car.stop not defined

// correct code (fixed)
class Car  {
    public String make;
    public String model;

    public  Car(String make, String model){
        this.model = model;
        this.make = make;
    }
    public void start(){
        System.out.println("starting the car");
    }
}
public class Exercise2 {
 public static void main(String[] args) {
    Car car = new Car("Toyota","Camry");
    car.start();
    
 }
    
}


