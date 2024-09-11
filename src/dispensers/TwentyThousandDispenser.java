package dispensers;

public class TwentyThousandDispenser extends AbstractDispenser {
    public TwentyThousandDispenser() {
        super(20000);
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
