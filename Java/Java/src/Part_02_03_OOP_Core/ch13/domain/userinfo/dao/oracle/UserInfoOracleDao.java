package Part_02_03_OOP_Core.ch13.domain.userinfo.dao.oracle;

import Part_02_03_OOP_Core.ch13.domain.userinfo.UserInfo;
import Part_02_03_OOP_Core.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    public void insertUserInfo(UserInfo userInfo){
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
    }

    public void updateUserInfo(UserInfo userInfo){
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    public void deleteUserInfo(UserInfo userInfo){
        System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
    }
}
