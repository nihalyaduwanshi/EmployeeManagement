/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.pojo;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 *
 * @author DELL
 */
public class OTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnirestException {
        // TODO code application logic here
        Unirest.setTimeouts(0,0);
        String url = "https://2factor.in/API/V1/6e8645cf-abbc-11ed-813b-0200cd936042/SMS/6261122694/9999/OTP1";
        
	HttpResponse<String> response = Unirest.get(url).asString();
        

       String reply = response.getBody();


    }
    
}
