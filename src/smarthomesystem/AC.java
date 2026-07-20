
package smarthomesystem;

public class AC extends Device {
    private int temperature;
    public AC() {
        super("AC");
        temperature = 0;
    }
    
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    
    public int getTemperature(){
        return temperature;
    }
}
