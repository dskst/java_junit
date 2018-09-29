package tddbc;

class VendingMachine {

    public enum Drink {
        OOLONG_TEA(100),
        COFFEE(100),
        COLA(100),
        RED_BULL(200),
        MONSTER(300);

        int price;

        Drink(int price) {
              this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private int deposit;

    Drink pushButton(Drink drink) {
        if (getDeposit() == drink.getPrice()) {
            return drink;
        }
        return null;
    }

    void insertOneHundredYen() {
        deposit += 100;
    }

    int getDeposit() {
        return deposit;
    }

    Drink isValid() {
        return Drink.OOLONG_TEA;
    }
}
