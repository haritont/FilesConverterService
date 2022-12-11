package org.example.shops;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
@XStreamAlias("department")
public class Department {

    @XStreamAlias("nameDepartment")
    @XStreamAsAttribute
    @SerializedName("nameDepartment")
    private String nameDepartment;

    @XStreamImplicit(itemFieldName = "product")
    @SerializedName("product")
    private ArrayList<Product> products;
}
