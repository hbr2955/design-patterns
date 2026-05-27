package com.designpattern.composite.filesystem.without;

public class Client {
    public static void main(String args[]) {
        Directory dir = new Directory("Movies");
        File hungama = new File("Hungama");

        dir.addObject(hungama);

        Directory scifiMovie = new Directory(" Scifi Movies");
        dir.addObject(scifiMovie);
        File zatoora = new File("Zatoora");
        scifiMovie.addObject(zatoora);

        dir.printContent();
    }
}
