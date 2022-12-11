package org.example;

import org.example.convert.ConvertFiles;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ConvertFiles convert = new ConvertFiles();
       convert.convert(args);
    }
}