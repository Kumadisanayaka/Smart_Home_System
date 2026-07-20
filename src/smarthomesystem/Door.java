
package smarthomesystem;
public class Door extends Device {
    
   
   private boolean locked; 

    public Door() {
        super("Door");
    }
    
    public void lock(){
        locked = true;
    }
    
    public void unlock(){
        locked = false;
    }
    
    public String getLockStatus(){
        return locked ? "LOCKED" : "UNLOCKED";
    }
}
