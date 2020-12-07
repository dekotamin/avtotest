import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class shouldCalculateForRegisteredTest {
    @Test
    void calculate() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
