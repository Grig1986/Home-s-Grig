import java.util.WeakHashMap;

public class Car {
    private Engine engine;
    private Body body;
    private Wheels wheels;

    public Car(Body body, Engine engine, Wheels wheels) {
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
//чтобы вывести в консоль класс Car, переопределяем метод toString
    @Override
    public String toString() {
        return "engine: " + engine + "\nbody: " + body + "\nwheels: " + wheels;
    }
}
