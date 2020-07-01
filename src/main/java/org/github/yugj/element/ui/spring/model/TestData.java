package org.github.yugj.element.ui.spring.model;

/**
 * @author yugj
 * @date 2020/7/1 5:48 下午.
 */
public class TestData {

    private String date;
    private String address;
    private String name;

    public TestData() {

    }

    public TestData(String date, String address, String name) {
        this.date = date;
        this.address = address;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
