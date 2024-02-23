package test01;

public class Test06 {
    public static void main(String[] args) {

        GameCharacter gameCharacter1 = new GameCharacter("마법사", 10, 100);
        GameCharacter gameCharacter2 = new GameCharacter("궁수", 15, 150);

        gameCharacter1.attack();
        gameCharacter2.takeDamage(30);
        gameCharacter2.attack();
        gameCharacter1.takeDamage(50);
        gameCharacter1.attack();
        gameCharacter2.takeDamage(35);
        gameCharacter2.attack();
        gameCharacter1.takeDamage(50);
    }
}
