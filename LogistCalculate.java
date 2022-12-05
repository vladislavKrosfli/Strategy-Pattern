public class LogistCalculate implements Strategy{
    @Override
    public double calculate(int day) {
        return 90*day;
    }
}
