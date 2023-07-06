public class BMIService {
    public double calculate(double metre, double kilogram) {
        double index = kilogram / (metre * metre);
        index = (int) index;
        return index;
    }
}
