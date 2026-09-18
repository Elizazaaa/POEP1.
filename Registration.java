/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartt1;

/**
 *
 * @author Student
 */
class Registration {

     String password;
     String username;
     String phoneNumber;
    
    public boolean checkUserName(String username){
        return username.contains("_")&& username.length()==8;
    }// end of the userName Method
    
    public boolean checkPassWordComplexity(String password){
        if(password.length() >=8 && 
                password.matches(".*[A-Z].*")&&
                password.matches(".*[a-z].*")&&
                password.matches(".*\\d.*")&&
                password.matches(".*[^a-zA-Z0-9].*")){
            return true;
        }else{
            return false;
        }
    } //end of check username method
    
    public boolean checkCellPhoneNumber(String phoneNumber){
        if(phoneNumber.matches(".*\\+27[0-9]{9}.*")&& 
               phoneNumber.matches(".*^0[0-9]{9}")){
            return true;
        }else{
            return false;
        }
    } //end of check cellphone number method
    
    public String registerUser(String username, 
            String password, 
            String phoneNumber){
        
        if(checkUserName(username)&&
                checkPassWordComplexity(password)&&
                checkCellPhoneNumber(phoneNumber)){
            
            this.username = username;
            this.password = password;
            this.phoneNumber = phoneNumber; 
            return"registration was a success";
        }else{
            return "registration was unsuccessful";
        }
        }
    
    public boolean registerStatus (String username,
            String password,
            String phoneNumber){
        return checkUserName(username)&&
                checkPassWordComplexity(password)&&
                checkCellPhoneNumber(phoneNumber);
    }
}//end of class
        
    

