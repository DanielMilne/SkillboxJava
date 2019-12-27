import core.*;
import core.Camera;

public class RoadController
{
    // Double и Integer классы
    public static Double passengerCarMaxWeight = 3500.0; // kg
    public static Integer passengerCarMaxHeight = 2000; // mm
    // изменил высоту пропускного пункта
    public static Integer controllerMaxHeight = 3500; // mm

    public static Integer passengerCarPrice = 100; // RUB
    public static Integer cargoCarPrice = 250; // RUB
    public static Integer vehicleAdditionalPrice = 200; // RUB

    //изменил скорость подъезжающих
    public static Integer maxOncomingSpeed = 60; // km/h
    public static Integer speedFineGrade = 20; // km/h
    public static Integer finePerGrade = 500; // RUB
    public static Integer criminalSpeed = 160; // km/h

    public static void main(String[] args)
    {
        for(Integer i = 0; i < 10; i++)
        {
            Car car = Camera.getNextCar();
            System.out.println(car);
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");

            /**
             * Пропускаем автомобили спецтранспорта
             */


            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
            // является ли это созданием переменной boolean policeCalled?
            Boolean policeCalled = false;
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                String carNumber = car.getNumber();
                if(carNumber.equals(criminalNumber)) {
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break;
                }
            }
            if(Police.wasCalled()) {
                continue;
            }

            // просто поменял местами порядок проверки
            if(car.isSpecial()) {
                openWay();
                continue;
            }

            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             */
            // Integer carHeight
            Integer carHeight = car.getHeight();
            //  Integer price
            Integer price = 0;
            if(carHeight > controllerMaxHeight)
            {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            }
            else if(carHeight > passengerCarMaxHeight)
            {
                // Double weight
                Double weight = WeightMeter.getWeight(car);
                //Грузовой автомобиль
                if(weight > passengerCarMaxWeight)
                {
                    price = cargoCarPrice;
                    if(car.hasVehicle()) {
                        price = price + vehicleAdditionalPrice;
                    }
                }
                //Легковой автомобиль
                else {
                    price = passengerCarPrice;
                }
            }
            else {
                price = passengerCarPrice;
            }

            /**
             * Проверка скорости подъезда и выставление штрафа
             */
            Integer carSpeed = Camera.getCarSpeed(car);
            if(carSpeed > criminalSpeed)
            {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            else if(carSpeed > maxOncomingSpeed)
            {
                // Integer overSpeed
                Integer overSpeed = carSpeed - maxOncomingSpeed;
                Integer totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine;
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    public static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}