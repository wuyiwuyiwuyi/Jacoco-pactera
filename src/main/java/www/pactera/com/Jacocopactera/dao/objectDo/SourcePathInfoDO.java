package www.pactera.com.Jacocopactera.dao.objectDo;

import java.util.Date;

public class SourcePathInfoDO {

    private int id;

    private String projectName;

    private String versionNumber;

    private Date operationTime;

    private String operator;

    private String packagePath;

    private String isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public SourcePathInfoDO(int id, String projectName, String versionNumber, Date operationTime, String operator, String packagePath, String isDelete) {
        this.id = id;
        this.projectName = projectName;
        this.versionNumber = versionNumber;
        this.operationTime = operationTime;
        this.operator = operator;
        this.packagePath = packagePath;
        this.isDelete = isDelete;
    }

    public SourcePathInfoDO() {

    }

    @Override
    public String toString() {
        return "SourcePathInfoDO{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", operationTime='" + operationTime + '\'' +
                ", operator='" + operator + '\'' +
                ", packagePath='" + packagePath + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}
