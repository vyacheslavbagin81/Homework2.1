public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка - " + brand + ";" +
                " модель - " + model + ";" +
                " объем двигателя - " + engineVolume + ";" +
                " цвет кузова - " + color + ";" +
                " год выпуска - " + year + ";" +
                " страна сборки - " + country + ".";
    }
}
