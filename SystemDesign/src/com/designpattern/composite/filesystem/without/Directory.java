package com.designpattern.composite.filesystem.without;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.objectList = new ArrayList<>();
    }
     public void addObject(Object object){
        objectList.add(object);
     }
     public void removeObject(Object object){
        objectList.remove(object);
     }

     /*Display full Structure
     * */

    public void printContent(){
        System.out.println("Directory Name:" + directoryName);
        for(Object object:objectList){
            if(object instanceof File){
                ((File) object).printContent();
            } else if (object instanceof Directory) {
                ((Directory) object).printContent();
            }
        }
    }
}
