package Part_02_03_OOP_Core.ch13.domain.userinfo.web.userinfo;

import Part_02_03_OOP_Core.ch13.domain.userinfo.UserInfo;
import Part_02_03_OOP_Core.ch13.domain.userinfo.dao.UserInfoDao;
import Part_02_03_OOP_Core.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Part_02_03_OOP_Core.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("이순신");


        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.endsWith("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
