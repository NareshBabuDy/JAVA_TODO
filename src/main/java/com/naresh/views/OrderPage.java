package com.naresh.views;

import com.naresh.models.Order;
import com.naresh.models.User;
import com.naresh.utils.StringUtil;

import java.util.ArrayList;

import static com.naresh.utils.AppOutput.println;
import static com.naresh.utils.UserUtil.getLoggedInUser;

public class OrderPage {
    public void printOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        User user = getLoggedInUser();
        for(Order order:orders)
        {
            if(order.getUser().getId()==user.getId())
            {
                println(order.getId()+". " + order.getProduct().getProductName() +", "+ order.getDate() +", ₹."+order.getProduct().getPrice());
            }
        }
    }
}
