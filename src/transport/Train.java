package transport;

public class Train extends Transport {
    private int price;
    private double time;
    private String station;
    private String lastStop;
    private int wagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, int price, double time, String station, String lastStop, int wagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.price = price;
        this.station = station;
        this.lastStop = lastStop;
        this.wagons = wagons;

        if (time == 0) {
            this.time = 60;
        } else {
            this.time = time;
        }
        if (color == null) {
            this.color = "белый цвет";
        } else {
            this.color = color;
        }
    }
    public void refill() {
        System.out.println("Заправка поездов осуществляется дизелем");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
}
