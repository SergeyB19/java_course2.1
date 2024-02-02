package com.zaurtregulov.nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public static class Engine {
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        void method() {
            System.out.println(Engine.countOfObjects);
            Engine e = new Engine(200);
            System.out.println(e.horsePower);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }

        interface I {

        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}

class Z extends Car.Engine {

    public Z(int horsePower) {
        super(200);
    }
}
