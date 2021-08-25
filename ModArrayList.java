package com.anjanacodes;

import java.util.ArrayList;

public class ModArrayList<MyData> extends ArrayList<MyData> {

    public MyData getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size();
            return this.get(validIndex);
    }
}
