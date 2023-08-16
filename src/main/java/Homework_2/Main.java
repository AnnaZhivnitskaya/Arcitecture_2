package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldCreate();
        generator.openReward();
        generator = new GemCreate();
        generator.openReward(); //этот вызов затирает объект первого вызова
        generator = new PetCreate();
        generator.openReward();
    }


    /*public static void main(String[] args){
        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldCreate());
        fabricList.add(new GemCreate());
        fabricList.add(new PetCreate());

        for(int i =0; i<20; i++) // рандомная выдача из списка
        {
            int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }*/

}
