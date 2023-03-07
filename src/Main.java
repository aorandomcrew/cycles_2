public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int I = 0;
        while (total<2459000){
            total=total+salary;
            I=I+1;
            System.out.println("месяц "+ I + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("всего месяцев - " + I);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i=1;
        while (i<=10){
            System.out.print(" "+ i);
            i=i+1;
        }
        System.out.println();
        for (i=10;i>0;i--){
            System.out.print(" "+  i);
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year;
        int total = 12000000;
        int pros = ((total/1000) * 17 - (total/1000)*8);
        for (year=1; year<=10; year++){
            total=total+pros;
            System.out.println("Год " + year + ": численность населения составляет " + total );
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int total = 15000;
        int month = 0;
        while (total<=12000000){
            month=month+1;
            total=total + ((total/100)*7);
            System.out.println("месяц: " + month + " сумма накоплений: " + total);
        }
        System.out.println("всего месяцев: " + month);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int total = 15000;
        int month = 0;
        while (total<=12000000){
            month=month+1;
            total=total + ((total/100)*7);
            if(month%6==0){
                System.out.println("месяц: " + month + ", сумма накоплений: " + total);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15000;
        int month = 0;
        int halfYear;
        while (month<=108){
            month=month+1;
            halfYear=month/6;
            total=total + ((total/100)*7);
            if (month%6==0){
                System.out.println("полугодие: " + halfYear + ", сумма накоплений: " + total);
            }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 1;
        int monthDay=0;
        System.out.println("сегодня " + firstFriday + " нужно заполнить отчет");
        monthDay= monthDay + firstFriday;
        do {
            monthDay=monthDay+7;
            System.out.println("сегодня " + monthDay + " нужно заполнить отчет");
        }while (monthDay<=31-7);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int startYear = 1823;
        int endYear = 2123;
        while (startYear<endYear){
            startYear=startYear+1;
            if (startYear%79==0){
                System.out.println(startYear);
            }
        }

    }
}