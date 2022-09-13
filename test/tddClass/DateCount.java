package tddClass;

public class DateCount {
    private static void converter(int days) {
        int years = days / 366;
        days = days - (366 * years);
        int month = days / 30;
        int day = days - (month * 30);

        System.out.println(years + " years " + month + " months " + day + " days ");
    }

    public static void main(String[] args) {
        converter(54);
    }
}
//Methodsinarraylist
//add
//remove
//checksize
//add at index
//remove at index
//get at index
