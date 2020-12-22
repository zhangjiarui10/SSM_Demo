package com.stu.ssm.domain;

public class Relation {
    private int userId;
    private int bookId;
    private String userName;
    private String bookName;

    @Override
    public String toString() {
        return "Relation{" +
                "userId=" + userId +
                ", bookId=" + bookId +
                ", userName='" + userName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
