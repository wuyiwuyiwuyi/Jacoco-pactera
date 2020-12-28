package www.pactera.com.Jacocopactera.ParsingXmlUtil;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.springframework.util.FileCopyUtils;

import javax.swing.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class ManageXML {

    private final static String BASE_DIRECTORY_PATH = "C:\\Users\\v_yyyiwu\\Desktop";

    private final static String MERGE_REPORT_PATH = "C:\\Users\\v_yyyiwu\\Desktop\\Jacoco-report";

    private static final String DESTFILE = "C:\\Users\\v_yyyiwu\\Desktop\\test\\pactera.exec";

    private final static String ADDRESS = "localhost";

    private final static int PORT = 8222;

    public static void main(String[] args) throws IOException {

        final FileOutputStream fileOutputStream = new FileOutputStream(DESTFILE);

        final Socket socket = new Socket(InetAddress.getByName(ADDRESS), PORT);


    }

    public static void ParsingXML(String ip, String port, String versionId, String projectName) {

        File file = new File(BASE_DIRECTORY_PATH + "\\Jacoco-file\\" + projectName + "_" + versionId);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }

        SAXBuilder saxBuilder = new SAXBuilder();
        try {
            Document doc = saxBuilder.build("C:\\Users\\v_yyyiwu\\Desktop\\build\\build.xml");
            Element root = doc.getRootElement();
            List<Element> messList = root.getChildren();
            //List<Element> messList = root.getChildren("mess");
            Element childrenRoot = null;
            List<Element> propertyList = null;
            for (int i = 0; i < messList.size(); i++) {
                childrenRoot = messList.get(i);
                System.out.println(childrenRoot.getAttributeValue("name"));
                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("server_ip")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", ip);

                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("jacocoexecPath")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", BASE_DIRECTORY_PATH + "\\Jacoco-file\\" + projectName + "_" + versionId + "\\jacoco.exec");

                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("server_port")) {
                    System.out.println("port234543" + childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", port);
                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("server_name")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", projectName);
                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("reportfolderPath")) {
                    childrenRoot.setAttribute("value", BASE_DIRECTORY_PATH + "\\Jacoco-report\\" + projectName + "\\" + versionId);
                }

            }
            XMLOutputter outputter = new XMLOutputter();
            outputter.output(doc, new FileOutputStream(BASE_DIRECTORY_PATH + "\\Jacoco-file\\" + projectName + "_" + versionId + "\\build.xml"));
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void mergeBranch(String[] str, String newPath) {


        String exportPath = newPath + "_merge";
        //生成合并的merge.exec文件，所以此处还是要组装build.xml
        createFolder(exportPath);

        mergeBuildXML("merge-pactera", "V4.20201028", newPath, exportPath);


    }

    public static void copyFile(String oldfilePath, String newfilePath) {
        try {
            InputStream input = new FileInputStream(oldfilePath);
            FileOutputStream output = new FileOutputStream(newfilePath);

            FileCopyUtils.copy(input, output);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param projectName 项目名称
     * @param versionNum  版本号
     * @param mergePath   合并为merge.exec的路径
     * @param exportPath  合并报告输出的路径
     */

    public static void mergeBuildXML(String projectName, String versionNum, String mergePath, String exportPath) {

        String reportPath = MERGE_REPORT_PATH + "\\" + projectName + "\\" + versionNum;

        SAXBuilder saxBuilder = new SAXBuilder();
        try {
            Document doc = saxBuilder.build("C:\\Users\\v_yyyiwu\\Desktop\\build\\build.xml");
            Element root = doc.getRootElement();
            List<Element> messList = root.getChildren();
            //List<Element> messList = root.getChildren("mess");
            Element childrenRoot = null;
            List<Element> propertyList = null;
            for (int i = 0; i < messList.size(); i++) {
                childrenRoot = messList.get(i);
                System.out.println(childrenRoot.getAttributeValue("name"));
                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("mergePath")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", mergePath);

                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("exportMergePath")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", exportPath);

                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("reportfolderPath")) {
                    childrenRoot.setAttribute("value", reportPath);
                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("jacocoexecPath")) {
                    childrenRoot.setAttribute("value", exportPath + "\\merged.exec");
                }

                if (null != childrenRoot.getAttributeValue("name") && childrenRoot.getAttributeValue("name").equals("server_name")) {
                    System.out.println(childrenRoot.getAttributeValue("value"));
                    childrenRoot.setAttribute("value", projectName);
                }

            }
            XMLOutputter outputter = new XMLOutputter();
            outputter.output(doc, new FileOutputStream(exportPath + "\\build.xml"));
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFolder(String filePath) {
        File file = new File(filePath);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
    }


}
