package transport;

public abstract   class Transport  {
    private final String brand;
    private final String model;
    private final String productionCountry;
    public String color;
    public double maxSpeed;

    private final int productionYear;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }


        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (color == null) {
            this.color = "Чёрный цвет";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 240;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getProductionYear() {
        return productionYear;
    }
}

