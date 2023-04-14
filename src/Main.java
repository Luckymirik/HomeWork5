
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();




    }

    public static void task1() {
        System.out.println("Задача 1");
        boolean clientOS=true;
        if(clientOS){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        boolean clientOS = false;
        int clientDeviceYear = 2015;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }if(clientDeviceYear < 2015){ System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }

    }
    public static void task3() {
        System.out.println("Задача 3");
        int year= 2300;
        if ((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println(year+" год является високосным");
        }else{
            System.out.println(year+" год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
    int deliveryDistance = 95;
    int deliveryTime;
    if(deliveryDistance<=20){
        deliveryTime=1;
        System.out.println( "Потребуется дней: " + deliveryTime);
    } else if (20<deliveryDistance&&deliveryDistance<=60) {
        deliveryTime=2;
        System.out.println( "Потребуется дней: " + deliveryTime);
    } else if (60<deliveryDistance&&deliveryDistance<=100) {
        deliveryTime=3;
        System.out.println( "Потребуется дней: " + deliveryTime);
    }else{
        System.out.println( "Доставки нет. " );

    }
    }
    public static void task5() {
        System.out.println("Задача 4");
       byte monthNumber = 12;

       switch (monthNumber){
           case 1:
               System.out.println("Январь принадлежит к сезону зима");
               break;
           case 2:
               System.out.println("Февраль принадлежит к сезону зима");
               break;
           case 3:
               System.out.println("Март принадлежит к сезону весна");
               break;
           case 4:
               System.out.println("Апрель принадлежит к сезону весна");
               break;
           case 5:
               System.out.println("Май принадлежит к сезону весна");
               break;
           case 6:
               System.out.println("Июнь принадлежит к сезону лето");
               break;
           case 7:
               System.out.println("Июль принадлежит к сезону лето");
               break;
           case 8:
               System.out.println("Август принадлежит к сезону лето");
               break;
           case 9:
               System.out.println("Сентябрь принадлежит к сезону осень");
               break;
           case 10:
               System.out.println("Октябрь принадлежит к сезону осень");
               break;
           case 11:
               System.out.println("Ноябрь принадлежит к сезону осень");
               break;
           case 12:
               System.out.println("Декабрь принадлежит к сезону зима");
               break;
           default:
               System.out.println("Программа не будет выполняться");
       }
    }
    }






