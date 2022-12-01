package lesson6.homework3;

        public abstract class Electronic {
           public void electronicOn () {
                System.out.println("Прибор включен");
            }
           public void electronicOff () {
                System.out.println("Прибор выключен");
            }
            public abstract void work ();

        }