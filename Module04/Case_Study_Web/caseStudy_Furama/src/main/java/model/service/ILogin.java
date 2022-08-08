package model.service;

import model.bean.User;

public interface ILogin {
    User checkExits(User u);
}
