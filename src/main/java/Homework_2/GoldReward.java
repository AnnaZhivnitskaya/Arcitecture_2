package Homework_2;

public class GoldReward implements IGameItem{ //класс GoldReward реализует интерфейс (implements) IGameItem

    @Override
    public void open() {
        System.out.println("Вы получили золото");
    }
}
