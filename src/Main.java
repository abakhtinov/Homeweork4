public class Main {
    public static void main(String[] args) {
        //Задание 1

        int clientOS = 1;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");}

        //Задание 2

        int clientDeviceYear = 2015;
        boolean year = clientDeviceYear < 2015;
        if (clientOS==0 && year == true) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if(clientOS==1 && year == true){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");};

        //Задание 3

        int yearnow = 2016;
        int year2 = yearnow % 4;
        int year3 = yearnow % 100;
        int year400 = yearnow % 400;
        if (year2==0 && year3!=0 || year400==0) {
            System.out.println(yearnow + " год является високосным");}
        else {
            System.out.println(yearnow + " год не является високосным");
        }

        //Задание 4


        int deliveryDistance = 95;
        int daysforDelivery = 1;
        int daysForDelivery2060 = daysforDelivery+1;
        int daysForDelivery60 = daysForDelivery2060+1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysforDelivery);}
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println(" Потребуется дней: " + daysForDelivery2060);}
            else{
                System.out.println("Потребуется дней: " + daysForDelivery60);
            }

        //Задание 5


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Некорректно указан месяц");}




    }


}