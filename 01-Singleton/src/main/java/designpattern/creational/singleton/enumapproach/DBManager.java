/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package designpattern.creational.singleton.enumapproach;

/**
 *
 * @author KHRSM
 */
public enum DBManager {
    INSTANCE;
    public void establish(){
        System.out.println("Connection to DB Manager Established!");
    }
}
