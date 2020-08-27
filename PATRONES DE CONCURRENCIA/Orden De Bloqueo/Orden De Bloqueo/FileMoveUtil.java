
public class FileMoveUtil extends Thread {

    private FileSysUtil_Rev fsr;
    private Directory obj1;
    private Directory obj2;

    public FileMoveUtil(FileSysUtil_Rev dis, Directory objDir_1, Directory objDir_2) {
        this.fsr = fsr;
        this.obj1 = objDir_1;
        this.obj2 = objDir_2;
        start();
    }

    @Override
    public void run() {
        fsr.moveContents(obj1, obj2);
    }
}
