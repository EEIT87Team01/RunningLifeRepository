package jdbc._05.model;

import java.util.List;

public interface IEventJDBCDAO {
	public int insert(EventVO event);
	public int update(EventVO event);
	public int delete(int eventID);
	public EventVO findByPrimaryKey(int eventID);
	public List<EventVO> findAll();
}
