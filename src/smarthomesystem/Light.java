
package smarthomesystem;
public class Light extends Device {
    
    int brightness;

    public Light() {
        super("Light");
    }
    
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    
    public int getBrightness(){
        return brightness;
    }
}
