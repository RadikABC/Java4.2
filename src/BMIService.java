public class BMIService {
    public double calculate(double metre, double kilogram) {
        double index = kilogram / (metre * metre);
        return index;
    }
}
