import transport.AutoClass;
import transport.Bus;
import transport.Train;
import transport.Transport;

public   class  AutoMain {
    public static void main(String[] args) {

        AutoClass lada = new AutoClass("Лада","Гранта",2005,"Россия","желтый цвет",0,1.5,"МКПП","седан","х000хх000",6,true);


        System.out.println(lada.getBrand() + " " + lada.getModel() + " " + lada.getProductionYear() + " года выпуска, " + "страна сборки: " + lada.getProductionCountry() +", " + lada.getColor() + ", объём двигателя: " + lada.getEngineVolume() + "л." + " " +  lada.getTypeKyzova() + ", максимальная скорость - " + lada.getMaxSpeed());

        AutoClass audi = new AutoClass("Ауди","A8 50 L TDI quattro",0,"Германия","черный цвет",0,3.0,"МКПП","купэ","х000хх000",6,true);


        System.out.println(audi.getBrand() + " " + audi.getModel() + " " + audi.getProductionYear() + " года выпуска, " + "страна сборки: " + audi.getProductionCountry() +", " + audi.getColor() + ", объём двигателя: " + audi.getEngineVolume() + "л." + audi.isWinterRezina());

        AutoClass bmw = new AutoClass("БМВ","Z8",2020,"Германия","черный цвет",0,3.0,"МКПП","купэ","х000хх000",6,true);


        System.out.println(bmw.getBrand() + " " + bmw.getModel() + " " + bmw.getProductionYear() + " года выпуска, " + "страна сборки: " + bmw.getProductionCountry() +", " + bmw.getColor() + ", объём двигателя: " + bmw.getEngineVolume() + "л." + bmw.getSeatAuto());

        AutoClass kia = new AutoClass("Кио","Sportage 4-го поколения",2021, "Южная Корея","Оранжевый",120,1.5,"АКПП","хэтчбэк","х000хх000",6,true);


        System.out.println(kia.getBrand() + " " + kia.getModel() + " " + kia.getProductionYear() + " года выпуска, " + "страна сборки: " + kia.getProductionCountry() +", " + kia.getColor() + ", объём двигателя: " + kia.getEngineVolume() + "л." + kia.getKorobkaPeredach());

        AutoClass hyundai = new AutoClass("Хундай","Avante",2016,"Южная Корея","оранжевый цвет",0,1.6,"АКПП","седан","х000хх000",6,true);


        System.out.println(hyundai.getBrand() + " " + hyundai.getModel() + " " + hyundai.getProductionYear() + " года выпуска, " + "страна сборки: " + hyundai.getProductionCountry() +", " + hyundai.getColor() + ", объём двигателя: " + hyundai.getEngineVolume() + "л." + hyundai.getNumber());
        lada.refill();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);


        System.out.println(lastochka.getBrand() + " " + lastochka.getModel() + " " + lastochka.getProductionYear() + " года выпуска, " + "страна сборки: " + lastochka.getProductionCountry() + ", " + lastochka.getColor() + ", максимальная скорость - " + lastochka.getMaxSpeed() + ", цена поездки: " + lastochka.getPrice() + ", время следования: " + lastochka.getTime() + ", место отбытия: " + lastochka.getStation() + ", конечная остановка: " + lastochka.getLastStop() + ", количество вагонов: " + lastochka.getWagons());
        System.out.println(leningrad.getBrand() + " " + leningrad.getModel() + " " + leningrad.getProductionYear() + " года выпуска, " + "страна сборки: " + leningrad.getProductionCountry() + ", " + leningrad.getColor() + ", максимальная скорость - " + leningrad.getMaxSpeed() + ", цена поездки: " + leningrad.getPrice() + ", время следования: " + leningrad.getTime() + ", место отбытия: " + leningrad.getStation() + ", конечная остановка: " + leningrad.getLastStop() + ", количество вагонов: " + leningrad.getWagons());
        lastochka.refill();

        Bus mercedes = new Bus("Мерседес", "407", 1977, "Германия", "Желтый цвет", 85);
        Bus gaz = new Bus("Газ", null, 1980, "СССР", "Белый цвет", 80);
        Bus maz = new Bus("Маз", "203085", 2015, "Беларусь", "Оранжевый  цвет", 90);


        System.out.println(mercedes.getBrand() + " " + mercedes.getModel() + " " + mercedes.getProductionYear() + " " + mercedes.getProductionCountry() + " " + mercedes.getColor() + " " + mercedes.getMaxSpeed());
        System.out.println(gaz.getBrand() + " " + gaz.getModel() + " " + gaz.getProductionYear() + " " + gaz.getProductionCountry() + " " + gaz.getColor() + " " + gaz.getMaxSpeed());
        System.out.println(maz.getBrand() + " " + maz.getModel() + " " + maz.getProductionYear() + " " + maz.getProductionCountry() + " " + maz.getColor() + " " + maz.getMaxSpeed());
        mercedes.refill();

    }


}