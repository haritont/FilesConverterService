package org.example.read;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.shops.Shops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJson {

    public Shops read(String fileName) throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Gson json = builder
                .setPrettyPrinting()
                .create();
        return json.fromJson(reader, Shops.class);
    }
}
