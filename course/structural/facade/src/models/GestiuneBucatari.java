package models;

import java.util.ArrayList;
import java.util.List;

public class GestiuneBucatari {

    private List<Bucatar>  listaBucatari = new ArrayList<Bucatar>();

    public void addBucatar(Bucatar bucatar){
        listaBucatari.add(bucatar);
    }

    public Bucatar getBucatar(int id){
        return listaBucatari.get(id);
    }

    public int getNrBucatari(){
        return listaBucatari.size();
    }
}
