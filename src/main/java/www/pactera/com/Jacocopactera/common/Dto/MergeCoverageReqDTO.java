package www.pactera.com.Jacocopactera.common.Dto;

import java.util.List;

public class MergeCoverageReqDTO {
    /**
     * 需要合并的项目信息
     */
    private List<ProjectBaseInfo> mergeServerInfo;

    public List<ProjectBaseInfo> getMergeServerInfo() {
        return mergeServerInfo;
    }

    public void setMergeServerInfo(List<ProjectBaseInfo> mergeServerInfo) {
        this.mergeServerInfo = mergeServerInfo;
    }

    public MergeCoverageReqDTO(List<ProjectBaseInfo> mergeServerInfo) {
        this.mergeServerInfo = mergeServerInfo;
    }

    public MergeCoverageReqDTO() {

    }

}
