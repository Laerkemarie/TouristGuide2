package Inheritance.MenneskeOgCykelBillet;

public class BilletAutomat2 {
        private int saldo; // Den aktuelle saldo i automaten
        private int total; // Det totale beløb, automaten har modtaget

        // Constructor
        public BilletAutomat2() {
            this.saldo = 0; // Startsaldo
            this.total = 0; // Starttotal
        }

        // Getter for saldoen
        public int getSaldo() {
            return saldo;
        }

        // Indbetal penge til automaten
        public void indbetal(int kroner) {
            if (kroner > 0) {
                saldo += kroner;
                System.out.println("Du har indsat " + kroner + " kr. Din nye saldo er: " + saldo + " kr.");
            } else {
                System.out.println("Du skal indsætte et positivt beløb før du kan købe en billet.");
            }
        }

        // Metode til at købe en billet af typen Billet
        public void købBillet(Billet billet) {
            int billetPris = billet.getBilletPris(); // Hent billetprisen fra den givne billet

            if (saldo >= billetPris) {
                billet.printBillet();  // Udskriv billetten

                // Opdater saldo og total
                saldo -= billetPris;
                total += billetPris;
                System.out.println("Din resterende saldo er: " + saldo + " kr.");
            } else {
                int manglendeBeløb = billetPris - saldo;
                System.out.println("Du har ikke nok penge til at købe en billet.");
                System.out.println("Du mangler " + manglendeBeløb + " kr.");
            }
        }
    }

