package com.designpattern.composite.filesystem.with;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    String directoryName;
    List<FileSystemComponent> children;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        children = new ArrayList<>();
    }

    public void addChild(FileSystemComponent fileSystemComponent) {
        children.add(fileSystemComponent);
    }

    public void removeChild(FileSystemComponent fileSystemComponent) {
        children.remove(fileSystemComponent);
    }

    @Override
    public void printContents() {
        System.out.println("Directory: "+ directoryName);
        for (FileSystemComponent child : children) {
        child.printContents();
    }
}
}
