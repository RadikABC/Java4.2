public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double metre = 1.87; // рост
        double kilogram = 98; // вес
        int index = (int) service.calculate(metre,kilogram);

        System.out.println(index);
    }
}