package com.example.anoop.optimap;

import java.util.ArrayList;


/**
 * Created by prashanthkoushik on 1/21/17.
 */

public class Test extends MapsActivity
{
    public ArrayList<Destination> dests;

    public ArrayList<Path> paths;

    public ArrayList<Destination> optrixExecution( ArrayList<Destination> a)
    {
        dests = new ArrayList<Destination>();
        dests = a;
        paths = new ArrayList<Path>();
        paths = createPaths(dests);
        Graph graph = new Graph( dests, paths );
        Optrix opalgorithm = new Optrix( graph );
        return opalgorithm.execute();
    }

    public ArrayList<Path> createPaths(ArrayList<Destination> dests) {
        ArrayList<Path> path = new ArrayList<Path>();
        for (Destination d : dests)
        {
            Destination curr = getCurrDest();
            //String time = getTime(curr, d);
            //Path p = new Path(curr, d, Long.valueOf((String)time.longValue() );
            //path.add(p);
        }
        return path;
    }
}
