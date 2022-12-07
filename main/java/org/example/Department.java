package org.example.shops;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class Department {
    @XStreamAlias("nameDepartment")
    @SerializedName("nameDepartment")
    private String nameDepartment;
    @XStreamAlias("products")
    @SerializedName("products")
    private ArrayList<Product> products;
}
