package phil;

public class Player {

	private String pseudo;
	private int life;
	private int mana;
	private int money;
	private Weapon weapon;

	public Player(String pseudo) {
		this.pseudo = pseudo;
		this.life = 100;
		this.mana = 100;
		this.money = 10;
	}

	public void attack(Player target) {
		System.out.println("You attack player " + target.getPseudo() + " and deal " + weapon.getDamage() + " damage.");
		target.setLife(target.getLife() - weapon.getDamage());
		if (target.getLife() < 0) {
			System.out.println(target.getPseudo() + " is dead !");
		} else {
			System.out.println(target.getPseudo() + " survives. He has " + target.getLife() + " HP left.");
		}
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
