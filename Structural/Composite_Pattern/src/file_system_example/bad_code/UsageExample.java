package file_system_example.bad_code;

import java.util.List;

public class UsageExample {
    public static void main(String[] args) {
        File videoFile = new File("VideoFile.mp4", 82742);
        File pngFile = new File("PngFile.png", 2450);
        File maliciousFile = new File("MaliciousFile.exe", 9999999);

        Directory subDirectory = new Directory("Directory1", List.of(videoFile, pngFile, maliciousFile), List.of());
        Directory rootDirectory = new Directory("Directory2", List.of(pngFile), List.of(subDirectory));

        System.out.println(rootDirectory.getSize());

    }
}
