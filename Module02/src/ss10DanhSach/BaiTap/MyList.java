package ss10DanhSach.BaiTap;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    private Object elements[];


    public  MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public  MyList(int capacity){
        elements = new Object[capacity];

    }

    public  void  add( int index, E element){

        if( index >  elements.length)
            throw  new IllegalArgumentException("Tran  ");
        else if ( size == elements.length)
            elements = Arrays.copyOf(elements,  size+1 );

       if( elements[index] == null)
           elements[index] = element;
        else {


        size++;
        for(int i = index + 1 ; i<size; i++  ){
            elements[i] = elements[i-1];
        }
        elements[index] = element;


        //
//           for( int i= size+1; i>=index ; i--){
//               elements[i] =elements[i-1];
//
//           }
//           elements[index] =element;
//           size++;
        }



    }

    public boolean add( E e){

        elements[size] =e;
        size++;
        return true;
    }

    public int size (){
        return this.size;
    }

    public void clear(){
        size = 0;
        for ( int i = 0;  i< elements.length; i++){
            elements[i] =null;
        }

    }


    public  E remove (int index){
        E e = (E)elements[index];

        for( int i = index ; i< size-1; i++)
        {
            elements[i]  =elements[i+1];
        }
        elements = Arrays.copyOf(elements, size-1);
        return e;

    }

    public boolean contains( E o){

          for(int  i = 0 ; i<size; i++){
              if( elements[i] == o)
                  return true;
          }

          return false;
    }


    public E get(int index){
        return (E)elements[index];
    }



}
