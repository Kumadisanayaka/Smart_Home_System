
package smarthomesystem;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Device> devices;

    public Room(String name) {
        this.name = name;
        devices = new ArrayList<>();
    }
    
    public void addDevice(Device device){
        devices.add(device);
    }
    
    public ArrayList<Device> getDevices(){
        return devices;
    }
    
    public String getName(){
        return name;
    }
    
    
}
