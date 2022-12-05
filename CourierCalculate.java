public class CourierCalculate implements Strategy {
    @Override
    public double calculate(int day) {
        if(day < 3){
            return 0.9*115*day;
        }
        else{
            return 115*day;
        }
    }
}
