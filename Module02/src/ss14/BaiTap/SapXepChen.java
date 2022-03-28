package ss14.BaiTap;

public class SapXepChen {

    static int[] list = {2, 3, -4, 5, 2, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            System.out.println("phan tu arr["+ pos + "]= " + x );


            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;

            for (int l = 0; l < i+1; l++)
                System.out.print(list[l] + " ");
            System.out.println();


        }
    }

}
