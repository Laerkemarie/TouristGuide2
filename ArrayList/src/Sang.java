public class Sang {
    private String sangTitel;

    public Sang(String sangTitel) {

        this.sangTitel = sangTitel;
    }

    public String getSangTitel() {
        return sangTitel;
    }

    public void setSangTitel(String newTitel) {
        this.sangTitel = newTitel;
    }

    public String toString() {
        return "Sang: " + sangTitel;
    }
}
