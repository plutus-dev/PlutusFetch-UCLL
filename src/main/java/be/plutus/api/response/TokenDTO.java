package be.plutus.api.response;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TokenDTO{

    private String token;
    private String application;
    private String device;
    private String expires;

    public TokenDTO(){
    }

    public String getToken(){
        return token;
    }

    public void setToken( String token ){
        this.token = token;
    }

    public String getApplication(){
        return application;
    }

    public void setApplication( String application ){
        this.application = application;
    }

    public String getDevice(){
        return device;
    }

    public void setDevice( String device ){
        this.device = device;
    }

    public String getExpires(){
        return expires;
    }

    @JsonFormat( pattern = "yyyy-MM-dd'T'HH:mm:ssZ" )
    public String getExpiresISO8601(){
        return expires;
    }

    public void setExpires( String expires ){
        this.expires = expires;
    }
}
