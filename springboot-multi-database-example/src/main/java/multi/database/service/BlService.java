package multi.database.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import multi.database.dto.local.BlInfoDTO;
import multi.database.dto.local.BlhdDTO;
import multi.database.mapper.local.BlMapper;

@Service
public class BlService {
	// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
	LocalDate now = LocalDate.now();

	@Autowired
	BlMapper blMapper;

	public List<BlhdDTO> selectBlhdInfo() {
		return blMapper.selectBlhd("");
	}

	public List<BlInfoDTO> selectBlsInfo() {
		return blMapper.selectBlInfo("");
	}

}
