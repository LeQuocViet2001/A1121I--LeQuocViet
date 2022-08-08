package model.service.impl;

import model.bean.User;
import model.repository.inteface.ILoginRepository;
import model.repository.impl.LoginRepository;
import model.service.ILogin;

public class LoginService implements ILogin {
    private ILoginRepository iLoginRepository = new LoginRepository();

    @Override
    public User checkExits(User u) {
        return iLoginRepository.checkExits(u);
    }
}
