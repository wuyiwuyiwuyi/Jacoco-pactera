package www.pactera.com.Jacocopactera.component.report;

import www.pactera.com.Jacocopactera.common.Dto.CollectCoverageReqDTO;
import www.pactera.com.Jacocopactera.component.data.execution.ExecutionData;
import www.pactera.com.Jacocopactera.component.data.session.SessionInfo;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface IMergeVisitor extends IReportGroupVisitor{

    /**
     * Initializes the report with global information. This method has to be
     * called before any other method can be called.
     *
     * @param sessionInfos
     *            list of chronological ordered {@link SessionInfo} objects
     *            where execution data has been collected for this report.
     * @param executionData
     *            collection of all {@link ExecutionData} objects that are
     *            considered for this report
     * @throws IOException
     *             in case of IO problems with the report writer
     */
    void visitInfo(List<SessionInfo> sessionInfos,
                   Collection<ExecutionData> executionData,String project,String versionNumber) throws IOException;

    /**
     * Has to be called after all report data has been emitted.
     *
     * @throws IOException
     *             in case of IO problems with the report writer
     */
    void visitEnd() throws IOException;

}
