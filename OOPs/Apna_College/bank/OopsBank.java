// package OOPs.Apna_College.bank; 
class Account {                     /**If we don't use any key word then it will asign as "default" then we can use it only in this file only  */
    public String name;             /**we can use from any where by using "public" keyword */
    protected String email;         /**By using "protected" it will use in this package and in another package it will use with help of new sub-class*/
    private String password;        /**by using "private"  keyword it will use only in this class , other class can not use without help of "getters" and "setters*/

    //getters & setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){   /**if we asign this "setPassword" as "private" then user cann't set any password and also cann't call from "main" class but we have to call this function from "getPassword" function */
        this.password = pass;
    }
}
public class OopsBank{  
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcde");
        account1.getPassword();
    }
}
