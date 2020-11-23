import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class shouldCalculateForNotRegisteredUnderLimit {
    @Test
    void calculate() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 1000;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
