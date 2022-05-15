package ncs.service;

import java.util.List;

import ncs.dto.MainDTO;


public interface MainService {
	public List<MainDTO> mainshowBoardNoti(MainDTO dto) throws Exception;

	public List<MainDTO> mainshowBoardQna(MainDTO dto) throws Exception;

}
