package www.pactera.com.Jacocopactera.service;

import www.pactera.com.Jacocopactera.common.BaseEntity.ResponseData;
import www.pactera.com.Jacocopactera.common.Dto.*;

import javax.servlet.http.HttpServletResponse;


public interface ICoverageCollectService {

    ResponseData<CollectCoverageRespDTO> coverageCollect(CollectCoverageReqDTO reqDTO,String token);

    ResponseData<MergeCoverageRespDTO> coverageMerge(MergeCoverageReqDTO reqDTO);

    ResponseData<QueryCoverageRespDTO> coverageQuery(QueryCollectCoverageReqDTO reqDTO);

    ResponseData<ProjectCoverageRespDTO> queryProjectCoverage(ProjectCoverageReqDTO projectCoverageReqDTO);

    ResponseData<SourceCoverageRespDTO> querySourceCoverage(SourceCoverageReqDTO sourceCoverageReqDTO);

    void gainSourceFile(HttpServletResponse response,SourceCoverageReqDTO reqDTO);

}
