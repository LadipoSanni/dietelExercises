package Tolu;

public class MyCar extends Vehicle implements CarKeys, Accelerate{
    String name;
    int model;
    String color;
    String type;
    public MyCar(String name, int model, String color, String type) {
        super(name, model, color, type);
    }

    CarKeys keys = new CarKeys() {
        @Override
        public void startCar() {

        }

        public String button() {

            String button1 = "Open";
            String button2 = "Close";
            String button3 = "SetSecurityAlarm";
            String button4 = "startCar";
            return null;
        }



    };


    public void move(){

            int gear1 = 2;
            int gear2 = 6;
            int gear3 = 18;
            int gear4 = 54;

//accelerate gear and parkWell.
    }

    public String automaticDoor() {
        String doorIsOpen = "open";
        String doorIsClose = "close";

        return null;
    }


    public String getName(){return name;}
    public int getModel(){return model;}
    public String getColor(){return color;}
    public String getType(){return type;}

    public static void main(String[]args){
        MyCar vehicle = new MyCar("",0,"", "");


        System.out.println(vehicle.getName());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getType());


    }

    @Override
    public void setGear() {
        int gear = 0;


    }

    @Override
    public int getGear() {
        return 0;
    }

    @Override
    public void setReverse() {
        String reverse = getReverse();

    }

    @Override
    public String getReverse() {
        return reverse;
    }

    @Override
    public String button() {
        String button1 = "Open Door";
        String button2 = "Close Door";
        String button3 = "setSecurityAlarm";
        if(button()==button1){
            System.out.println("OpenDoor");
        }else {
            if(button()==button2) {
                System.out.println("CloseDoor");
            }else{
                System.out.println("setSecurityAlarm");
                return button3;
            }

        }
        return null;



    }

    @Override
    public void startCar() {

    }
}
