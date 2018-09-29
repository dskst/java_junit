package tddbc;

class VendingMachine {
    private boolean has100Yen = false;

    String pushColaButton() {
        if (!has100Yen) {
            return "";
        }

        return "コーラ";
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
