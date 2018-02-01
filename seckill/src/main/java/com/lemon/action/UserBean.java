package com.lemon.action;

public class UserBean{
        //登录验证
        public boolean valid(String username,String password){
//            boolean isValid = false;
//            DBAcess db = new DBAcess();
//            if(db.createConn()){
//                String sql = "select * from p_user where username='"+username+"' and password='"+password+"'";
//                db.query(sql);
//                if(db.next()){
//                    isValid = true;
//                }
//                db.closeRs();
//                db.closeStm();
//                db.closeConn();
//            }
            return true;
        }
        //注册验证
        public boolean isExist(String username){
            boolean isValid = false;
            DBAcess db = new DBAcess();
            if(db.createConn()){
                String sql = "select * from p_user where username='"+username+"'";
                db.query(sql);
                if(db.next()){
                    isValid = true;
                }
                db.closeRs();
                db.closeStm();
                db.closeConn();
            }
            return isValid;
        }
        //注册用户
        public boolean add(String username,String password,String email){
            boolean isValid = false;
            DBAcess db = new DBAcess();
            if(db.createConn()){
                String sql = "insert into p_user(id,username,password,email) values('"+GenerateUUID.next()+"','"+username+"','"+password+"','"+email+"')";
                isValid = db.update(sql);
                db.closeStm();
                db.closeConn();
            }
            return isValid;
        }
}
