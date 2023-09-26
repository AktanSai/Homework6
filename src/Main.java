public class Main {
    public static void main(String[] args) {
        Waepon bossWeapon = new Waepon("Меч", "Огненный клинок");

        Boss boss = new Boss(666, 228, bossWeapon);

        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Тип оружия босса: " + boss.getWaepon().getType());
        System.out.println("Название оружия босса: " + boss.getWaepon().getSword());
    }
}