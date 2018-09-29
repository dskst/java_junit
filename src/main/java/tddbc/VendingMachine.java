package tddbc;

class VendingMachine {

    public enum Drink {
        OOLONG_TEA,
        COFFEE,
        COLA,
        RED_BULL
    };

    int yen;

    Drink pushButton(Drink drink) {
        if (has100Yen() && !drink.equals(Drink.RED_BULL)) {
            return drink;
        }
        if (has200Yen() && drink.equals(Drink.RED_BULL)) {
            return drink;
        }
        return null;
    }

    void insertOneHundredYen() {
        yen += 100;
    }

    boolean has100Yen() {
        return yen == 100;
    }

    boolean has200Yen() {
        return yen == 200;
    }

}
