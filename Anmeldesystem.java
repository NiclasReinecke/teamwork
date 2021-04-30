import java.util.List;

import jdk.vm.ci.common.InitTimer;

import java.util.ArrayList;
import java.util.*;

public class Anmeldesystem {
    private static List <String> studierende = new ArrayList <> ();
    private static List <String> tutoren = new ArrayList <> ();

    private static int maxCapacity;
    private static int minCapacity;

    private static int groupsNeeded () {
        
    }

    private static  void init () {
        maxCapacity = 6;
        minCapacity = 4;
        studierende.add("Max Mustermann");
        studierende.add("Elon Musk");
        studierende.add("Victor Hugo");
        studierende.add("Fjodor Dosto");
        studierende.add("Leo Tolstoj");
        studierende.add("Frank Becker");
        studierende.add("Albert Camus");

        tutoren.add(" Jens ");
        tutoren.add(" Niklas ");
        tutoren.add(" Samuel");
    }
    
    public static void main(String [] args){
        init();
        
    }
    

}