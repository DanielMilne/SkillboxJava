
public class Cat {
    private double originWeight;
    private double weight;

    //public static final double minweight = 90.0;      // Урок 4. минимальный вес
    // public static final double maxweight = 1000.0;    // максимальный вес
    public static final int eyescount = 2;              // константа количество глаз
    private Colors color;
    public static String name;


    private double minWeight = 90.0;
    private double maxWeight = 1000.0;
    public  double foodEated;                           // убрал static
    public int count;

   // public Cat() {
       // this(1500.0 + 3000.0 * Math.random());
      //  originWeight = weight;
      //  minWeight = minweight;
     //   maxWeight = maxweight;
    //    count++;                                 // урок 3. добавление в счетчик кошку
   // }


    // урок 5. массу и имя задаются при создании кошки
    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.originWeight = weight;
        if (this.weight >maxWeight || this.weight < minWeight)
            System.out.println("Cat is dead");
        else
        count++;
    }

    // Урок 7 метод копирования
    public Cat getCopyCat(Cat cat) {
        Cat cat2 = new Cat(cat.getName(), cat.getWeight());
        return cat2;
    }

    // геттер имени
    public static String getName() {
        return name;
    }

    // сеттер цвета
    public void setColor(Colors c) {
        this.color = c;
    }

    // геттер цвета
    public Colors getColor() {
        return color;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        foodEated = foodEated + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;                            // Урок 3. уменьшение счетчика
            return "Dead";
        } else if (weight > maxWeight) {
            count--;                            // Урок 3. уменьшение счетчика
            return "Exploded";

        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    // Урок 2. метод сходить в туалет
    public void pooPoo() {
        weight = weight - 10;
        System.out.println("Poo");
    }

    // метод возвращает массу съединной еды
    public Double foodCount() {                                // убрал static
        System.out.println(foodEated);
        return foodEated;
    }

    // Урок 3. Метод возвращает количество кошек
    public int getCount() {
        return count;
    }

}
