package cn.designdemo.structural.adapter.classadapter;

public class Adapter extends Adaptee implements Target {


    public void request() {
        super.adapateeRequest();
    }
}
