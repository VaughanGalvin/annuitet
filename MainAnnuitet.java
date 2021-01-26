public class MainAnnuitet {
    public static void main(String[] args) {
        AnnuitetService service = new AnnuitetService();
        double annuitet = service.calculateAnnuitet(1000000, 420, 6);
        System.out.println(annuitet);
    }
}
