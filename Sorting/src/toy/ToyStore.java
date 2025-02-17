package toy;

public class ToyStore {

    public static void main(String[] args) {

        Toy[] toys = {
                new Toy("Motorcykel", 3, 7),
                new Toy("Biler", 2, 9),
                new Toy("Bassin", 1, 4),
                new Toy("Monstertruck", 2, 10),
                new Toy("Dukke", 1, 10),
                new Toy("Guitar", 3, 8)
        };

        for (int i = 0; i < toys.length - 1; i++) {
            for (int j = 0; j < toys.length - 1; j++) {
                if (toys[j].getPopularityScore() < toys[j + 1].getPopularityScore()) {
                    Toy temp = toys[j];
                    toys[j] = toys[j + 1];
                    toys[j + 1] = temp;
                }
            }
        }

        System.out.println("Fra det mest til det mindst populære legetøj: ");
        for (Toy toy : toys) {
            System.out.println(
                    "Popularitet: " + toy.getPopularityScore() +
                            ", Navn: " + toy.getName() +
                            ", Minimum alder: " + toy.getMinumumAge()
            );
        }
    }
}
