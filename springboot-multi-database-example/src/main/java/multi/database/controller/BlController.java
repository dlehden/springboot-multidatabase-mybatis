package multi.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.database.dto.local.BlInfoDTO;
import multi.database.dto.local.BlhdDTO;
import multi.database.service.BlService;

@RestController
public class BlController {
	@Autowired
	private BlService blService;
	
	@RequestMapping("/blhd")
	public List<BlhdDTO> selectName() {
		return blService.selectBlhdInfo();
	}
	
	@RequestMapping("/blinfo")
	public List<BlInfoDTO> selectBlInfo() {
		return blService.selectBlsInfo();
	}


}
