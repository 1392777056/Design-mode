package cn.designdemo.simplefactory;

public class Test {

    public static void main(String[] args) {

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        //Video video = videoFactory.getTypeVideo("python");
        if (video == null){
            return;
        }
        video.produce();

    }

}
