public class BmiService {
    public int calculate(int weighInKg, double heightInMeters) {
        double bmi = weighInKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }
}
