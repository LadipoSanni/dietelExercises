package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AutomaticBikeTest {
    @Test
    public void automaticBikeTest() {
        AutomaticBike sonja = new AutomaticBike();
    }
    @Test
    public void setOnOrOff(){
        AutomaticBike sonja = new AutomaticBike();
        sonja.setOnOrOff();
        assertEquals(false,sonja.isOn());



    }
    @Test
    public void checkOnOrOff(){
        AutomaticBike sonja = new AutomaticBike();
        sonja.power();
        assertEquals(false,sonja.isOn());



    }
}