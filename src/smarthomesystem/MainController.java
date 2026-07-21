package smarthomesystem;

import java.util.ArrayList;

public class MainController {

    private ArrayList<Room> rooms;


    public MainController() {

        rooms = new ArrayList<>();


        Room livingRoom = new Room("Living Room");

        livingRoom.addDevice(new Light());
        livingRoom.addDevice(new Fan());
        livingRoom.addDevice(new TV());
        livingRoom.addDevice(new Door());


        Room bedroom = new Room("Bedroom");

        bedroom.addDevice(new Light());
        bedroom.addDevice(new Fan());
        bedroom.addDevice(new AC());


        Room kitchen = new Room("Kitchen");

        kitchen.addDevice(new Light());
        kitchen.addDevice(new Fan());


        Room office = new Room("Office");

        office.addDevice(new Light());
        office.addDevice(new Fan());
        office.addDevice(new AC());


        rooms.add(livingRoom);
        rooms.add(bedroom);
        rooms.add(kitchen);
        rooms.add(office);
    }



    public Light getLight(String roomName){

        Room room = getRoom(roomName);


        if(room != null){

            for(Device device : room.getDevices()){

                if(device instanceof Light){

                    return (Light) device;
                }
            }
        }

        return null;
    }



    public Fan getFan(String roomName){

        Room room = getRoom(roomName);


        if(room != null){

            for(Device device : room.getDevices()){

                if(device instanceof Fan){

                    return (Fan) device;
                }
            }
        }

        return null;
    }



    public AC getAc(String roomName){

        Room room = getRoom(roomName);


        if(room != null){

            for(Device device : room.getDevices()){

                if(device instanceof AC){

                    return (AC) device;
                }
            }
        }

        return null;
    }



    public TV getTv(String roomName){

        Room room = getRoom(roomName);


        if(room != null){

            for(Device device : room.getDevices()){

                if(device instanceof TV){

                    return (TV) device;
                }
            }
        }

        return null;
    }



    public Door getDoor(String roomName){

        Room room = getRoom(roomName);


        if(room != null){

            for(Device device : room.getDevices()){

                if(device instanceof Door){

                    return (Door) device;
                }
            }
        }

        return null;
    }



    private Room getRoom(String roomName){

        for(Room room : rooms){

            if(room.getName().equals(roomName)){

                return room;
            }
        }

        return null;
    }



    public ArrayList<Room> getRooms(){

        return rooms;
    }
    
    public ArrayList<Object[]> getDeviceStatus(){
    
        ArrayList<Object[]> statusList = new ArrayList<>();
        
        for(Room room : rooms){
            for(Device device : room.getDevices()){
                String value = "-";
                
                if(device instanceof Light){
                    Light light = (Light)device;
                    
                    value = String.valueOf(light.getBrightness());
                
                }else if(device instanceof Fan){
                    Fan fan = (Fan)device;
                    
                    value = String.valueOf(fan.getSpeed());
                
                }else if(device instanceof TV){
                    TV tv = (TV) device;
                    
                    value = String.valueOf(tv.getVolume());
                
                }else if(device instanceof AC){
                    AC ac = (AC) device;
                    
                    value = String.valueOf(ac.getTemperature());
                
                }else if(device instanceof Door){
                    Door door = (Door) device;
                    
                    value = door.getLockStatus();
                
                }
                
                statusList.add(new Object[]{
                    room.getName(),
                    device.getName(),
                    device.getPowerStatus(),
                    value
                    
                    
                });
            }
        }
        return statusList;
    
    }

}