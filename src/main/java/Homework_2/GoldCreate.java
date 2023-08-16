package Homework_2;

public class GoldCreate extends ItemFabric // класс GoldCreate наследуется (extends) от базового
        // класса ItemFabric,наследует все его методы и поля и может иметь свои дополнительно
{
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
