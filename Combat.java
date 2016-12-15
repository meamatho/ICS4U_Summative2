
public class Combat {

	public void battle(Card card1, Card card2){
		card1.setHp(0, -card2.getAtk());
		card2.setHp(0, -card1.getAtk());
	}
}
