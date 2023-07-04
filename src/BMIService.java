public class BMIService {
    public double calculate(double a, double b) {
        double result = b / (a * a);
        result = (int) result;
        return result;
    }
}
