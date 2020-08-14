package phil;

public final class WeaponGenerator {

	public static Weapon createSword() {
		Weapon sword = new Weapon();
		sword.setType(WeaponType.SWORD);
		sword.setDamage(10);

		return sword;
	}

	public static Weapon createAxe() {
		Weapon axe = new Weapon();
		axe.setType(WeaponType.AXE);
		axe.setDamage(15);

		return axe;
	}

	public static Weapon createDagger() {
		Weapon dagger = new Weapon();
		dagger.setType(WeaponType.DAGGER);
		dagger.setDamage(5);

		return dagger;
	}
}
