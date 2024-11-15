public class TestLoanClass {
  public static void main(String[] args) {
    try {
      Loan loan = new Loan(12, 12, 0);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      Loan loan = new Loan(12, 12, 100000);
      System.out.println(loan.getTotalPayment());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
