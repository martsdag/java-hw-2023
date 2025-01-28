import java.util.Scanner;
/**
 * @author Skrynnik Valeria
 * created: 2023-11-23 22:26
 */

public class Loan<T> {
    private T balance;

    public Loan(T initialLoanAmount) {
        this.balance = initialLoanAmount;
    }

    public T getBalance() {
        return balance;
    }

    public void makePayment(T payment) {
    }

    public void accrueInterest(double interestRate) {
    }
}
class RecursiveLoanRepayment {
    public static <T> void simulate(Loan<T> loan, double interestRate, int months) {
        if (months == 0) {
            System.out.println("Выплата кредита завершена. Окончательный баланс: " + loan.getBalance());
        } else {
            loan.accrueInterest(interestRate);
            System.out.println("Баланс за месяц " + (months - 1) + ": " + loan.getBalance());
            simulate(loan, interestRate, months - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму кредита: ");
        double initialLoanAmount = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите срок кредита в месяцах: ");
        int months = scanner.nextInt();

        Loan<Double> loan = new Loan<>(initialLoanAmount);

        System.out.println("Начисленные проценты: " + loan.getBalance());

        simulate(loan, interestRate, months);

        scanner.close();
    }
}