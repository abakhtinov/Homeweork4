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

        int yearnow = 2012;
        int x = 3;
        int year2 = yearnow / x;
        int year3 = yearnow % 100;
        int year400 = yearnow % 400;
        if (year2==0 && year3!=0 && year400==0) {
            System.out.println(yearnow + " год является високосным");}
        else if(year2!=0 && year3==0 && year400!=0) {
            System.out.println(yearnow + " год не является високосным");
            System.out.println(year2);
            System.out.println(year3);
        }


            }
}