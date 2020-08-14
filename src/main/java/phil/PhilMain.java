package phil;

public final class PhilMain {

	public static void main(String[] args) {
		Player phil = new Player("Philémon");
		Player vince = new Player("Vince");

		phil.setWeapon(WeaponGenerator.createAxe());
		vince.setWeapon(WeaponGenerator.createSword());

		phil.attack(vince);

	}
}
