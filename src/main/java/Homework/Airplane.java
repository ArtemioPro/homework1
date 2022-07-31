package Homework;

public class Airplane {
    int capacity;
    String model;

    public Airplane (int capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

void typeOfAirplane(){
        if (capacity <= 200) {
            System.out.println("Модель самолета: Бизнес джет");
        } else {
            System.out.println(" Модель самолета: Боинг ");
        }
}

}
