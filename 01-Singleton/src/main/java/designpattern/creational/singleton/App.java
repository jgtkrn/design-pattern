/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package designpattern.creational.singleton;

import designpattern.creational.singleton.enumapproach.DBManager;
import designpattern.creational.singleton.lazyload.CacheManager;

/**
 *
 * @author KHRSM
 */
public class App {

    public static void main(String[] args) {
//        Lazy Load singleton Implementation
        CacheManager.getInstance().establish();
        
//        Class would not able to create instance 
//        CacheManager cm = new CacheManager();


//      ENUM singleton implementation
//      In ENUM implementation we able to create instace multiple times
//      but still got the same object
        DBManager firstDBManager = DBManager.INSTANCE;
        DBManager secondDBManager = DBManager.INSTANCE;
        
//      we can prove it by comparing between instances and check the hashcode
        System.out.println("instance comparison: " + Boolean.toString(firstDBManager == secondDBManager));
        System.out.println("firstDBManager hashCode: " + firstDBManager.hashCode());
        System.out.println("secondDBManager hashCode: " + secondDBManager.hashCode());
        firstDBManager.establish();
        secondDBManager.establish();
    }
}
