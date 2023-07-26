package Part_02_03_OOP_Core.ch13.domain.userinfo.dao.mysql;

import Part_02_03_OOP_Core.ch13.domain.userinfo.UserInfo;
import Part_02_03_OOP_Core.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId() );
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());

    }

}

