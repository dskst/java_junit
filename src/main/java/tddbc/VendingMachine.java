package tddbc;

class VendingMachine {

    public enum Drink {
        OOLONG_TEA,
        COFFEE,
        COLA
    };

    private boolean has100Yen = false;

    Drink pushButton(Drink drink) {
        if (!has100Yen) {
            return null;
        }

        return drink;
    }

    void insertOneHundredYen() {
        has100Yen = true;
    }

    Boolean has100Yen() {
        return has100Yen;
    }
}
