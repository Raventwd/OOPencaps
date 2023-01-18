package transport;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;
    final private String country;
    private String color;
    private double engineVolume;
    private int transmission;
    final private String bodyType;
    private int registrationNumber;
    final private int numberOfSeats;
    private boolean tires;

    class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;
    }



    public Car(String brand, String model, int year, String country, String color, double engineVolume, int transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean tires) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "default";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "default";
        this.year = (year >= 0) ? year : 2000;
        this.country = (country != null && country.isEmpty() != true && country.isBlank() != true) ? country : "default";
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? color : "white";
        this.engineVolume = (engineVolume >= 0) ? engineVolume : 1.5;
        this.transmission = (transmission >= 0) ? transmission : 5;
        this.bodyType = (bodyType != null && bodyType.isEmpty() != true && bodyType.isBlank() != true) ? bodyType : "default";
        this.registrationNumber = (registrationNumber >= 0) ? registrationNumber : 111111;
        this.numberOfSeats = (numberOfSeats >= 0) ? numberOfSeats : 2;
        this.tires = tires;
    }



    public void changeTiresToSeasonTires(boolean winterTires, boolean summerTires, String season) {
        season = "Winter";
        if (season == "Winter") {
            this.tires = winterTires;
        } else {
            this.tires = summerTires;
        }

    }


    @java.lang.Override
    public java.lang.String toString() {
        return brand + " " + model + " , " + year + " год выпуска, сборка в " + country + " ,  " + color + " цвет кузова, обьем двигателя -  " + engineVolume + " , " + tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getTransmission() {
        return transmission;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isTires() {
        return tires;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(country, car.country) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, engineVolume);
    }

}
