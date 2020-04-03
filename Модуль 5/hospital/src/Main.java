import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//Создать массив с температурами 30-ти пациентов (от 32 до 40 градусов).
        float[] temperature = new float[30];
        float temprNumber = 0;
        int healthyPeople = 0;
        for (int i = 0; i < temperature.length; i++) {
            float randomInt = (float) (32 + Math.random() * 8);
            temperature[i] = randomInt;
        }
//Написать код, рассчитывающий среднюю температуру по больнице
        for (int i = 0; i < temperature.length; i++) {
            temprNumber = temprNumber + temperature[i];
        }
        temprNumber = temprNumber / 30;

        DecimalFormat df = new DecimalFormat("##.#");
        System.out.println("Средняя температура по больнице - " + df.format(temprNumber));

//количество здоровых пациентов (с температурой от 36,2 до 36,9)
        for (int i = 0; i < temperature.length; i++) {
            if ((36.2 < temperature[i]) && (temperature[i] < 36.9)) {
                healthyPeople++;
            }
        }
        System.out.println("Количество здоровых пациентов - " + healthyPeople);


    }
}