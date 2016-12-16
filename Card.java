import java.awt.*;

public class Card{

	protected String name;
	protected int cost;
	protected int atk;
	protected int hp;
	protected boolean effect;
	protected int target;
	
	//minions
	protected Card(String name, int cost, int atk, int hp, boolean effect, int target){
		this.atk = atk;
		this.hp=hp;
		this.name = name;
		
		//enter targeting stuff here? for battlecries and such?
		
	}
	
	//spells
	protected Card(String name, int cost, int target){
		this.name = name;
	}
	
	//weapons
	//if we're treating face as a card and weaps don't have durability, 
	//what's the point of this class? We can code it as a giant minion
	protected Card(String name, int cost, boolean effect, int atk){
		this.name = name;
	}
	
	public int getCost(){
		return cost;
	}
	
	public int getAtk(){
		return atk;
	}
	
	public int getHp(){
		return hp;
	}
	
	public int setAtk(int x, int amount){
		if (x==1)//We use this for stuff like keeper of uldaman, i.e. set to 3
			atk = amount;
		else//this for buffs i.e. give +2 atk
			atk+=amount;//use a negative amount for debuffs
		return atk;
	}
	
	public int setHp(int x, int amount){//see above
		if (x==1)
			hp = amount;
		else
			hp+=amount;
		return hp;
	}
	
	public void draw(Graphics g){
		
	}
	
	public void play(){
		
	}
}
