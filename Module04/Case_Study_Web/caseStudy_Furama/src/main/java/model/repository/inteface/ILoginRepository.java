package model.repository.inteface;

import model.bean.User;

public interface ILoginRepository {
    User checkExits(User u);


}
