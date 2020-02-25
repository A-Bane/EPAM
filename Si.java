import java.lang.Math; 
public class Si
{
void simpleinterest(double principle,double rate,double time)
{
	double simple_interest;
	simple_interest=(principle*rate*time)/100;
}
void compoundinterest(double principle,double rate,double time)
{
	double compound_interest;
	compound_interest=(principle*Math.pow((1+rate),time))-principle;
}
}
