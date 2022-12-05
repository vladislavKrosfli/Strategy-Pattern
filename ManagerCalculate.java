public class ManagerCalculate implements Strategy{
    @Override
    public double calculate(int day) {
        if(day <= 7) {
            return 100 * day;
        }
        else{
            day -= 7;
            return 7*100+100*0.2*day;
        }
    }
}
