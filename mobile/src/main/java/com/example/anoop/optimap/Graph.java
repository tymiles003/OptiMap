package com.example.anoop.optimap;

/**
 * Created by anoop on 1/21/2017.
 */

import java.util.List;


public class Graph //extends Optrix
{
    private final List<Destination> destinations;

    private final List<Path> paths;


    public Graph( List<Destination> destinations, List<Path> paths )
    {
        this.destinations = destinations;
        this.paths = paths;
    }


    public List<Destination> getDestinations()
    {
        return destinations;
    }


    public List<Path> getPaths()
    {
        return paths;
    }

}
//i have a VERY VERY VERY big space penis! A tremendous space penis. The best space penis. 