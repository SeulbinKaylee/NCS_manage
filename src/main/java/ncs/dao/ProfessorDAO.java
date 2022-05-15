package ncs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ncs.dto.CourseListDTO;
import ncs.dto.PrScoreDTO;
import ncs.dto.PrScoreListDTO;
import ncs.dto.PrStincoListDTO;
import ncs.dto.StScoreDTO;
import ncs.dto.TestInfoDTO;
import ncs.dto.TestQResultDTO;
import ncs.dto.TestResultSNADTO;
import ncs.dto.TestSelectDTO;



public interface ProfessorDAO {
//	public List<CourseListDTO> courseList()throws Exception;  
	//강사 아이디 값이 필요함
	public List<CourseListDTO> prcourseList(String userid)throws Exception; 
	public List<PrStincoListDTO> prStincoList(@Param("cid") int cid) throws Exception;
	public List<StScoreDTO> prStScoreList(@Param("cid") int cid,@Param("stid") String stid) throws Exception;
	public List<PrScoreDTO> prScore (PrScoreDTO HPrSungJuk) throws Exception;
		
	public List<PrScoreListDTO> prScoreList (@Param("cid") Integer cid, @Param("tid") Integer tid ) throws Exception;
	public List<PrScoreListDTO> prScoreList2 (@Param("cid") int cid, @Param("tid") int tid ) throws Exception;
	public List<PrScoreListDTO> prScoreList3 (@Param("cid") int cid, @Param("tid") int tid ) throws Exception;
	
	public List<TestInfoDTO> prtestInfo(@Param("tid") int tid, @Param("stid") String stid) throws Exception;
	public List<TestQResultDTO> prshowQuesAnswerResultList (@Param("tid")int tid,@Param("stid") String stid) throws Exception;
	public List<TestResultSNADTO> prtestResultSumAvgList (@Param("tid")int tid,@Param("stid") String stid) throws Exception;
	
	public List<TestSelectDTO> prtestSelect(String userid) throws Exception;
	public List<TestSelectDTO> prtestSelect2(String userid) throws Exception;
	
	public String prgetNCSnum(@Param("ncs_name") String ncs_name) throws Exception;
	public String prgetNCSname(@Param("ncs_num") String ncs_num )throws Exception;
	public String prgetStid(@Param("sname") String sname)throws Exception;
	public String prgetSname(@Param("stid") String stid)throws Exception;
	public Integer prgetCid(@Param("cname") String cname)throws Exception;
	public String prgetCname(@Param("cid") int cid) throws Exception;
	public Integer prgetTid(@Param("cid") int cid, @Param("ncs_num") String ncs_num, @Param("type") int type) throws Exception;
	
}
