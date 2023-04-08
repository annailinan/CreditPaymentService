public class CreditPaymentService {
    public int calculate(int amount, double percentBid, int period) {
        double monthBid = (percentBid / 100 ) / 12;
        double payment = amount * (monthBid * Math.pow ((monthBid + 1), period) / (Math.pow ((monthBid + 1), period) - 1));
        return (int) payment;
    }
}