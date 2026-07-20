
package smarthomesystem;
public class MainController {
    private Light light;
    private Fan fan;
    private AC ac;
    private TV tv;
    private Door door;

    public MainController() {
        light = new Light();
        fan = new Fan();
        ac = new AC();
        tv = new TV();
        door = new Door();
    }

    public Light getLight() {
        return light;
    }

    public Fan getFan() {
        return fan;
    }

    public AC getAc() {
        return ac;
    }

    public TV getTv() {
        return tv;
    }

    public Door getDoor() {
        return door;
    }
    
}
