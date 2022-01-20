package multi.database.mapper.home;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeBookingMapper {
	public ArrayList<String>selectName();
	
	@Insert("INSERT INTO home.booking VALUES (#{bookingId}, #{bookingdesc}, #{status} , #{dateTime})")
	void insertHomeBooking(@Param("bookingId") int bookingId
			              , @Param("bookingdesc") String bookingdesc, @Param("status") String status, LocalDate dateTime);

}
