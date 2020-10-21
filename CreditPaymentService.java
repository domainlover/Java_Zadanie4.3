public class CreditPaymentService {
    public double calculate (int loan, double rate, int term) {
        double payment = loan * ((rate/12) * (Math.pow((rate/12 + 1), term)))/(Math.pow((rate/12 + 1), term) - 1);
        return payment;
    }

}
