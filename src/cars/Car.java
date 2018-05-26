package cars;

import park.CarPark;
import properties.Cars;
import properties.Colours;


public abstract class Car implements Cars {
/* Класс Car - базовый класс для всех видов автомобилей,
реализован интерфейс Cars, создан базовый конструктор
 */

    private int price;
    private String model;
    private Colours colour;
    private int speed;
    private CarPark carPark;
    public Car(String model, Colours colour, int speed, int price) {
        this.model = model;
        this.colour = colour;
        this.speed = speed;
        this.price = price;
    }

    //метод возвращает поле model
    public String getModel() {
        return model;
    }

    //метод возвращает поле colour
    public Colours getColour() {
        return colour;
    }

    //метод возвращает поле speed
    public int getSpeed() {
        return speed;
    }

    //метод возвращает поле price
    public int getPrice() {
        return price;
    }

    @Override
    public abstract void move();

    @Override
    public abstract void beep();
}
