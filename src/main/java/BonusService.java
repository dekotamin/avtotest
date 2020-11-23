public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
<<<<<<< HEAD
            return bonus = limit;
=======
            bonus = limit;
>>>>>>> 4d6a983d45a3d29b9d4c84c441b0a6d04c53ade5
        }
        return bonus;
    }
}