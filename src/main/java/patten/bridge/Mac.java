package patten.bridge;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 20:38
 */

// Mac操作系统 扩展抽象化角色
public class Mac extends OpratingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
