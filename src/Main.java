public class Main {
    public static void main(String[] args) {
        //task 6

        int age = 30;
        int salary = 60000;
        double limit = 0;
        if (age >= 23) {
            limit = salary * 3;
        }
        if (age < 23) {
            limit = salary * 2;
        }
        if (salary >= 80000) {
            limit = limit * 1.5;
        } else if (salary >= 50000) {
            limit = limit * 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");


        //task 7
        int wantedSum = 400000;
        int loanTerm = 12;
        double baseRate = 0.1;
        double monthlyPayment = 0;
        double maxMonthlyPayment = salary * 0.5;
        if (age < 30 && age >= 23) {
            baseRate = baseRate + 0.005;
        } else if (age < 23) {
            baseRate = baseRate + 0.01;
        }
        if (salary > 80000) {
            baseRate = baseRate - 0.007;
        }
        monthlyPayment = wantedSum / loanTerm + wantedSum * baseRate / 12;
        if (monthlyPayment < maxMonthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано.");
        }

    }
}