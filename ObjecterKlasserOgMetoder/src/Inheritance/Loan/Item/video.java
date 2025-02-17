package Inheritance.Loan.Item;

public class video extends LoanItem {
    public video (String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "video";
    }
}
