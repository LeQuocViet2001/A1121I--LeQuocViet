package Furama.service;

import java.io.FileNotFoundException;

public interface Service {
    public void display();

    public void addNew() throws FileNotFoundException;
    public  void edit();

 public void delete();


}
