package jdbc._01.model.location;

import java.util.List;

public interface LocationInterface {
	public int insert(LocationBean locationVO);
	public int update(LocationBean locationVO);
	public int delete(LocationBean locationVO);
	public LocationBean selectOne(String locationVO);
	public List<LocationBean> selectAll(LocationBean locationVO);
}

