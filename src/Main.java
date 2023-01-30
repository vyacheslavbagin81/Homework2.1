public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        Car audi = new Car();
        Car bmw = new Car();
        Car kia = new Car();
        Car hyundai = new Car();

//        Lada Granta, 2015 год выпуска, сборка, , объем двигателя — 1,7 л.
//                Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
//                BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
//                Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
//                Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год
        lada.country = "Россия";
        lada.color = "желтый";
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.year = 2015;
        lada.engineVolume = 1.7;

        audi.country = "Германия";
        audi.color = "черный";
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.year = 2020;
        audi.engineVolume = 3;

        bmw.country = "Германия";
        bmw.color = "черный";
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.year = 2021;
        bmw.engineVolume = 3;

        kia.country = "Южная Корея";
        kia.color = "красный";
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.engineVolume = 2.4;

        hyundai.country = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.year = 2016;
        hyundai.engineVolume = 1.6;

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}