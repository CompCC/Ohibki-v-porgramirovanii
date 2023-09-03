package Lection3;

import java.io.IOException;

public class Save_Exception extends IOException {
    public Save_Exception(String message, Exception e){
        super(message, e);
    }
}
