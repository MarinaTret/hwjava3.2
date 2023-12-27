public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weighInKg = 98;
        int bmi = service.calculate(weighInKg, heightInMeters);
        System.out.println("Индекс массы тела:" + bmi);
    }
}