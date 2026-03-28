import proxy_pattern_impl.RealVideoService;
import proxy_pattern_impl.VideoService;
import proxy_pattern_impl.VideoServiceProxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        VideoService service = new VideoServiceProxy(new RealVideoService());

        service.playVideo("movie.mp4");
    }
}