
public class LockOrderTest {

    public static void main(String[] args) {
        Directory objDir_1 = new Directory("directorio1");
        Directory objDir_2 = new Directory("directorio2");
        FileSysUtil_Rev fsr = new FileSysUtil_Rev();

        new FileMoveUtil(fsr, objDir_1, objDir_2);
        new FileMoveUtil(fsr, objDir_2, objDir_1);
    }
}




