public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double creditPaymentOneYear = service.calculate(1_000_000, 9.99, 12);
        System.out.println(creditPaymentOneYear);

        double creditPaymentTwoYears = service.calculate(1_000_000, 9.99, 24);
        System.out.println(creditPaymentTwoYears);

        double creditPaymentThreeYears = service.calculate(1_000_000, 9.99, 36);
        System.out.println(creditPaymentThreeYears);
    }
}
