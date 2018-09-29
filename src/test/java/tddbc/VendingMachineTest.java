package tddbc;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class VendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void 百円を払う(){
        machine.insertOneHundredYen();
        Boolean has100yen = machine.has100Yen();
        assertThat(has100yen, is(true));
    }

    @Test
    public void 百円を払わない() {
        Boolean has100yen = machine.has100Yen();
        assertThat(has100yen, is(false));
    }

    @Test
    public void 百円払ってボタンを押すとコーラが出る() {
        machine.insertOneHundredYen();
        VendingMachine.Drink drink = machine.pushButton(VendingMachine.Drink.COLA);
        assertThat(drink, is(VendingMachine.Drink.COLA));
    }

    @Test
    public void 百円払わないとコーラが出ない() {
        VendingMachine.Drink drink = machine.pushButton(VendingMachine.Drink.COLA);
        assertThat(drink, nullValue());
    }

    @Test
    public void 百円を払うと烏龍茶が出てくるボタン() {
        machine.insertOneHundredYen();
        String drink = machine.pushOolongTeaButton();
        assertThat(drink, is("烏龍茶"));
    }

    @Test
    public void 百円払わないと烏龍茶が出ない() {
        String drink = machine.pushOolongTeaButton();
        assertThat(drink, is(""));
    }

    @Test
    public void 百円を払うとコーヒーが出てくるボタン() {
        String drink = machine.pushCoffeeButton();
        assertThat(drink, is("コーヒー"));
    }
}