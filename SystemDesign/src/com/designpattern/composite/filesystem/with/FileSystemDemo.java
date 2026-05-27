package com.designpattern.composite.filesystem.with;

public class FileSystemDemo {
    public static void main(String[] args) {
        System.out.println("COMPOSITE DESIGN PATTERN");

        //Create Files
        File receipt =new File("receipt.pdf");
        File invoice =new File("invoice.pdf");
        File billing =new File("billing.pdf");

        File documents =new File("documents.txt");

        //Directories
        Directory mainDirectory = new Directory("main");
        Directory moviesDirectory = new Directory("movies");
        Directory productsDirectory = new Directory("products");

        mainDirectory.addChild(moviesDirectory);
        moviesDirectory.addChild(productsDirectory);
        mainDirectory.addChild(receipt);

        productsDirectory.addChild(billing);
        productsDirectory.addChild(documents);


        mainDirectory.printContents();
    }
}
