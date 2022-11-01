package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }


    public void refill() {
        System.out.println("Заправка автобусов осуществляется бензином или дизелем");
    }
}
