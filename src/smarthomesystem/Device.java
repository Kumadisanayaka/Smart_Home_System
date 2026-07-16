package smarthomesystem;
public class Device {
    private String name;
    private boolean power;
    
    public Device(String name){
        this.name = name;
    }
    
    public void turnOn(){
        power = true;
    }
    
    public void turnOff(){
        power = false;
    }
    
    public void showStatus(){
        
    }
}
