package lesson6.homework3.advanced;

public class Rose extends Plant {
    @Override
    public void canSmell() {
        System.out.println("Роза: умеет пахнуть");
    }

    @Override
    public void canBloom() {
        System.out.println("Роза: умеет цвести");
    }
}
