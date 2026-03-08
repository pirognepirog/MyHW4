//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //задача 1
     int intX = 1;
     byte byteX = 1;
     short shortX = 1;
     long longX = 1L;
     float floatX = 0.1f;
     double doubleX = 0.1D;
    System.out.println("Задача 1");
     System.out.println("int = " + intX + "; byte = " + byteX + "; short = " + shortX + "; long = " + longX + "; float = " + floatX + "; double = " + doubleX);

        //задача 2

    float f = 27.12f;
    long l = 987678965549L;
    float ff = 2.786f;
    short s = 569;
    short ss = -159;
    int sss = 27897;
    byte b = 67;

        //задача 3

        int t1 = 23;
        int t2 = 27;
        int t3 = 30;
        int p = 480;
        int x = p / (t1+t2+t3);
        System.out.println("Задача 3");
    System.out.println("На каждого ученика рассчитано " + x + " листов бумаги");

        //задача 4

        int bT = 16;
        int t = 2;
        int tX = 20;
        int minT = (bT/t)*tX;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + minT + " штук бутылок");
        tX = 24*60;
        minT = (bT/t)*tX;
        System.out.println("За сутки (" + tX + " минут)  машина произвела " + minT + " штук бутылок");

        tX = (3*24)*60;
        minT = (bT/t)*tX;
        System.out.println("За 3 дня (" + tX + " минут)  машина произвела " + minT + " штук бутылок");
// расчет выполнен для работы машины без остановки, для месяца взято условно число 30 (так как не известно какой месяц
// и какого года использовать)
        tX = (30*24) * 60;
        minT = (bT / t) * tX;
        System.out.println("За 1 месяц (" + tX + " минут)  машина произвела " + minT + " штук бутылок");
        System.out.println("Производительность машины в 1 минуту - " + bT/t +  " штук бутылок");

        //задача 5

        int xK = 120 / (2+4);//найдем количество классов
        int bK = xK * 2;//нужно белой краски
        int kK= xK * 4;//нужно коричневой краски
        System.out.println("Задача 5");
        System.out.println("В школе, где " + xK + " классов, нужно " + bK + " банок белой краски и " + kK + " банок коричневой краски");

        //задача 6
        System.out.println("Задача 6");
        int q = 0;//количество
        int v = 0;//вес 1 екдиницы
        float r = 0f;//общий вес
        var txt = "";// наименование компонента
        var txtQ = "";// наименование меры измерения
        //для бананов
        txt = "Бананы - ";
        txtQ = " гр.";
        q = 5;
        v = 80;
        r = q*v;
        System.out.println(txt + r + txtQ);
            txt = "Молоко  - ";
            txtQ = " гр.";
            q = 100;
            v = 105;
            r = q+v;
            System.out.println(txt + r + txtQ);
                    txt = "Мороженое-пломбир - ";
                    txtQ = " гр.";
                    q = 2;
                    v = 100;
                    r = q*v;
                    System.out.println(txt + r + txtQ);
                        txt = "Яйца сырые - ";
                        txtQ = " гр.";
                        q = 4;
                        v = 70;
                        r = q*v;
                        System.out.println(txt + r + txtQ);
// мешаем в блендере
        q = 5; //бананы
        v = 80;
        r = q*v;
            q =  100;//молоко
            v = 105;
            r = r + (q+v);
                q = 2;//мороженное
                v =  100;
                r = r + (q*v);
                    q = 4;//яйца
                    v = 70;
                    r = r + (q*v);
        System.out.println("В белндере смешано " + r + " гр. продуктов, что составляет " + r/1000 + " кг. общей массы ");

        //задача 7
        System.out.println("Задача 7");
        int unionMass = 7;//нужно скинуть вес
        int minMass = 250;//минимально можно скинуть за 1 день
        int maxMass = 500;//максимально можно скинуть за 1 день
        float xDaysMin = 0f;//сколдько потребуется дней при минимальном результате
        float xDaysMax = 0f;//сколдько потребуется дней при минимальном результате
        xDaysMin = (unionMass * 1000) / minMass;
        xDaysMax = (unionMass * 1000) / maxMass;
        System.out.println("При  минимальном результате нужно -  " + xDaysMin + " дней");
        System.out.println("При  максимальном результате нужно -  " + xDaysMax + " дней");
        System.out.println("В среднем нужно -  " + (xDaysMax + xDaysMin)/2 + " дн.");

        //задача 8
        System.out.println("Задача 8");
        var myName = "";//имя работника
        int salary = 0;//месячная зарплата
        int increase = 10;//увеличение зарплаты на 10%
        float incomeYear = 0.0f;//годовой доход
        int incomeYearOld = 0;//годовой доход до повышения
        float incomeMonth = 0.0f;//месячный доход

        myName = "Маша ";
        salary = 67760;
        incomeYearOld = salary * 12;
        incomeMonth = salary * (100 + increase) / 100;
        incomeYear = incomeMonth * 12;
        System.out.println(myName + " будет получать " + incomeMonth + " руб., годовой доход составит " + incomeYear + " руб." );
        System.out.println("Разница в зарплате составит " +  (incomeYear - incomeYearOld) + " руб. за 1 год" );

        myName = "Денис  ";
        salary = 83690;
        incomeYearOld = salary * 12;
        incomeMonth = salary * (100 + increase) / 100;
        incomeYear = incomeMonth * 12;
        System.out.println(myName + " будет получать " + incomeMonth + " руб., годовой доход составит " + incomeYear + " руб." );
        System.out.println("Разница в зарплате составит " +  (incomeYear - incomeYearOld) + " руб. за 1 год" );

        myName = "Кристина ";
        salary = 76230;
        incomeYearOld = salary * 12;
        incomeMonth = salary * (100 + increase) / 100;
        incomeYear = incomeMonth * 12;
        System.out.println(myName + " будет получать " + incomeMonth + " руб., годовой доход составит " + incomeYear + " руб." );
        System.out.println("Разница в зарплате составит " +  (incomeYear - incomeYearOld) + " руб. за 1 год" );




    }
}