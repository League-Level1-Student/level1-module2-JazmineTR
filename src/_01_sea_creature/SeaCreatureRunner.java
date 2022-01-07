package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		spongebob.laugh();
		
		SeaCreature pat = new SeaCreature("patrick");
		System.out.println(pat.getName());
		pat.eat();
		pat.laugh();
		
		SeaCreature squid = new SeaCreature("squidward");
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
		
	}
}
