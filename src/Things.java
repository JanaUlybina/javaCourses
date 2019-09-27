final class Things {
    private int id = 0;
    private int cost = 0;
    private int weight = 0;

    public Things(int id, int cost, int weight){
        this.id = id;
        this.cost = cost;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return this.cost;
    }

    public int getWeight() {
        return weight;
    }
}
