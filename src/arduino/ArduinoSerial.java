package arduino;

import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortException;


public class ArduinoSerial {
    
public static void main (String[] args){
    SerialPort serialport = new SerialPort("/dev/ttyAMAo");
    
 try {
        //open serial port
        serialport.openPort();
        //set param
        serialport.setParams(9600, 0, 1, 0);
        
        String informacao = serialport.readString();
        System.out.println(informacao +"arduino funcionando");
        serialport.writeString("oi");
        serialport.closePort();
     } catch (SerialPortException ex) {
            System.out.println(ex);
        }
        
    }    
}