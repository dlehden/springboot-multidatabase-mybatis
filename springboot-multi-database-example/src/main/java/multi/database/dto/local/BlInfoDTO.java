package multi.database.dto.local;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BlInfoDTO {
	private String blno;
	private String shipper;
	private String consignee;
	private List<BlCntrDTO> blCntrInfo;

}
