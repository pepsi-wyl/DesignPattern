package patten.bridge;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 20:33
 */

// 抽象操作系统类  抽象化角色
public abstract class OpratingSystem {

    // 声明VideoFile
    VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);

}
