package dispensers;

public class HundredThousandDispenser extends AbstractDispenser {
    public HundredThousandDispenser() {
        super(100000);
    }

    @Override
    public void dispense(int amount) {
        int count = amount / denomination;
        amount %= denomination;
        System.out.println("Dispensing " + count + " x $" + denomination);
        if (amount > 0 && next != null) {
            next.dispense(amount);
        }
    }
}

