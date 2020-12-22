package com.stu.ssm.domain;

public class Book {
    private int bookId;
    private String bookName;
    private String bookKind;
    private int bookBrith;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookKind='" + bookKind + '\'' +
                ", bookBrith=" + bookBrith +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookKind() {
        return bookKind;
    }

    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    public int getBookBrith() {
        return bookBrith;
    }

    public void setBookBrith(int bookBrith) {
        this.bookBrith = bookBrith;
    }
}
