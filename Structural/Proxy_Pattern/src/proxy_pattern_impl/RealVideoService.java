package proxy_pattern_impl;

public class RealVideoService implements VideoService {

    @Override
    public void playVideo(String name) {
        System.out.println("Playing video: " + name);
    }
}
