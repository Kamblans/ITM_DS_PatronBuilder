package dispensers;

public abstract class AbstractDispenser implements Dispenser {
    protected Dispenser next;
    protected int denomination;

    public AbstractDispenser(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public void setNext(Dispenser next) {
        this.next = next;
    }

    @Override
    public void dispense(int amount) {
        if (amount == denomination) {
            System.out.println("Dispensing 1 x $" + denomination);
            return;
        }

        int count = amount / denomination;
        amount %= denomination;
        System.out.println("Dispensing " + count + " x $" + denomination);
        if (amount > 0 && next != null) {
            next.dispense(amount);
     }
}
}
