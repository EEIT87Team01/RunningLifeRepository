package jdbc._05.model;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

public class JDBCTest {

	public static void main(String[] args) {
		EventVO eventVO= new EventVO();
		eventVO.setLocationID("001");
		eventVO.setName("test1");
		eventVO.setTime(Timestamp.valueOf("2016-9-30 00:00:00"));
		eventVO.setApplyFee(666);
		eventVO.setApplyStart(Timestamp.valueOf("2016-9-1 00:00:00"));
		eventVO.setApplyEnd(Timestamp.valueOf("2016-9-28 23:59:59"));
		eventVO.setCommnet("success");
		eventVO.setEventPhotoPath("c:\\");
		eventVO.setEventID(1);
		EventJDBCDAO eventJDBCDAO = new EventJDBCDAO();
		try {
			eventJDBCDAO.getConnection();
			List<EventVO>events=eventJDBCDAO.findAll();
			Iterator<EventVO> it =  events.iterator();
			EventVO event = new EventVO();
			while(it.hasNext()){
				 event = it.next();
				 System.out.printf("%5s",event.getEventID());
				 System.out.printf("%4s",event.getLocationID());
				 System.out.printf("%10s",event.getName());
				 System.out.printf("%24s",event.getTime());
				 System.out.printf("%4s",event.getApplyFee());
				 System.out.printf("%24s",event.getApplyStart());
				 System.out.printf("%24s",event.getApplyEnd());
				 System.out.printf("%10s",event.getCommnet());
				 System.out.printf("%10s \n",event.getEventPhotoPath());
			}
//			EventVO event =eventJDBCDAO.findByPrimaryKey(1);
//			eventJDBCDAO.insert(event);
//			eventJDBCDAO.update(eventVO);
//			eventJDBCDAO.delete(3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
//insert into [event]([locationID],[name],[time],[applyFee],[applyStart],[applyEnd],[comment],[eventPhotoPath]) values('001','第1場','2016/9/27','500','2016/8/30 00:00:00','2016/9/30 23:59:59','hello','c://');