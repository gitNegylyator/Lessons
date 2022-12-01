package lesson6.homework3;

public class LenovoComputer extends Computer {
    @Override
    public void loadSystem () {
        System.out.println("загрузка компьютера Lenovo");
    }
    @Override
    public void work () {
        System.out.println("Выполняет вычисления");
    }
}
