package Helpers;

import Models.User;
import Pages.AccountPage;

public class AccountPageHelper extends AccountPage {


    public User getUser(){
    User user = new User();
    user.setFirstname(getFisrtName());
    user.setLastname(getLastName());
    user.setEmail(getEmail());
    return user;
    }

}
