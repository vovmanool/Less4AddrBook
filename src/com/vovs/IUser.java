package com.vovs;

public class IUser {

    private String uName;
    private String uEmail;
    public boolean isValidName(String uName){
        if (uName.length()>5) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isValidEmail(String uEmail){
        if ((uEmail.length()>6) &&(uEmail.indexOf(" ")<0) && (uEmail.indexOf("@")>0) && (uEmail.indexOf(".")>uEmail.indexOf("@")+1)) {
            return true;
        }else {
            return false;
        }
    }

    //@Override
    public boolean setName(String uName) {
        if(isValidName(uName)){
            this.uName = uName;
            return true;
        }  else{
            return false;
        }
    }



   // @Override
    public boolean setEmail(String uEmail) {
        if(isValidEmail(uEmail)){
            this.uEmail = uEmail;
            return true;
        }  else{
            return false;
        }
    }

   // @Override
    public String  getName() { return uName; }

   // @Override
    public String  getEmail() { return uEmail; }


}
