package org.use.service;


import org.spring.*;

@Component("orderService")
@Scope("singleton")
public class OrderServiceImpl implements BeanNameAware, OrderService, InitializingBean {
    @Autowired
    private UserService userService;

    private String beanName;
    @Override
    public void test() {
        System.out.println(userService);
        System.out.println(beanName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userServiceImpl) {
        this.userService = userServiceImpl;
    }
}
