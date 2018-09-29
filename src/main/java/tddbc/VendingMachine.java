package tddbc;

class VendingMachine {

    public static enum Drink {
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

    public String pushOolongTeaButton() {
        if (!has100Yen) {
            return "";
        }
        return "烏龍茶";
    }

    public String pushCoffeeButton() {
        return "コーヒー";
    }
}
