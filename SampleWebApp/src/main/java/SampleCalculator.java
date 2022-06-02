public class SampleCalculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public String greeting(String name) {
        return "Hello, " + name;
    }
}
