package multi.database.mapper.local;

import java.util.List;

import multi.database.dto.local.BlInfoDTO;
import multi.database.dto.local.BlhdDTO;

public interface BlMapper {
	List<BlhdDTO>selectBlhd(String blno);
	List<BlInfoDTO>selectBlInfo(String blno);

}
