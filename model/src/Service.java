public class Service
{

    private String name;
    private double cost;
    private static final String NAME= "интернет завезли 100мб/сек";
    private static final double COST = 300;
    public Service()
    {
        this(NAME,COST);
    }
    public Service(String name, double cost) {
        this.name= name;
        this.cost=cost;
    }

    public String getName()
    { return name; }

    public void setName(String name)
    {
        this.name=name;
    }

    double getCost()
    { return cost;}

    public void setCost(double cost) {
        this.cost=cost;
    }
}

