package org.example;
import jdk.jshell.SourceCodeAnalysis;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
///tworzenie obiektów kalsy Aktor
// zrób 2 obiekty Angeline Joli i Brad Pitt
        Actor angelinaJoli2 = new Actor();
        Actor jimCarrey = new Actor();
        Actor angelinaJoli = new Actor("Angelina", "Joli", 3, false);
        Actor bradPitt = new Actor("Brad", "Pitt", 5, true);
        System.out.println(bradPitt.getRating());
        jimCarrey.setRating(18);
        System.out.println("Rating Brada Pita to:" + bradPitt.getRating());
        System.out.println("Rating Angeliny to :" + angelinaJoli.getRating());
        System.out.println("Rating Jima to:" + jimCarrey.getRating());
        System.out.println("Oskar Jima to:" + jimCarrey.isOskarPrized());
        System.out.println("Nazwisko Jim to:" + jimCarrey.getLastName());
        int age = 33;
        String imie = "Darek";
        String aktorka = "Angelina";
        System.out.println(imie + "" + aktorka + "to dobrzy znajomi!");
        System.out.println(aktorka + "ms" + age + "lata");
        System.out.println(age + age);
        Movie esyRider = new Movie("Esy Rider", 1989, 5);
        Movie titanic = new Movie("Titanic", 1999, 8);
        Movie harryPotter = new Movie("Harry Potter", 2005, 3);
        if (titanic.getRating() >= harryPotter.getRating()) {
            System.out.println("titanick jest popularniejszy");
        } else {
            System.out.println("Harry Potter jest popularnielszy");
        }
    }}


