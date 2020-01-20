
public class Main {
    public static void main(String[] args) {

        // проверка метода копирования кошки
        Cat cat1 = new Cat("Murka", 90.0);
        System.out.println(cat1.getCount());
        Cat cat3 = new Cat("vasja", 120.0);
        //  Cat cat4 = new Cat(); // почему если снять комментирование этой строки вес других кошек тоже становится рандомом
        System.out.println(cat1.getCount());
        Cat cat2 = cat1.getCopyCat(cat1);
        System.out.println(cat1.getCount());
        cat3.pooPoo();
        System.out.println(cat3.getWeight());
        cat3.pooPoo();
        System.out.println(cat3.getWeight());
        cat3.pooPoo();
        System.out.println(cat3.getWeight());
        cat3.pooPoo();
        cat3.pooPoo();
        System.out.println(cat3.getCount());
        System.out.println(cat1.getCount());
        System.out.println(cat2.getCount());

        System.out.println(cat3.getWeight());
        cat3.pooPoo();

        /* Урок 1.
        // 5 кошек
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        Cat cat12 = new Cat(1005.0);
        cat1.setColor(Colors.BLACK);

        // Урок 2.
        // Проверяю вес кошек
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        System.out.println(cat1.getStatus());
        cat1.meow();                                // проверка уменьшение веса
        cat1.feed(10.1);
        cat1.drink(10.1);
        System.out.println(cat1.getWeight());

        // цикл замяукивания кошки до смерти
        do {
            cat1.meow();
        }
        while (cat1.getWeight() > 1000);
        System.out.println(cat1.getStatus());

        // Перекормление кошки для взрыва
        do {
            cat2.feed(10.1);
        }
        while (cat2.getWeight() < 9000);
        System.out.println(cat2.getStatus());

        System.out.println(cat3.getWeight());
        cat3.pooPoo();                              // вызов метода "сходить в туалет"
        System.out.println(cat3.getWeight());       // вызов метода "сходить в туалет"
        cat1.foodCount();
        cat2.feed(10.1);
        System.out.println(cat1.foodCount());
        Cat.getCount();
        System.out.println(cat12.getWeight());
        System.out.println(cat1.getColor());
 */
    }
}
