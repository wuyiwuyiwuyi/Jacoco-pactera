package www.pactera.com.Jacocopactera.common.Dto;

import lombok.*;
import www.pactera.com.Jacocopactera.common.BaseEntity.BaseDTO;

import javax.servlet.ServletOutputStream;
import java.io.OutputStream;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SourceCoverageRespDTO extends BaseDTO {

    private String projectName;

    private String versionNumber;

    private String operator;

    private String operationTime;

    private String packageName;

    private String sourceName;

    private String coverLine;

    private String missLine;

    private String notLine;

    private String totalLineNumber;

    private String coverLineNumber;

    private String sourceCoverageRate;

}
