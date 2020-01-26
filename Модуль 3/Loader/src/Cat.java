
public class Cat {
    private double originWeight;
    private double weight;
    public static final int EYESCOUNT = 2;              // константа количество глаз
    private Colors color;
    public static String name;
    private static final double MIN_WEIGHT = 80.0;
    private static final double MAX_WEIGHT = 1000.0;
    public double foodEated;                           // убрал static
    public static int count = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;                                 // урок 3. добавление в счетчик кошку
    }


    // урок 5. массу и имя задаются при создании кошки
    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.originWeight = weight;
        if (this.weight > MAX_WEIGHT || this.weight < MIN_WEIGHT) {
            System.out.println("Cat is dead");
        } else {
            count++;
        }
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

    // метод мяу
    public void meow() {
        boolean wasAlive = (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT);
        weight--;
        if (wasAlive && (weight < MIN_WEIGHT || weight > MAX_WEIGHT)) {
            count--;
            System.out.println("кошка умирает один раз и счетчик не уменьшается - победа :)");
        }
        System.out.println("Meow");
    }

    // метод еда
    public void feed(Double amount) {
        boolean wasAlive = (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT);
        weight = weight + amount;
        foodEated = foodEated + amount;
        if (wasAlive && (weight < MIN_WEIGHT || weight > MAX_WEIGHT)) {
            count--;
            System.out.println("кошка умирает один раз и счетчик не уменьшается - победа :)");
        }
    }

    // метод пить
    public void drink(Double amount) {
        boolean wasAlive = (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT);
        weight = weight + amount;
        if (wasAlive && (weight < MIN_WEIGHT || weight > MAX_WEIGHT)) {
            count--;
            System.out.println("кошка умирает один раз и счетчик не уменьшается - победа :)");
        }
    }

    // Урок 2. метод сходить в туалет
    public void pooPoo() {
        boolean wasAlive = (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT);
        weight = weight - 10;
        if (wasAlive && (weight < MIN_WEIGHT || weight > MAX_WEIGHT)) {
            count--;
            System.out.println("кошка умирает один раз и счетчик не уменьшается - победа :)");
        }
    }


    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
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
