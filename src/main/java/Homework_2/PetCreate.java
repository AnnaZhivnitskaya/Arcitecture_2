package Homework_2;

public class PetCreate extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new PetReward();
    }
}
