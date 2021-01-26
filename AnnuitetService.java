public class AnnuitetService {
    public double calculateAnnuitet(int creditSum, int creditPeriod, double percentTotal) {

        double percentMonth = percentTotal / 100 / 12;

        double firstStupidFormula = 1 + percentMonth;

        double firstPow = Math.pow(firstStupidFormula, creditPeriod);

        double numerator = percentMonth * firstPow;
        double denomirator = firstPow - 1;

        double annuitet = creditSum * (numerator / denomirator);

        return annuitet;
    }
}
