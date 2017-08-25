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
public class LibraryManagementSystem {

    public static final Application application = new Application();
    public static final AddEditReader addReader = new AddEditReader();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = Database.getInstance();
        application.populateReadersTable(db.readerList);
        
        application.setVisible(true);
    }
    
//    public static AddEditReader getAddReaderWindow() {
//        return addReader;
//    }
//    
//    public static Application getApplicationWindow() {
//        return application;
//    }
}
