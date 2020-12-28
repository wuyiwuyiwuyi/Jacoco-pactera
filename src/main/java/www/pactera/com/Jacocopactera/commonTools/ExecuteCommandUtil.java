package www.pactera.com.Jacocopactera.commonTools;

import java.io.File;
import java.io.IOException;

public class ExecuteCommandUtil {
    /**
     * 执行string的命令行
     *
     * @param jacocoPath Jacoco.exec 文件的保存路径
     */
    public static Boolean executeCommand(String jacocoPath) {

        try {
            String[] commandStr = {"cmd.exe /k ant dump", "cmd.exe /k ant report"};
            for (int i = 0; i < commandStr.length; i++) {
                Runtime.getRuntime().exec(commandStr[i], null, new File(jacocoPath));
                if (i != commandStr.length - 1) {
                    Thread.currentThread().sleep(1000);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 根据文件的路径执行shell文件
     *
     * @param shellPath
     */
    public static void executeShell(String shellPath) {

    }

    public static Boolean executeMergeCommand(String jacocoMergePath) {

        try {
            String[] commandStr = {"cmd.exe /k ant merge", "cmd.exe /k ant report"};
            for (int i = 0; i < commandStr.length; i++) {
                Runtime.getRuntime().exec(commandStr[i], null, new File(jacocoMergePath));
                if (i != commandStr.length - 1) {
                    Thread.currentThread().sleep(1000);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("cmd.exe /k ant dump", null, new File("C:\\Users\\v_yyyiwu\\Desktop\\Jacoco-file\\coverage-pactera\\V8.20201103-12456743245"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
