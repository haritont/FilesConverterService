package org.example.convert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.Product;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertToJson {
    public void convert(Product product, String newFile) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson json = builder.setPrettyPrinting().create();
        String jsonString = json.toJson(product);
        FileWriter writer = new FileWriter(newFile);
        writer.write(jsonString);
        writer.close();
    }
}
