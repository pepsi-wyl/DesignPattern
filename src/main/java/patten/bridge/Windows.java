package patten.bridge;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 20:36
 */

// Windows操作系统 扩展抽象化角色
public class Windows extends OpratingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
