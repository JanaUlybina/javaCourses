public class Main {

    public static void main(String[] args) {

        Backpack pack = new Backpack((int) (Math.random() * 20), (int) (1+(Math.random()) * 15));
        System.out.println("Грузоподъемность рюкзака = " + (pack.getW()-1));

        Things[] Items;
        Items = new Things[pack.getN()];
        for (int i = 0; i < pack.getN(); i++)
            Items[i] = new Things(i, (int) (Math.random() * 20), (int) (Math.random() * 15));

        System.out.println("Список вещей: ");
        for (int i = 0; i < pack.getN(); i++)
            System.out.println("Предмет №:" + Items[i].getId() + " Вес: " + Items[i].getWeight() + " Стоимость: " + Items[i].getCost());

        System.out.println();
        pack.addA(pack.getW(), pack.getN(), Items);
        System.out.println("В рюкзак были упакованы: ");
        pack.findB(pack.getN()-1,pack.getW()-1, Items);
        pack.B(Items);
         System.out.println("Суммарная ценность рюкзака: " + pack.getA(pack.getN()-1, pack.getW()-1));
    }
}

