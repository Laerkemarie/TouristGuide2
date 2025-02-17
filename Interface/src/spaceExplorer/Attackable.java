package spaceExplorer;

public interface Attackable {
    // Konstant værdi for tryk
    int atmosphericPressureInMilibars = 0;

    // Denne metode skal returnere det atmosfæriske tryk}
    int getAtmosphericPressureInMilibars();

    // Denne metode håndterer hvad der sker, når væsnet bliver angrebet
    void becomeAttacked(int attackPower);

}