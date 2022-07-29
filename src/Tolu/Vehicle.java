package Tolu;

public class Vehicle {
    private String name;
    private int model;
    private String color;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(String name, int model, String color, String type){
       this. name= name;
       this. model= model;
       this. color= color;
       this.type= type;
    }

    public void move(){
        System.out.println("I am moving!");
    }
    public void accelerate(){
        System.out.println("I am accelerating!");
    }

}
