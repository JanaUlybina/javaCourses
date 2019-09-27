public class Backpack {

    private int N;
    private int W;
    private int[][] A;
    private int[] b;

    Backpack(int N, int W){
        this.N = N;
        this.W = W;
    }

    public int getW() {
        return W;
    }

    public int getN() {
        return N;
    }

    public int getA(int i, int j) {
        return A[i][j];
    }

    public void addA (int W, int N, Things[] Items){
        A = new int[N][W];
        for (int i = 0; i < W; i++)
            A[0][i] = 0;
        for (int i = 0; i < N; i++)
            A[i][0] = 0;

        for(int i = 1; i < N; i++){
            for(int j = 0; j < W; j++){
                if(j >= Items[i].getWeight())
                    A[i][j] = Math.max(A[i-1][j],A[i-1][j-Items[i].getWeight()] + Items[i].getCost());
                else
                    A[i][j] = A[i-1][j];
            }
        }
    }

    public void findB(int k, int s, Things[] Items){
        b = new int[N];
        if (A[k][s] == 0)
            return;
        if (A[k-1][s] == A[k][s])
            findB(k-1,s, Items);
        else{
            findB(k-1,s - Items[k].getWeight(),Items);
            b[k] = 1;
        }
    }

    public void B(Things[] Items){
        for(int i = 0; i < N; i++)
            if (b[i] == 1)
                System.out.println("Предмет №:" + Items[i].getId() + " Вес: " + Items[i].getWeight() + " Стоимость: " + Items[i].getCost());
    }
}
