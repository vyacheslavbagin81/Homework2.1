public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        Car audi = new Car();
        Car bmw = new Car();
        Car kia = new Car();
        Car hyundai = new Car();

        lada.setCountry("Россия");
        lada.setColor("желтый");
        lada.setBrand("Lada");
        lada.setModel("Granta");
        lada.setYear(2015);
        lada.setEngineVolume(1.7);

        audi.setCountry("Германия");
        audi.setColor("черный");
        audi.setBrand("Audi");
        audi.setModel("A8 50 L TDI quattro");
        audi.setYear(2020);
        audi.setEngineVolume(3);

        bmw.setCountry("Германия");
        bmw.setColor("черный");
        bmw.setBrand("BMW");
        bmw.setModel("Z8");
        bmw.setYear(2021);
        bmw.setEngineVolume(3);

        kia.setCountry("Южная Корея");
        kia.setColor("красный");
        kia.setBrand("Kia");
        kia.setModel("Sportage 4-го поколения");
        kia.setYear(2018);
        kia.setEngineVolume(2.4);

        hyundai.setCountry("Южная Корея");
        hyundai.setColor("оранжевый");
        hyundai.setBrand("Hyundai");
        hyundai.setModel("Avante");
        hyundai.setYear(2016);
        hyundai.setEngineVolume(1.6);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}