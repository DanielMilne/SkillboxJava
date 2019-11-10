package core;

public class Car
{
    public String number;        // создание переменной number
    public int height;           // создание переменной height
    public double weight;        // создание переменной weight
    public boolean hasVehicle;   // создание переменной hasVehicle
    public boolean isSpecial;    // создание переменной isSpecial

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";  // создание переменной special
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}