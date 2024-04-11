package Library_Program.Library;

import java.util.ArrayList;

import Library_Program.Library.Library.Shelves;

public abstract class Library {
    private int cabinets;
    private int numLockedCabinet;
    private String lockedCabinetPass;

    private ArrayList<Shelves> shelves = new ArrayList<>();

    public Library(ArrayList shelves, int cabinets, int numLockedCabinet, String lockedCabinetPass) {
        this.cabinets = cabinets;
        this.numLockedCabinet = numLockedCabinet;
        this.lockedCabinetPass = lockedCabinetPass;
    }

    // get number of shelves
    public abstract double getShelves();

    //get number of total items
    public abstract double getCount();

    

}
