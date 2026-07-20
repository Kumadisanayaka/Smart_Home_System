
package smarthomesystem;

public class TV extends Device {
    private int volume;

    public TV() {
        super("TV");
        volume = 0;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public int getVolume(){
        return volume;
    }
}
