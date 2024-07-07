class Vehicle{
    
    final void display(){
        System.out.println("Inside display method");
    }
}
class Car extends Vehicle{
    final String color="black";
    
}
class TestFinal{
    
    public static void main(String[] ar){
        Car car=new Car();
        System.out.println("Car Color is "+car.color);
        

       
    }
}