package lesson6.homework3;

import lesson6.homework3.advanced.*;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        //Базовый уровень
        // Задание №1
        // Создать следующие классы
        // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
        // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)

        // 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
        Computer amd = new Computer();
        amd.loadSystem();
        amd.electronicOff();
        // 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
        // Метод work у компьютера выводит в консоль "выполняет вычисления".
        LenovoComputer lenovoComputer = new LenovoComputer();
        lenovoComputer.loadSystem();
        lenovoComputer.work();
        lenovoComputer.electronicOn();
        //Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override

        //Задание №2
        //Создать два класса машин, создать 4 экземпляра и положить их в один массив

        CarToyota carToyota1 = new CarToyota("Corola");
        CarToyota carToyota2 = new CarToyota("RAV-4");
        CarToyota carToyota3 = new CarToyota("IPSUM");
        CarToyota carToyota4 = new CarToyota("Crucer");
        Car [] cars = new Car[] {carToyota1,carToyota2, carToyota3, carToyota4};
        for (Car car: cars)
        System.out.println(car.getModel());

        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        FirTree firTree = new FirTree();
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        PineTree pineTree = new PineTree();
        // растение -> роза (умеет цвести, умеет пахнуть)
        Rose rose = new Rose();
        // растение -> папоротник (умеет цвести)
        Fern fern = new Fern();

        Plant[] plants = new Plant[] {firTree, pineTree, rose, fern};
        for (Plant plant : plants) {
            plant.canSmell();
            plant.canBloom();
        }

        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        // Задание №2:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        //Экспертный уровень:
        //Задача №1
        // Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
        // Для этого шаблона характерно:
        // 1. приватный конструктор,
        // 2. вложенный статический класс (HumanBuilder)
        // 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
        // Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
        // 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
        // которые вызывают сеттеры у экземпляра класса Human.
        // 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
        // Ожидаемый результат
        // Human human = Human.builder().name("Петр").age(20).weight(80).build();
        // human.info()
        // Петр - возраст 20, вес 80
    }


}
