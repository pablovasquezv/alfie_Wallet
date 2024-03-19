/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vásquezSoftwareSolutions.alfie_wallet;

/**
 *
 * @author Pablo
 */
public class Main {

    public static void main(String[] args) {
        //Creacion de instancias
        AlfieWallet wallet = new AlfieWallet();
        Usuario usuario1= new Usuario(1,"Juan", wallet);
        usuario1.getWallet().despositar(4000.0);
    }
}
