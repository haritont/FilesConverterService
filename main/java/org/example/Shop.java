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
public class Shop {
    @XStreamAlias("name")
    @SerializedName("name")
    private String name;

    @XStreamAlias("department")
    @SerializedName("department")
    private ArrayList<Department> departments;
}
