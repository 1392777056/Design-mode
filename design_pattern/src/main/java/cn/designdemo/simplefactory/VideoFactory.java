package cn.designdemo.simplefactory;

public class VideoFactory {

    public Video getVideo(Class c){
        Video video = null;
        try {
            video  = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /*public Video getTypeVideo(String type){
        Video v = null;
        if ("java".equals(type)){
            v = new JavaVideo();
            return v;
        } else if ("python".equals(type)) {
            v = new PythonVideo();
            return v;
        } else {
            return null;
        }
    }*/

}
