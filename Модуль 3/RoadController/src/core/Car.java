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

    //Setter getNumber
    public void setNumber(String number)
    {
        this.number = number;
    }
    //Getter getNumber
    public String getNumber()
    {
        return number;
    }
    //Setter getHeight
    public void setHeight(int height)
    {
        this.height = height;
    }
    //Getter getHeight
    public int getHeight()
    {
        return height;
    }
    //Setter getWeight
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    //Getter getWeight
    public double getWeight()
    {
        return weight;
    }
    //Setter hasVehicle
    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }
    //Getter hasVehicle
    public boolean getHasVehicle()
    {
        return hasVehicle;
    }
    //Setter IsSpecial
    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }
    //Getter IsSpecial
    public boolean getIsSpecial()
    {
        return isSpecial;
    }
}
