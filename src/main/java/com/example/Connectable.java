/*
* File: Connectable.java
* Author: Dobány Norbert
* Copyright: 2024, Dobány Norbert
* Group: SZOFT II/1/N
* Date: 2024.10.03
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL
*/

package com.example;

public interface Connectable {
    void connectToNetwork(String networkName);
    void disconnectFromNetwork();
}
