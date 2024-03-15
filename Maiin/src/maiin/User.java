
package maiin;

import java.util.ArrayList;

public class User {
    private int id = (int)(Math.random()*1000+1);
    private String name;
    private int age;
    private ArrayList<Book> librosRentados = new ArrayList<>();

    public User(int id, String name, int age) {
        this.id = (int)(Math.random()*1000+1);
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Book> getLibrosRentados() {
        return librosRentados;
    }

    public void setLibrosRentados(ArrayList<Book> librosRentados) {
        this.librosRentados = librosRentados;
    }
    
    

    
    
}
