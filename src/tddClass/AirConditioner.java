package tddClass;

public class  AirConditioner {

    int acTemperature;
    String productName;
    boolean isOnOrOff;

    int increaseTemperature;
    int decreaseTemperature;
    String displayProductName;


    public AirConditioner(String productName,int acTemperature,boolean isOnOrOff) {
        this.productName = productName;
        this.acTemperature = acTemperature;
        this.isOnOrOff = isOnOrOff;
    }
    public void setIncreaseTemperature(){
        int temperature = 16;
    }
    public int getIncreaseTemperature(){
        return temperatureNow();
    }

    public int temperatureNow() {
        if (temperatureNow() < acTemperature) {

            return decreaseTemperature;
        }else {
            if (temperatureNow()>acTemperature){
                return increaseTemperature;
            }
            else {
                return temperatureNow();
            }
        }
    }
}
