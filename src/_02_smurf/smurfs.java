package _02_smurf;

public class smurfs {
public static void main(String[] args) {
	Smurf handysmurf= new Smurf("handy");
	Smurf dad= new Smurf ("dad");
	Smurf mom = new Smurf ("mom");
	
	dad.eat();
mom.eat();
handysmurf.eat();
System.out.println("papa Smurf wears a red hat, all the other smurfs wear a white hat");
System.out.println("smurfett is the only female smurf, all the others are boys ");
}
}
