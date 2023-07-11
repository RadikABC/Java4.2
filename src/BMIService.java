public class BMIService {
    public int calculate(double metre, double kilogram) {
        double index = kilogram / (metre * metre);
        return (int)index;
    }
}
