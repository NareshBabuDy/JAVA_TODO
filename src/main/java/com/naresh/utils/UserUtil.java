package com.naresh.utils;

import com.naresh.models.User;

public class UserUtil {


    private static User userData;
    public static void setLoggedInUser(User user) {
        userData = user;
    }
    public static void removeLoggedInUser()
    {
        userData = null;
    }

    public static User getLoggedInUser()
    {
        return userData;
    }
}
