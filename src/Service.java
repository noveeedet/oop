public class Service {
    private String name;
    private double cost;
    private static final String NAME="интернет завезли в 100мб/с";
    private static final double COST = 300;

    public Service(){
        this(NAME,COST);
    }
    public Service(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    public String GetName(){
        return name;
    }
     public void SetName(String name){
        this.name =  name;
     }

     public double GetCost(){
        return cost;
     }
     public void SetCost(double cost){
        this.cost = cost;
     }
}
