public class Boss extends GameEntity {
    private Waepon waepon;

    public Boss(int health, int damage, Waepon waepon) {
        super(health, damage);
        this.waepon = waepon;


    }

    public Waepon getWaepon() {
        return waepon;
    }

    public void setWaepon(Waepon waepon) {
        this.waepon = waepon;
    }
}
