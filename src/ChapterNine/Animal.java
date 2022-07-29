package ChapterNine;

public class Animal extends LivingThings{
    public Animal(){
        System.out.println("New Animal Created");
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Move like animal");
    }
    public void myFathersMove(){
        System.out.println("Moving like my Ancestors");
    }
}
