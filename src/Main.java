public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte day = 1;
        short week = 7;
        int month = 31;
        long year = 365L;

        double riceWeight = 3.75;
        float sugarWeight = 4.523F;

        // Задание 2
        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Вес двух боксёров составляет " + boxersWeight + " кг!");
        double differenceWeight = (boxerOneWeight - boxerTwoWeight) % boxersWeight;
        System.out.println("Разница в весе боксёров " + differenceWeight + " кг");
        double differenceWeights = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе между боксёрами " + differenceWeights + " кг!");

        // Задание 3
        int banana = 80;
        byte piecesOfBanana = 5;
        long bananas = banana * piecesOfBanana;
        System.out.println("Вес 5 бананов состовляет " + bananas + " гр!");
        long milk = 105L;
        long milkMl = 200L;
        long milkWeight = milk * 2;
        System.out.println("Вес молока " + milkWeight + " гр");
        long iceCreame = 100L;
        long iceCreameWeight = iceCreame * 2;
        System.out.println("Вес 2 брикетов мороженного " + iceCreameWeight + " гр");
        int eggs = 70;
        byte piecesOfEggs = 4;
        long piecesOfEggsWeight = eggs * piecesOfEggs;
        System.out.println("Вес всех яиц составляет " + piecesOfEggsWeight + " гр");
        long sportsBreakfast = bananas + milkWeight + iceCreameWeight + piecesOfEggsWeight;
        System.out.println("Вес спорт завтрака составил " + sportsBreakfast + " гр");
        float weightSportBreakfast = sportsBreakfast / 1000F;
        System.out.println("Вес готового спорт завтрака в кг " + weightSportBreakfast + " кг!");

        // Задание 4
        long weight = 7000L;
        long weightInDay = 250L;
        long weightOfDay = 500L;
        long allDays = weight / weightInDay;
        System.out.println("Всего " + allDays + " дней потребуется спортсмену, если он будет худеть в день по 250гр");
        long weightAllDays = weight / weightOfDay;
        System.out.println("Всего " + weightAllDays + " дней потребуется спортсмену, если он будет худеть в день по 500гр");
        long aboutDays = (weight / weightAllDays) % allDays;
        System.out.println("В среднем спортсмену понадобиться " + aboutDays + " дня");

        // Задание 5
        long mashasSalary = 67760L;
        long denisSalary = 83690L;
        long kristinaSalary = 76230L;
        int allYear = 12;
        long mashasYearsSalary = mashasSalary * allYear;
        System.out.println("Годовой доход Маши " + mashasYearsSalary + " рублей");
        long denisYearsSalary = denisSalary * allYear;
        System.out.println("Годовой доход Дениса " + denisYearsSalary + " рублей");
        long kristinaYearsSalary = kristinaSalary * allYear;
        System.out.println("Годовой доход Кристины " + kristinaYearsSalary + " рублей");
        double precentMashasSalary = mashasSalary * 0.1;
        System.out.println("10 процентов от зарплаты Маши " + precentMashasSalary + " рублей");
        double precentDenisSalary = denisSalary * 0.1;
        System.out.println("10 процентов от зарплаты Дениса " + precentDenisSalary + " рублей");
        double precentKristinaSalary = kristinaSalary * 0.1;
        System.out.println("10 процентов от зарплаты Кристины " + precentKristinaSalary + " рублей");
        double mashasNewSalary = mashasSalary + precentMashasSalary;
        System.out.println("Новая зарплата Маши составила " + mashasNewSalary + " рублей в месяц");
        double denisNewSalary = denisSalary + precentDenisSalary;
        System.out.println("Новая зарплата Дениса составила " + denisNewSalary + " рублей в месяц");
        double kristinaNewSalary = kristinaSalary + precentKristinaSalary;
        System.out.println("Новая зарплата Кристины составила " + kristinaNewSalary + " рублей в месяц");
        double mashasNewSalaryInYear = mashasNewSalary * allYear;
        double denisNewSalaryInYear = denisNewSalary * allYear;
        double kristinaNewSalaryInYear = kristinaNewSalary * allYear;
        double mashasDifferenceSalary = mashasNewSalaryInYear - mashasYearsSalary;
        System.out.println("Теперь Маша получает " + mashasNewSalaryInYear + " рублей в год, что больше на " + mashasDifferenceSalary + " рублей с предыдущего годового дохода");
        double denisDiferenceSalary = denisNewSalaryInYear - denisYearsSalary;
        System.out.println("Теперь Денис получает " + denisNewSalaryInYear + " рублей в год, что больше на " + denisDiferenceSalary + " рублей с предыдущего годового дохода");
        double kristinaDiferenceSalary = kristinaNewSalaryInYear - kristinaYearsSalary;
        System.out.println("Теперь Кристина получает " + kristinaNewSalaryInYear + " рублей в год, что больше на " + kristinaDiferenceSalary + " рублей с предыдущего годового дохода");

     }
}