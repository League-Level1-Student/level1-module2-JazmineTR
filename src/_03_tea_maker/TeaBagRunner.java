package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaBagRunner {
public static void main(String[] args) {
	
	TeaBag tea = new TeaBag(TeaBag.PASSION_FRUIT);
	Kettle ket = new Kettle();
	Cup cup = new Cup();
 Water agua = ket.getWater();
 
 ket.boil();
 
cup.makeTea(tea,agua);
	 
 }
}

