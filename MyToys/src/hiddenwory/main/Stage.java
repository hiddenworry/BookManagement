/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenwory.main;

import hiddenwory.util.MyToys;

/**
 *
 * @author ADMIN
 */
public class Stage {
    public static void main(String[] args) {
        int side = MyToys.getAnInteger("Vui long nhập: ");
        System.out.println("side: "+ side);
    }
}
