package com.sporthistory.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class SportHistoryDAO implements ISportHistoryDAO {

	@Override
	public void getConnection() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insert(SportHistoryVO SH) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SportHistoryVO SH) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String recordID) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SportHistoryVO findByPrimaryKey(String recordID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SportHistoryVO> getMemberAllData(String memberID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SportHistoryVO> getMemberAllDataByDateTime(String memberID, Date startDate, Date endDate)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SportHistoryVO> getAllDataByDateTime(Date startDate, Date endDate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConn() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
