package day_50_method_hiding;

public class Car {
    private String model;
   public Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
