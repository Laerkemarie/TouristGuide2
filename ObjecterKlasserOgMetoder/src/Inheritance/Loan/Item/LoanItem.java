package Inheritance.Loan.Item;

abstract class LoanItem {
    private String title;

    public LoanItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getType();
}
