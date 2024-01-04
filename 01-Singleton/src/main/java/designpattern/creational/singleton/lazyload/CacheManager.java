/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.singleton.lazyload;

/**
 *
 * @author KHRSM
 */
public class CacheManager {
    private static volatile CacheManager cacheObject = null;
    private CacheManager() {}
    public static CacheManager getInstance() {
        if(cacheObject == null){
            synchronized(CacheManager.class) {
                if(cacheObject == null) {
                    CacheManager.cacheObject = new CacheManager();
                }
            }
        }
        return cacheObject;
    }
    
    public void establish() {
        System.out.println("Connection to Cache Manager Established!");
    }
}
