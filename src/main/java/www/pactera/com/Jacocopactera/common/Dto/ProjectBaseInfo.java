package www.pactera.com.Jacocopactera.common.Dto;

public class ProjectBaseInfo {
    /**
     * 服务名称
     */
    private String projectName;
    /**
     * 服务的版本号
     */
    private String versionNumber;
    /**
     * 操作的用户
     */
    private String operator;

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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ProjectBaseInfo(String projectName, String versionNumber, String operator) {
        this.projectName = projectName;
        this.versionNumber = versionNumber;
        this.operator = operator;
    }

    public ProjectBaseInfo() {

    }

    @Override
    public String toString() {
        return "ProjectBaseInfo{" +
                "projectName='" + projectName + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
