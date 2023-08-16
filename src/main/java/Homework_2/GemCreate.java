package Homework_2;

public class GemCreate extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }

}
