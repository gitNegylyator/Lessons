package lesson6.homework3;

public class Car {
    String model;
    //String engine;

    public String getModel() {
        return model;
    }

    public Car(String model) {
        this.model = model;
        //this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
