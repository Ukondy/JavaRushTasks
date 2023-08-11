package com.javarush.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {

    protected HTMLFileFilter() {
        super();
    }

    @Override
    public boolean accept(File f) {
       return f.isDirectory() | f.getName().toLowerCase().endsWith(".html") | f.getName().toLowerCase().endsWith(".htm");
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
