package Inheritance.Loan.Item;

public class book extends LoanItem {
    public book(String title) {
        super(title);
    }
    @Override
    public String getType() {
        return "bog";
    }
}
