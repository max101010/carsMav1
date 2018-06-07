import builders.CarBuilder;
import cars.Car;
import cars.Type;
import director.Director;
import park.CarPark;
import park.ParkReader;
import java.io.FileNotFoundException;

public class Main {


    pu

      carPark.addCar(bus);
      carPark.addCar(auto);
      carPark.addCar(truck);

      carPark1.addCar(bus);
      carPark1.printAll();
        carPark.printAll();
       carPark.maxPrice();
       carPark.maxSpeed();
//      CarPark.removeCar(truck);
//      CarPark.printAll();

        //вывод на консоль автомобилей из текстового списка
      /*  try {
            ParkReader parkReader = new ParkReader();
            ParkReader.readList();
            for (String s : parkReader.getListReader()) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
      /*
        try {
            ParkReader.readList();
            ParkReader.showList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
    }

}