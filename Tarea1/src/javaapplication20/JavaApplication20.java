package javaapplication20;

public class JavaApplication20 
{


    public static void main(String[] args)
    {
        
        System.out.println("Class Person");
        Person Person = new Person("Itzel", 19, "mujer");
        System.out.println("Name: " +Person.name);
        System.out.println("Age: " +Person.age);
        System.out.println("Gender: " +Person.gender);
        System.out.println(" ");
        
        Person SecondPerson = new Person("Ana", 25, "mujer");
        System.out.println("Name: " +SecondPerson.name);
        System.out.println("Age: " +SecondPerson.age);
        System.out.println("Gender: " +SecondPerson.gender);
        System.out.println(" ");
        
        Person ThirdPerson = new Person("Jair", 20, "hombre");
        System.out.println("Name: " +ThirdPerson.name);
        System.out.println("Age: " +ThirdPerson.age);
        System.out.println("Gender: " +ThirdPerson.gender);
        System.out.println(" ");
       
        Person FourthPerson = new Person("Adrian", 15,"hombre");
        System.out.println("Name: " +FourthPerson.name);
        System.out.println("Age: " +FourthPerson.age);
        System.out.println("Gender: " +FourthPerson.gender);
        System.out.println("-----------------------------------------------");
        
        //*************************************************************************************************
        
        System.out.println("");
        System.out.println("Class Book");
        Book Book= new Book();    
           String title = "El Principito"; 
           String author = "Antoine de Saint-Exupery";
           int yearofpublication = 2005;        
        System.out.println("Litle: " +Book.title);
        System.out.println("Author: " +Book.author);
        System.out.println("year of publication: " +Book.yearofpublication);
        
        System.out.println("");
        Book SecondBook= new Book();
           SecondBook.title= "El mundo de Sofia"; 
           SecondBook.author = "Jostein Gaarder";
           SecondBook.yearofpublication = 2010;         
        System.out.println("Litle: " +SecondBook.title);
        System.out.println("Author: " +SecondBook.author);
        System.out.println("year of publication: " +SecondBook.yearofpublication);
        
        System.out.println("");
        Book ThirdBook= new Book();
           ThirdBook.title = "El brillo de las luciernagas"; 
           ThirdBook.author = "Paul Pen";
           ThirdBook.yearofpublication = 2015;         
        System.out.println("Litle: " +ThirdBook.title);
        System.out.println("Author: " +ThirdBook.author);
        System.out.println("year of publication: " +ThirdBook.yearofpublication);
        
        System.out.println("");
        Book FourthBook= new Book();
           FourthBook.title = "Orgullo y prejuicio"; 
           FourthBook.author = "Jane Austein";
           FourthBook.yearofpublication = 2020;         
        System.out.println("Litle: " +FourthBook.title);
        System.out.println("Author: " +FourthBook.author);
        System.out.println("year of publication: " +FourthBook.yearofpublication);
        System.out.println("-----------------------------------------------");
        
        //*************************************************************************
        
        System.out.println("Class Rectangle");
        System.out.println("");
        Rectangle Rectangle = new Rectangle(5,9);
        Rectangle.Area();
        System.out.println("Area: " +Rectangle.Area());
        Rectangle.Perimetro();
        System.out.println("Perimetro: " +Rectangle.Perimetro());
        
        System.out.println("");
        Rectangle SecondRectangle = new Rectangle(2.3,4);
        SecondRectangle.Area();
        System.out.println("Area: " +SecondRectangle.Area());
        SecondRectangle.Perimetro();
        System.out.println("Perimetro: " +SecondRectangle.Perimetro());
        
        System.out.println("");
        Rectangle ThirdRectangle = new Rectangle(15,6.5);
        ThirdRectangle.Area();
        System.out.println("Area: " +ThirdRectangle.Area());
        ThirdRectangle.Perimetro();
        System.out.println("Perimetro: " +ThirdRectangle.Perimetro());
        
        System.out.println("");
        Rectangle FourthRectangle = new Rectangle(1.9,7.2);
        FourthRectangle.Area();
        System.out.println("Area: " +FourthRectangle.Area());
        FourthRectangle.Perimetro();
        System.out.println("Perimetro: " +FourthRectangle.Perimetro());

    }
    
}
