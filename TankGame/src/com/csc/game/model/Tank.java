package com.csc.game.model;

public class Tank extends AbstractModel implements Comparable<Tank>  {
	
	private int hp;
	private int level;
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public void setLevel(int _level){
		this.level = _level;
	}
	
	public int getLevel(){
		return this.level;
	}

	@Override
	public int compareTo(Tank o) {
		if(this.hp == o.hp)
			return 0;
		
		if(this.hp < o.hp)
			return -1;
		
		return 1;
	}

	

	

}
