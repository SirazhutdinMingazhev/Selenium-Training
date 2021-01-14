package Core_Java;

public class VehicleSpeed {

/*    int speed=100;*/

    int speed;
    int calculateSpeed(int speed){
        return speed*80;
    }
}

class Car extends VehicleSpeed{
    void displaycarspeed(){
        calculateSpeed(100);
    }
}


