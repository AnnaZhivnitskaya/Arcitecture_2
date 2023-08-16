package Homework_2;

public abstract class ItemFabric { //класс, отвечающий за создание объектов (итемок)
    public abstract IGameItem createItem();// метод возвращает какой-то экцемпляр класса, наследующий интерфейс
                                            // IGameItem
    public void openReward(){ //метод отвечает за открытие сундука
        IGameItem gameItem = createItem(); //итемка создается
        gameItem.open();                   //и открывается

    }
}
// Абстрактный класс ItemFabric это криейтор. Все классы, которые наследуют ItemFabric, должны будут
// реализовать в себе метод createItem (создание итемки)
// а так же метод открытия сундука openReward, при котором итемка создается и открывается (open)
// open находится в IGameItem
