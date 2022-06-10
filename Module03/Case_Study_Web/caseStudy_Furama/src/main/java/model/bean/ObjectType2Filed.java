package model.bean;

public  class ObjectType2Filed {
     private int id;
     private String name;



    @Override
    public String toString() {
        return "ObjectType2Filed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ObjectType2Filed(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
