package cn.kgc.entity;

/**
 * @className User 用户类
 * @Date 2018/8/1110:11
 * @Author 韩宏伟
 **/
public class User {
    private Integer userId;//用户ID 注解
    private String userName;//用户名 必填
    private String userPassword;//用户名 必填

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
