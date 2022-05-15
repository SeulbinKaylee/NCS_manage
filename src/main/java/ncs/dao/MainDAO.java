package ncs.dao;

import java.util.List;

import ncs.dto.MainDTO;


public interface MainDAO {
	public List<MainDTO> mainshowBoardNoti(MainDTO vo) throws Exception;
	public List<MainDTO> mainshowBoardQna(MainDTO vo) throws Exception;
}
