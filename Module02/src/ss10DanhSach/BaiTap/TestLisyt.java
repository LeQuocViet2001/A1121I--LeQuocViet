package ss10DanhSach.BaiTap;

public class TestLisyt {


    public static void main(String[] args) {

        MyList<String> list = new MyList<>();

        list.add("head");
        list.add("Sad");
        list.add("hand");
        list.add("tail");

        list.add(5,"Add");

        System.out.println(list.get(5));


    }
}
