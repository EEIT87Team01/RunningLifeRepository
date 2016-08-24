package jdbc._01.model.emergencyRelation;

import java.util.List;

public interface EmergencyRelationInterface {
	public int insert(EmergencyRelationBean emergencyRelationVO);
	public int update(EmergencyRelationBean emergencyRelationVO);
	public int delete(EmergencyRelationBean emergencyRelationVO);
	public EmergencyRelationBean selectOne(String menbemergencyRelationVOerVO);
	public List<EmergencyRelationBean> selectAll(EmergencyRelationBean emergencyRelationVO);
}
