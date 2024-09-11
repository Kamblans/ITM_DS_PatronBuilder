package dispensers;

public interface Dispenser {
    void setNext(Dispenser next);
    void dispense(int amount);
}


