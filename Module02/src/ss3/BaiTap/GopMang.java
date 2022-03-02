package ss3.BaiTap;

public class GopMang {

    public static void main(String[] args) {

        int  [] arr1   = {1,2,4,5,3,5};
        int []  arr2  =  {3,5,7,4,3,4,4,6,3};
  String a = "Sadas";

        int []  arr3 = new int[ arr1.length + arr2.length];


      for( int i = 0 ; i< arr1.length; i++){

          arr3[i] = arr1[i];

      }

        for( int i = 0; i <  arr2.length ; i++ ){
            arr3[arr3.length + i] = arr3[i];
        }

        for( int i = 0; i < arr3.length; i++){
            System.out.print( arr3[i] +" ");

        }




    }
}
