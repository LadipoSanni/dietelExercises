package tddClass;

public class AutomaticBike {
    private boolean now;
    private int gear= 0;
    public int accelerate= 0;



       public boolean bikeIsOnOrOff(boolean now) {
           this.now = setOnOrOff();

           return now;
       }

       public boolean setOnOrOff() {
           if(now){
              System.out.println("Your Sonja bike is On");

              if(!now)System.out.println("Your Sonja bike is Off");


        }

        return now;
    }

    public boolean isOn() {
           return now;
    }

    public void power() {
           if(setOnOrOff()==false){
               System.out.println("Bike is On");
           }else {
               System.out.println("Bike is Off");
           }

    }

}