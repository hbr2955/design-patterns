package com.designpattern.composite.filesystem.without;

public class File {
    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public void printContent(){
        System.out.println("File Name:" + fileName);
    }
}
