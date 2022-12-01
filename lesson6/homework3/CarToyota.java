package lesson6.homework3;

public class CarToyota extends Car {
    @Override
    public String getModel() {
        return super.getModel();
    }

    public CarToyota (String model) {
       super(model);
   }

    @Override
    public String toString() {
        return "CarToyota{" +
                "model='" + model + '\'' +
                '}';
    }
}
