import java.util.Scanner; // импорт сканера

public class Main //класс мейн
{
   // private static int minIncome = 200000; // переменные
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000; // переменные
    
    private static double taxFromMininvest = (minInvestmentsAmount/(1-mainTaxPercent))-minInvestmentsAmount; 
    private static double minIncome = ((calculateFixedCharges()+minInvestmentsAmount+taxFromMininvest)/ (1-managerPercent));
    
    public static void main(String[] args) // метод мейн
    {
        while (true) // цикл while
        {
            System.out.println("Введите сумму доходов компании за месяц " + // текст в консоль
                    "(от" + minIncome + "до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); // вызываем сканер в переменную income

            if (!checkIncomeRange(income)) { // цикл if проверяет границы дохода
                continue; // останавлиыает цикл и продолжает работу программы
            }

            double managerSalary = income * managerPercent; // расчитывает managerSalary
            double pureIncome = income - managerSalary - // расчитывает pireIncome
                    calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome; // расчитывает taxAmount
            double pureIncomeAfterTax = pureIncome - taxAmount; // расчитывает pureIncomeAftertax

            boolean canMakeInvestments = pureIncomeAfterTax >= // проверяет minInvestmentAmount
                    minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary); // выводит в консоль зарплату мененджера
            System.out.println("Общая сумма налогов: " + // выводит в консоль Общую сумму налогов
                    (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " + // распечатывает компания модет инвестировать да или нет
                    (canMakeInvestments ? "да" : "нет"));
            if (pureIncome < 0) { // если pureIncome меньше 0 распечатывает  "Бюджет в минусе! Нужно срочно зарабатывать!
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) // метод checkIncomeRange
    {
        if (income < minIncome) //цикл if вывод в консоль информацию о границах в зависимости от income
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() // метод calculateFixedCharges это фиксированные платежы для простоты расчетов
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
