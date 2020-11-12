import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class shouldCalculateForNotRegistered {
 @Test
 void calculate() {
     BonusService service = new BonusService();
     long amount = 1000_60;
     boolean registered = false;
     long expected = 10;
     long actual = service.calculate(amount, false);
     assertEquals(expected, actual);
 }
}