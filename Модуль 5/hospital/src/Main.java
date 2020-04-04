import java.text.DecimalFormat;

public class Main {
    public static final double MAX_HEALTHY_TEMP = 36.90;
    public static final double MIN_HEALTHY_TEMP = 36.20;
    public static final double MIN_TEMP = 32.00;
    public static final double MAX_TEMP = 40.00;


    public static void main(String[] args) {
//Создать массив с температурами 30-ти пациентов (от 32 до 40 градусов).
        float[] temperature = new float[30];
        float temprNumber = 0;
        int healthyPeople = 0;
        for (int i = 0; i < temperature.length; i++) {
            float randomInt = (float) (MIN_TEMP + Math.random() * (MAX_TEMP - MIN_TEMP));
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
            if ((MIN_HEALTHY_TEMP < temperature[i]) && (temperature[i] < MAX_HEALTHY_TEMP)) {
                healthyPeople++;
            }
        }
        System.out.println("Количество здоровых пациентов - " + healthyPeople);


    }
}
