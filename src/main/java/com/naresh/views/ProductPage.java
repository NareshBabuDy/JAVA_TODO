package com.naresh.views;

import com.naresh.models.Category;
import com.naresh.models.Product;
import com.naresh.utils.StringUtil;

import java.util.ArrayList;

import static com.naresh.utils.AppOutput.println;

public class ProductPage {
    public void printCategories(ArrayList<Category> categories) {
        println(StringUtil.CATEGORY_MESSAGE);
        for (Category category : categories){
            println(category.getId()+". " + category.getCategoryName());
        }
        println(StringUtil.BACK);
    }

    public void printCategoryProducts(int choice, ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {
            if (product.getCategory().getId() == choice) {
                println(product.getId() + ". " + product.getProductName()  + ", ₹." + product.getPrice());
            }
        }

    }

    public void printAllProducts(ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {

            println(product.getId() + ". " + product.getProductName() + ", ₹." + product.getPrice());

        }
    }
}
