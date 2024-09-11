
import java.util.Scanner;

import dispensers.Dispenser;
import dispensers.FiftyThousandDispenser;
import dispensers.FiveThousandDispenser;
import dispensers.HundredThousandDispenser;
import dispensers.TenThousandDispenser;
import dispensers.TwentyThousandDispenser;

public class ATMDispenser {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad a dispensar: ");
            int amount = scanner.nextInt();

            // Validar si la cantidad es múltiplo de 5000
        if (amount % 5000 != 0) {
            System.out.println("Error: La cantidad debe ser múltiplo de 5000");
            return;
}
            Dispenser dispenser = new HundredThousandDispenser();
            dispenser.setNext(new FiftyThousandDispenser());
            dispenser.setNext(new TwentyThousandDispenser());
            dispenser.setNext(new TenThousandDispenser());
            dispenser.setNext(new FiveThousandDispenser());

            dispenser.dispense(amount);
        }
    }
}
