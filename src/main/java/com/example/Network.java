/*
* File: Network.java
* Author: Dobány Norbert
* Copyright: 2024, Dobány Norbert
* Group: SZOFT II/1/N
* Date: 2024.10.03
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL
*/

package com.example;

public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println(networkName + " - Csatlakoztatva!");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakoztatva!");
    }
    
}
