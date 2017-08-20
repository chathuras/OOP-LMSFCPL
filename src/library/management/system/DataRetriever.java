/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author chathura
 */
public class DataRetriever {
//    private static DataRetriever dataRetriever = new DataRetriever();
    
//    public DataRetriever getInstance() {
//        
//    }
    
    public static ReaderList getReaders() {
        
        Reader reader = new Reader("a", "b");
        
        
        reader.setFirstName("a");
        reader.setLastName("a");
        reader.setMobile("a");
        reader.setAddress1("a");
        reader.setAddress2("a");
        reader.setCity("a");
        reader.setProvince("a");
        reader.setNid("a");
        
        
        ReaderList readerList = new ReaderList();
        
        readerList.add(reader);
        
        return readerList;
    }
}
