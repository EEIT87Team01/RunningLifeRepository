package jdbc._01.model.loginInformation;

import java.util.List;

public interface LoginInformationInterface {
	public int insert(LoginInformationBean loginInformationVO);
	public int update(LoginInformationBean loginInformationVO);
	public int delete(LoginInformationBean loginInformationVO);
	public LoginInformationBean selectOne(String loginInformationVO);
	public List<LoginInformationBean> selectAll(LoginInformationBean loginInformationVO);
}
