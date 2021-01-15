package www.pactera.com.Jacocopactera.component.report;

import www.pactera.com.Jacocopactera.common.Dto.CollectCoverageReqDTO;
import www.pactera.com.Jacocopactera.component.data.execution.ExecutionData;
import www.pactera.com.Jacocopactera.component.data.session.SessionInfo;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface IMergeVisitor extends IReportGroupVisitor{

    void visitInfo(List<SessionInfo> sessionInfos,
                   Collection<ExecutionData> executionData,String project,String versionNumber) throws IOException;

    void visitEnd() throws IOException;

}
