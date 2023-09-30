public class CreditPaymentService {
    public int calculate (int amoutCredit, int creditTerm, double interestRate){

        double coefficient = (interestRate / 12 / 100 * Math.pow(1 + interestRate / 12 / 100, creditTerm)) / (Math.pow(1 + interestRate / 12 / 100, creditTerm) - 1);
        int payment = (int) (amoutCredit * coefficient);

        return payment;
    }
}
