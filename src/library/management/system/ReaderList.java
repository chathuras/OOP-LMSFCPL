/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.util.ArrayList;

/**
 *
 * @author chathura
 */
public class ReaderList extends ArrayList<Reader> {
    public void addReader(Reader reader) {
        this.add(reader);
    }
    
//    public ReaderList getReaders() {
//        return this;
//    }
}
