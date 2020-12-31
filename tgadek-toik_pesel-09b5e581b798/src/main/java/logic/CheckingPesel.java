package logic;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CheckingPesel {


    static public String[] itscorectPesel() throws IOException {
        String fName = "C:\\Users\\LENOVO\\Downloads\\sudocu.csv";
        String thisLine;
        int count = 0;
        FileInputStream fis = new FileInputStream(fName);
        DataInputStream myInput = new DataInputStream(fis);
        List<String[]> lines = new ArrayList<String[]>();
        while ((thisLine = myInput.readLine()) != null) {
            lines.add(thisLine.split(","));
        }
        String[][] sudocuBoard = new String[lines.size()][0];



        final int SIZE_OF_SUDOCU = 9;




        Set<String> numbersLoader_W = new LinkedHashSet<>();
        Set<String> numbersLoader_H = new LinkedHashSet<>();
        System.out.print(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

        for(int i = 1 ; i <=SIZE_OF_SUDOCU;i++){
            for(int k = 1 ; k <= SIZE_OF_SUDOCU;k++){
                numbersLoader_W.add(sudocuBoard[i][k]);
                numbersLoader_H.add(sudocuBoard[k][i]);
            }
            if(numbersLoader_H.size()>9) return (String[]) numbersLoader_H.toArray();
            if(numbersLoader_W.size()>9) return (String[]) numbersLoader_W.toArray();
                   if (numbersLoader_W.size()>9);

        }

        return null;
    }
}
