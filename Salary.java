import java.util.Map;

public class Salary {
    private String name;
    private int day;
    private Strategy strategy;

    Salary(String _name, int _day){
        name = _name;
        day = _day;
    }

    public void setListOfPeople(Map<String, Strategy> mp){
        for(Map.Entry<String, Strategy> entry: mp.entrySet()){
            if(name == entry.getKey()){
                strategy = entry.getValue();
            }
        }
    }

    public double executeSalary(){
        return strategy.calculate(day);
    }
}