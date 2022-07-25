package org.spring;

public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
