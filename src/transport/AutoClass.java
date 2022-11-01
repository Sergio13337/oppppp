package transport;

import java.security.Key;
import java.time.LocalDate;

public class  AutoClass extends Transport {


    private double engineVolume;

    private String korobkaPeredach;
    private final String typeKyzova;
    private String number;
    private final int seatAuto;
    private boolean winterRezina;
    int currentMonth;



    public AutoClass(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, double engineVolume, String korobkaPeredach, String typeKyzova, String number, int seatAuto, boolean winterRezina) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.typeKyzova = "Купе";
        this.korobkaPeredach = "Механическая";
        this.seatAuto = 6;
        this.number = "х000хх000";
        this.winterRezina = true;



        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }
    public void refill() {
        System.out.println("Заправка машин осушествляется бензином, дизелем  или заряжать на специальных электропарковках, если это электрокар.");
    }


    public String getTypeKyzova() {
        return typeKyzova;
    }

    public int getSeatAuto() {
        return seatAuto;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }



    public String getKorobkaPeredach() {
        return korobkaPeredach;
    }

    public void setKorobkaPeredach(String korobkaPeredach) {
        if (korobkaPeredach == null) {
            korobkaPeredach = "Механическая";
        } else {
            this.korobkaPeredach = korobkaPeredach;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null) {
            this.number = "х000хх000";
        }
        this.number = number;
    }

    public boolean isWinterRezina() {
        return winterRezina;
    }

    public void setWinterRezina(boolean winterRezina) {
        this.winterRezina = winterRezina;
    }



    public void changeTypes() {
        if (currentMonth <= 4 || currentMonth >= 10 != this.winterRezina) {
            System.out.println("Пора менять колеса!");
        } else {
            System.out.println("Сезонные шины уже установлены");
        }
    }

    public boolean correctNumber() {
        if (number.length() != 9) {
            return false;
        }
        char[] chars = number.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }


    }





