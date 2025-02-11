package activities;

public class Activity1{
    public static void main(String[] args){
        Car Honda = new Car("Red","Manual",2020);
        System.out.println();
        Honda.displayCharacteristics();
        Honda.accelarate();
        Honda.brake();
    }
}
