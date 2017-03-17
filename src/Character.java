/**
 * Created by Rakshith on 3/5/2017.
 */
public abstract class Character {

    WeaponBehavior weapon;


    public  void fight(){
        weapon.useWeapon();
    }


    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
