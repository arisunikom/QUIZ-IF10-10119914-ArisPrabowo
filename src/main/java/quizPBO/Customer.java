/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizPBO;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Date;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */

public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
       this.email = email;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }
    @Override
    public String currentTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        return formatter.format(date);  
    }
}
