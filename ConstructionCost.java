public class ConstructionCost
{
	double Construction_cost;
	void calculate(String choice,double area)
	{
		if(choice.equalsIgnoreCase("Standard"))
			Construction_cost=1200*area;
		if(choice.equalsIgnoreCase("Above Standard"))
			Construction_cost=1500*area;
		if(choice.equalsIgnoreCase("High Standard"))
			Construction_cost=1800*area;
		if(choice.equalsIgnoreCase("Fully Automated"))
			Construction_cost=2500*area;
		
		
	}
}
