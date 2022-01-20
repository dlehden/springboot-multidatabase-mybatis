package multi.database.mapper.local;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookingMapper {
	public ArrayList<String> selectName();
	
	@Insert("INSERT INTO booking VALUES (#{bookingId}, #{bookingdesc}, #{status} , #{dateTime})")
	void insertLocalBooking(@Param("bookingId") int bookingId
			              , @Param("bookingdesc") String bookingdesc, @Param("status") String status, LocalDate dateTime);

}
