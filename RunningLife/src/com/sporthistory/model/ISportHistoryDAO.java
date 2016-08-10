package com.sporthistory.model;

import java.sql.Date;
import java.util.List;
import java.sql.SQLException;

public interface ISportHistoryDAO {
	public void getConnection() throws SQLException;
	public int insert(SportHistoryVO SH) throws SQLException;
	public int update(SportHistoryVO SH) throws SQLException;
	public int delete(String recordID) throws SQLException;
	public SportHistoryVO findByPrimaryKey(String recordID) throws SQLException;
	public List<SportHistoryVO> getMemberAllData(String memberID) throws SQLException;
	public List<SportHistoryVO> getMemberAllDataByDateTime(String memberID, Date startDate, Date endDate) throws SQLException;
	public List<SportHistoryVO> getAllDataByDateTime(Date startDate, Date endDate) throws SQLException;
	public void closeConn() throws SQLException;
}
