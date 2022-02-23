package ss2.BaiTap;

public class rw {
    public static void main(String[] args) {
        int i = 1;
        while(i < 5){
            if(i % 3 != 0){
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}
