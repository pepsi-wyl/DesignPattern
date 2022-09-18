package patten.bridge;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 20:30
 */

// Avi视频文件  具体的实现化角色
public class AviFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("Avi视频文件:" + filename);
    }
}
