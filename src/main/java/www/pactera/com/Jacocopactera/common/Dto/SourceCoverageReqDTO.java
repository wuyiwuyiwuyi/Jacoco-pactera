package www.pactera.com.Jacocopactera.common.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import www.pactera.com.Jacocopactera.common.BaseEntity.BaseDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SourceCoverageReqDTO extends BaseDTO {
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 版本号
     */
    private String versionNumber;
    /**
     *  操作人
     */
    private String operator;
    /**
     * java源文件名称
     */
    private String sourceName;

}
