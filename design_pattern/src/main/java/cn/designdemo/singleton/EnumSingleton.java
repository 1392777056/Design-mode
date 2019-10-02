package cn.designdemo.singleton;

public enum  EnumSingleton {

    DEZHE{
        protected void printTest(){
            System.out.println("测试方法");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return DEZHE;
    }

}
