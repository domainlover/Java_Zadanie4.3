public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment1 = service.calculate(1_000_000, 0.0999, 12);
        System.out.println(payment1);

        double payment2 = service.calculate(1_000_000, 0.0999, 24);
        System.out.println(payment2);

        double payment3 = service.calculate(1_000_000, 0.0999, 36);
        System.out.println(payment3);

    }
}
