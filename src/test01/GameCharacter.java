package test01;

public class GameCharacter {

    private String name;
    private int level;
    private int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + "(Lv." + level + ")의 공격!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health > 0) {
            System.out.println("상대방의 공격으로 \'" + name + "\'이(가) " + damage + "만큼 피해를 입었습니다! \n남은 체력은 " + health + "입니다.");
        } else if (health == 0) {
            System.out.println(name + "의 패배로 경기를 종료합니다.");
        }
    }
}
