package com.bonorenof.zero.lib.interfaces;

/**
 * Created by bonorenof on 22/12/13.
 */
public interface TileInterface {

    public Object getElement();

    public MappingCollectionInterface getNeighbors();

    public MappingInterface getPostition();

    public String toString();

    public Boolean equal(TileInterface tile);

}
