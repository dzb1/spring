package org.use.service;

import org.spring.Autowired;
import org.spring.Component;
import org.spring.InitializingBean;
import org.spring.Scope;

@Component("userService")
@Scope("singleton1")
public class UserServiceImpl implements UserService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
