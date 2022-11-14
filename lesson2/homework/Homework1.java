package lesson2.homework;

public class Homework1 {
    public static void main(String[] args) {
        //Базовая домашка
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        double height = 1.85;
        double weight = 76.5;
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        double bodyMassIndex = (weight) / (height * height);
        //Пример результата вывода на экран:
        //21.00202130120
        System.out.println(bodyMassIndex);

        // Задание №2
        // Дано:
        int ageChildren = 17;
        int maxAgeChildrenAgeMinderGarten = 6;
        int minAgeJuniorSchool = 7;
        int maxAgeJuniorSchool = 11;
        int ageMiddleSchool = 17;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
        // отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад,
        if (ageChildren <= maxAgeChildrenAgeMinderGarten) {
            System.out.println("Ребенок идет в сад");
        }
        // если до 11 лет в младшую школу,
        else if (ageChildren <= maxAgeJuniorSchool && ageChildren >= minAgeJuniorSchool) {
            System.out.println("Ребенок идет в младшую школу");
        } else if (ageChildren <= ageMiddleSchool && ageChildren >= maxAgeJuniorSchool) {
            // если до 17 лет в среднюю школу,
            System.out.println("Ребенок идет в среднюю школу");
        } else {
            System.out.println("Ребенок идет в университет");
        }
        // иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.


        // Задание №3
        // Дано:
        //Курица
        boolean chicken = false;
        //Овощи
        boolean vegetables = true;
        //Соус
        boolean sour = false;
        //Хлеб
        boolean toast = false;
        //Колбаса
        boolean sausage = false;
        //Яйца
        boolean eggs = false;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        if (chicken && vegetables && (sour && toast)) {
            System.out.println("Повар приготовит салат Цезарь");
            // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        } else if (vegetables && (sausage || chicken) && eggs) {
            System.out.println("Повар приготовит салат Оливье");
            // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        } else if (vegetables) {
            System.out.println("Повар готовит овощной салат");
            // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        } else {
            System.out.println("Ингредиентов недостаточно!\nНевозможно ничего приготовить!");
        }
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String someFigure = "234";
        String someText = "some_text";
        int someFigureNumber = Integer.parseInt(someFigure);
        int someTextLength = someText.length();
        System.out.println(someFigureNumber + someTextLength);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        double resultTask2 = (a * a + 2 * a * b + b * b); // я искал как можно сделать это при помощи
        // функции Math.pow() но к сожалению ничего не нашел и применил математическую формулу...
        System.out.println(resultTask2);

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        int hasFuelPrice = 1000;
        boolean hasElectricsProblem = false;
        int hasElectricsProblemPrice = 5000;
        boolean hasMotorProblem = false;
        int hasMotorProblemPrice = 10_000;
        boolean hasTransmissionProblem = true;
        int hasTransmissionProblemPrice = 4000;
        boolean hasWheelsProblem = true;
        int hasWheelsProblemPrice = 2000;
        double price = 0;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        if (!hasFuel && (hasElectricsProblem && hasMotorProblem && hasTransmissionProblem && hasWheelsProblem)) {
            price = hasFuelPrice;
            System.out.println("В машине ничего не сломано с вас " + hasFuelPrice + " рублей");
        }
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        if (hasMotorProblem) {
            price = price + hasTransmissionProblemPrice;
            System.out.println("В машине неисправен двигатель, с вас " + hasMotorProblemPrice + " рублей");
        }
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        if (hasElectricsProblem) {
            price = price + hasElectricsProblemPrice;
            System.out.println("В машине неисправна электропроводка, с вас " + hasElectricsProblemPrice + " рублей");
        }
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        if (hasTransmissionProblem) {
            price = price + hasTransmissionProblemPrice;
            System.out.println("В машине неисправна коробка передач, с вас " + hasTransmissionProblemPrice + " рублей");
        }
        // Если у машины проблема с колесами, то чинят и берут 2000.
        if (hasWheelsProblem) {
            price = price + hasWheelsProblemPrice;
            System.out.println("В машине проблемы с колесами, с вас " + hasWheelsProblemPrice + " рублей");
        }

        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            double discount2 = 0.8;
            price = price * discount2;
        }
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        else if ((hasTransmissionProblem && hasWheelsProblem)
                || (hasWheelsProblem && hasElectricsProblem)
                || (hasWheelsProblem && hasTransmissionProblem)) {
            double discount = 0.9;
            price = price * discount;
        }

        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        if (!hasFuel && (!hasElectricsProblem || !hasMotorProblem || !hasTransmissionProblem || !hasWheelsProblem)) {
            System.out.println("Консультация бесплатно");
        }
        System.out.println("Итого с учетом скидок с вас " + price + " рублей");
            // Ситуации, что бензин есть и ничего не сломано - быть не может.
            // Ожидаемый результат: выведен на экран счет клиенту.

            //Экспертный уровень
            //Задача №1
            //Создать метод маскирования персональных данных, который:
            //Телефон (до/после маскирования): 79991113344 / 7999***3344
            //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
            //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
            //
            //Входящие параметры: String text
            //Возвращаемый результат: String
            //
            //Примеры возможного текста:
            //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
            // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
            //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
            //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

            //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
            //Регулярные выражения, класс StringBuilder
        }
    }
