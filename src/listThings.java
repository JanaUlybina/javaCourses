public class listThings {
    private Things[] arr = new Things[5];
    private int count = 0;

    public void add(Things item){
        if (count < arr.length){
            arr[count] = item;
            System.out.println("item: " + count);
            count++;
        }
    }
}
