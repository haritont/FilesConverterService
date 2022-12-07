package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
public class Shop {
    @SerializedName("name")
    private String name;
    @SerializedName("department")
    private ArrayList<Department> departments;
}
