package com.common.mail;

import java.sql.*;
import java.math.*;
import java.util.*;
import com.base.util.Tools;
import com.base.value.*;
import com.common.value.*;
import com.common.service.CommonManager;
import com.common.web.action.CommonActionSupport;

public class SMS extends CommonActionSupport
{
    private static String dbuser="schuser2";        //�n�J�b��
    private static String dbpsd="mark2aixujxu";           //�n�J�K�X
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";  //�X�ʵ{��
    private static String dburl="jdbc:sqlserver://140.129.140.215:1433;DatabaseName=sms" ;    //�s�u
 

    
    
 //����²�T
  public static void FetSendMsg(String phone,String msg) {  	
     try{        
	      Class.forName(driver);
	      Connection conn = DriverManager.getConnection(dburl,dbuser,dbpsd);
    	  String sql="insert into SMSRequest(serial,target,corp_id,dr_flag,submit_date,deliver_date,language,message)values(?,?,?,?,?,?,?,?)";
		  PreparedStatement smt= conn.prepareStatement(sql);
		  String msgID=  Tools.md5( String.valueOf(Tools.getUniqueId()) + String.valueOf(Math.random()) );
		  smt.setString(1, msgID);
		  smt.setString(2, phone);		  
		  smt.setString(3, "01900200024172200123");
		  smt.setString(4, "0");
		  smt.setString(5, "20080101010100");		
		  smt.setString(6, "20080101010100");
		  smt.setString(7, "C");
		  smt.setString(8, msg);
		  smt.execute();
	      conn.close(); 
	      System.out.println("²�T�ǰe=>phone="+phone+"/msg="+msg);
     }catch(Exception e){    	    
            System.out.println("²�T�ǰe����!");	 
            System.out.println(e.toString());	 
      }	      
  } 
  
  /**�j��70�r����*/
  public void sendShortMessage(String cellphone,String msg){
      try{ 
                  int len=msg.length();
                  int mylen=len;
                   //�p�G�j��70�r
                   if(len>70){
                   	int p=1;  //�@�ݤ��X��
                   	do{
                   	  len = len-70;
                   	  p++;
                       }while(len > 70);
                         System.out.println("p="+p);
                         
                         //����H�e
                           for(int s=0;s<p;s++){
                           	String msg_cut="";                           	
                           	if(p==s+1){                              		                        	   
                           	    msg_cut=msg.substring(s*70,mylen);	                       	    
                           	}else{
                           	msg_cut=msg.substring(s * 70 , (s+1) * 70);                           	  
                                }                           	
                           	//System.out.println(s+":="+msg_cut);                                
                           	FetSendMsg(cellphone,XString(msg_cut));   //�H�H
                          }                         
                         //����H�e
                  }
                   //�p�G�j��70�r
                   else{
                	   FetSendMsg(cellphone,XString(msg));   //�H�H
                       //System.out.println(msg);
                   }

	  }catch(Exception e){
               System.out.println("split() ���ѡI");
          }  	
  }   
  /**�j��70�r����*/  
  
  /**�B�z�S��r��*/
  public String XString(String txt){ 
 	 String xs="";
 	 try {
 		 String c=String.valueOf('"');
 		  xs=txt.replaceAll("0","O").replaceAll(c, "'").replaceAll("&", " and ");
 		   if(txt.length()==0) {			   
 			   xs="²�T���e�ť�!";  
 		   }
 	 }catch (Exception e)  {      
 	      System.out.println("XString() fail! ");
 	 }
 	 return xs;
  }
  /**�B�z�S��r��*/ 
  
  public static void main(String[] args) {
  	System.out.println("sms...");
  	
  }
  
  

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            