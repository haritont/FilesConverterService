package org.example.convert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.shops.Shops;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertToJson {
    public void convert(Shops shops, String newFile) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson json = builder.setPrettyPrinting().create();
        String jsonString = json.toJson(shops);
        FileWriter writer = new FileWriter(newFile);
        writer.write(jsonString);
        writer.close();
    }
}
