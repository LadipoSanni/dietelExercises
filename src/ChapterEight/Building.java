
package ChapterEight;
public class Building {


    String name;
    String type;
    String address;
    int numbersOfFloors;
    int numbersOfRooms;

    public Building() {
        name = "Alhaji's House";
        type = "Residential";
        address = "3, oladeinde";
        numbersOfFloors = 2;
        numbersOfRooms = 18;



    }
    public String getName(){ return name;}
    public String getType(){return type;}
    public String getAddress(){return address;}
    public int getNumberOfFloors(){return numbersOfFloors;}
    public int getNumbersOfRooms(){return numbersOfRooms;}

    public static void main(String[] args) {

        Building house = new Building();
        System.out.println();
        System.out.printf("%s%n%s%n%s%n%d%n%d",house.getName(),house.getType(),house.getAddress(),
                house.getNumberOfFloors(),house.getNumbersOfRooms());
    }

}




