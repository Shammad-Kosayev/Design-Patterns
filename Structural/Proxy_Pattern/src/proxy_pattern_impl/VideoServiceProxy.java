package proxy_pattern_impl;

public class VideoServiceProxy implements VideoService {

    private final RealVideoService realVideoService;

    public VideoServiceProxy(RealVideoService realVideoService) {
        this.realVideoService = realVideoService;
    }

    @Override
    public void playVideo(String name) {
        if (!hasAccess()) {
            System.out.println("Access denied");
            return;
        }

        System.out.println("Logging access...");

        realVideoService.playVideo(name);
    }

    private boolean hasAccess() {
        return true; // simulate auth
    }
}
