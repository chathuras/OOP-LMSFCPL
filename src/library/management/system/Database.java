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
public class Database {
    private ReaderList readerList;
//    private static Database dataRetriever = new Database();

//    public Database getInstance() {
//        
//    }
    public static ReaderList getReaders() {
        String readerData[][] = {
            {"TillyPotts@gustr.com", "Ohniequ1", "079 4846 8177", "Tilly", "Potts", "31 Hudson St", "DULL", "PH15 9FR", "MB 83 29 15 D"},
            {"PatrickWilliamson@gustr.com", "ceepiun0zaY", "079 3995 1729", "Patrick", "Williamson", "9 Oxford Rd", "WORTHINGTON", "LE65 2EN", "OS 43 47 65"},
            {"TeganPatterson@armyspy.com", "Aa4Oteigai", "070 0934 3752", "Tegan", "Patterson", "99 Scotswood Road", "HOLWELL", "OX18 4LL", "XM 79 77 60 B"},
            {"GracieConnor@rhyta.com", "eeree7OTe", "079 2334 0611", "Gracie", "Connor", "50 London Road", "COLNE", "PE17 7PZ", "TE 47 86 12 C"},
            {"HarryShepherd@jourrapide.com", "ueheeK9Th", "079 7953 3457", "Harry", "Shepherd", "88 Walwyn Rd", "CHAPELHALL", "ML6 0XG", "RW 05 77 19 A"},
            {"AmelieRichardson@einrot.com", "jiu1ieng8M", "079 1075 5108", "Amelie", "Richardson", "20 Crown Street", "LONDON", "SW3 6YW", "BP 67 03 67 A"},
            {"KyleMorgan@fleckens.hu", "lemiej3EiYa", "079 6785 6846", "Kyle", "Morgan", "94 Ploughley Rd", "TIRLEY", "GL19 3RF", "MH 90 53 64 B"},
            {"LouiseSummers@armyspy.com", "rohs4MoNai", "070 2672 9616", "Louise", "Summers", "3 Canterbury Road", "URCHANY", "IV12 2PF", "SC 29 25 81 D"},
            {"JoelPearson@gustr.com", "augh1iVei", "070 6273 7082", "Joel", "Pearson", "85 South Western Terrace", "MILTON CLEVEDON", "BA4 7QQ", "YE 54 23 73 B"},
            {"LewisFord@rhyta.com", "ogoh3Ui9we6", "070 1135 0324", "Lewis", "Ford", "24 Temple Way", "WINTERBOURNE ABBAS", "DT2 5BA", "NN 19 19 65 C"}};

//        ReaderList readerList = new ReaderList();

        for (String[] row : readerData) {
            Reader reader = new Reader(row[0], row[1]);
            reader.setMobile(row[2]);
            reader.setFirstName(row[3]);
            reader.setLastName(row[4]);
            reader.setStreet(row[5]);
            reader.setCity(row[6]);
            reader.setPostalCode(row[7]);
            reader.setNid(row[8]);
            
            readerList.add(reader);
        }

        return readerList;
    }

    public static void addReader(Reader reader) {
        
    }
}
