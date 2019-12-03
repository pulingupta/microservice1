package com.api.service1.resource;

public class User {
    private String userName;
    private Long salary;
	public User(String userName, Long salary) {
        this.userName = userName;
        this.salary = salary;
	}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

}
