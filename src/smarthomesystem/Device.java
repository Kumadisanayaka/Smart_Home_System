package smarthomesystem;
public class Device {
    private String name;
    private boolean power;
    
    public Device(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void turnOn(){
        power = true;
    }
    
    public void turnOff(){
        power = false;
    }
    
    public String getPowerStatus(){
        return power ? "ON" : "OFF";
    }
}
