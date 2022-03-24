public class CreditPaymentService {
    public double calculate(int creditAmount, double percent, int creditTerm) {
        double monthPercent = (percent / 100) / 12;
        return creditAmount * ((monthPercent * Math.pow(1 + monthPercent, creditTerm)) / (Math.pow(1 + monthPercent, creditTerm) - 1));
    }
}
