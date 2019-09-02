/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;



/**
 *
 * @author pi
 */
public class Mapa extends MapView {
    
    private Map map;
    public Mapa(String nName){
        JFrame frame = new JFrame(nName);
        
        setOnMapReadyHandler((MapStatus status) -> {
            if(status== MapStatus.MAP_STATUS_OK){
                
                map = getMap();
                
                MapOptions mapOptions = new MapOptions();
                MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                mapOptions.setMapTypeControlOptions(controlOptions);
                
                map.setOptions(mapOptions);
                map.setCenter(new LatLng(-1.45502,-48.5024));
                map.setZoom(11.0);
                
                Marker mark = new Marker(map);
                mark.setPosition(map.getCenter());
                
                
                
            }
        });
        
        
        frame.add(this,BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setVisible(true);
        
    
}   
 public static void main(String[] args) {
     
     
  Mapa temp = new Mapa("Teste Mapa");   
     
 }
}
 


