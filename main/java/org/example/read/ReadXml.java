package org.example.read;

import com.thoughtworks.xstream.XStream;
import org.example.shops.Shops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadXml {
    public Shops read(String fileName) throws IOException {
        XStream xstream = new XStream();
        xstream.allowTypes(new Class[] {org.example.shops.Shops.class});
        xstream.processAnnotations(Shops.class);
        return (Shops) xstream.fromXML(readFile(fileName));
    }
    private String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder file = new StringBuilder();
        String read;
        while ( (read = reader.readLine() ) !=null ){
            file.append(read);
        }
        return file.toString();
    }
}
