public class Main {
    public static void main(String[] args) {

        //Задача 6
        System.out.println("Задача 6");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        System.out.println("Общий вес двух бойцов " + (boxerOneWeight + boxerTwoWeight) + " кг");
        System.out.println("Разница между весами бойцов " + (boxerTwoWeight - boxerOneWeight) + " кг");

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница между весами бойцов (1 способ) " + (boxerTwoWeight - boxerOneWeight) + " кг");
        System.out.println("Разница между весами бойцов (2 способ) " + (boxerTwoWeight % boxerOneWeight) + " кг");

        //Задача 8
        System.out.println("Задача 8");
        var workHours = 640;
        var oneWorker = 8;
        System.out.println("Всего работников в компании - " + (workHours / oneWorker) + " человек");
        var allWorker = workHours / oneWorker + 94;
        System.out.println(allWorker);
        System.out.println("Если в компании работает " + allWorker + " человек, то всего " + (oneWorker * allWorker) + " часов работы может быть поделено между сотрудниками");







    }
}