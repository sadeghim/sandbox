/* *************************************************************************
 *  Copyright (C) 2010 Atlas of Living Australia
 *  All Rights Reserved.
 * 
 *  The contents of this file are subject to the Mozilla Public
 *  License Version 1.1 (the "License"); you may not use this file
 *  except in compliance with the License. You may obtain a copy of
 *  the License at http://www.mozilla.org/MPL/
 * 
 *  Software distributed under the License is distributed on an "AS
 *  IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  rights and limitations under the License.
 ***************************************************************************/

package org.ala.biocache.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model object to store a list of occurrence coordinates
 *
 * @author "Nick dos Remedios <Nick.dosRemedios@csiro.au>"
 */
public class OccurrencePoint {
    protected Long count = -1L;
    protected PointType type;
    protected List<Float> coordinates = new ArrayList<Float>(); // long, lat order

    public OccurrencePoint() {}

    public OccurrencePoint(PointType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Points{" + "count=" + count + "type=" + type + '}';
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coords) {
        this.coordinates = coords;
    }

    public PointType getType() {
        return type;
    }

    public void setType(PointType type) {
        this.type = type;
    }
}
