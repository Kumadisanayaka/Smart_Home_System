
package smarthomesystem;

public class Fan extends Device {
    private int speed;

    public Fan() {
        super("Fan");
        speed = 0;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public int getSpeed(){
        return speed;
    }
    
}
