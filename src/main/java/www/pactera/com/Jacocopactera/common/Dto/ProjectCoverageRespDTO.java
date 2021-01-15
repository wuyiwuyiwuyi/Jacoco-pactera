package www.pactera.com.Jacocopactera.common.Dto;

import com.google.gson.JsonArray;
import lombok.*;
import www.pactera.com.Jacocopactera.common.BaseEntity.BaseDTO;
import www.pactera.com.Jacocopactera.common.BaseEntity.Data;

import java.io.File;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectCoverageRespDTO extends BaseDTO {

    private String projectName;

    private String versionNumber;

    private String phase;

    private String status;

    private String type;

    private String coverageLine;

    private String totalLine;

    private String coverageRate;

    private String operator;

    private String operationTime;

    private String data;





}
