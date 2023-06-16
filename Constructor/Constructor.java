package Constructor;

public class Constructor {
    public static void main(String[] args) {

//        Honda
        Car honda = new Car();
        honda.engine = 500;
        honda.model = "vcc";
        honda.price = 50000.65f;

//        Suzuki
        Car suzuki = new Car(400, "vcs", 30000.30f);

//        Hyundai
//        Car hyundai = new Car(600, "vbx",);
//        Must parse the argument, else it gives error

//        Nexus
        Car nexus = new Car();
        System.out.println(nexus.engine+" "+nexus.model+" "+ nexus.price);

        Car vw = new Car(honda);
        System.out.println(vw.model);
    }
}

class Car {
    int engine;
    String model;
    float price;

//    This will apply by default, if the object instance doesn't provide the values
    Car() {
        engine = 100;
        model = "templateCar";
        price = 10000.10f;
    }

//    Constructor declared, object instance must parse the arguments within the constructor
    Car (int engine, String model, float price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    Car (Car other) {
        this.model = other.model;
    }
}