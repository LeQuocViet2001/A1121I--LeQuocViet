package ss09.BaiTap;

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

        if( size == elements.length)
            elements = Arrays.copyOf(elements,  size+1 );


        for(int i = index + 1 ; i<size; i++  ){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
    }

    public int size (){
        return size;
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



}
