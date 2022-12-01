package lesson6.homework3;

public class Computer extends Electronic {
    public void loadSystem () {
        System.out.println("загрузка компьютера");
    }

    @Override
    public void work() {
        System.out.println("Выполняет вычисления");
    }
}
