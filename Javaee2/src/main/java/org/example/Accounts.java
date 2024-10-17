package org.example;

public class Accounts {
    private Integer id;
    private String userName;
    private Double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", UserName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
