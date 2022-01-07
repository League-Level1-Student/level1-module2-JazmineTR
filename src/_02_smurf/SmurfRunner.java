package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	System.out.println(handy.getName());
	handy.eat();
	
	Smurf papa = new Smurf("Papa");
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor(" red."));
	System.out.println(papa.isGirlOrBoy(" boy."));
	
	Smurf smurfy = new Smurf("Smurfette");
	System.out.println(smurfy.getName());
	System.out.println(smurfy.getHatColor(" white."));
	System.out.println(smurfy.isGirlOrBoy(" girl."));
}
}