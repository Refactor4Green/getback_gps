/**
 * Class with several methods useful for navigation.
 *
 * Copyright (C) 2012-2013 Dieter Adriaenssens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @package org.ruleant.ariadne
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
package org.ruleant.ariadne;

import android.content.Context;

/**
 * Class with several methods useful for navigation.
 *
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
public class Navigator {
    /**
     * SharedPreferences location for StoredDestination.
     */
    public static final String PREFS_STORE_DEST = "stored_destination";

    /**
     * SharedPreferences location for last known good location.
     */
    public static final String PREFS_LAST_LOC = "last_location";

    /**
     * Current context.
     */
    private Context mContext = null;

    /**
     * Current Location.
     */
    private AriadneLocation mCurrentLocation = null;

    /**
     * Previous Location.
     */
    private AriadneLocation mPreviousLocation = null;

    /**
     * Last known good location.
     */
    private StoredLocation mLastLocation = null;

    /**
     * Current destination.
     */
    private StoredDestination mDestination;

    /**
     * Calculate distance to current destination.
     *
     * @return distance in meters
     */
    public float getDistance() {
        return 0;
    }

    /**
     * Calculate absolute direction to current destination.
     *
     * @return direction in ° relative to the North
     */
    public double getAbsoluteDirection() {
        return 0;
    }

    /**
     * Calculate direction to current destination,
     * relative to current bearing.
     *
     * @return direction in ° relative to current bearing
     */
    public double getRelativeDirection() {
        return 0;
    }

    /**
     * Calculate most accurate current speed,
     * depending on available sensors and data.
     *
     * @return current speed in m/s
     */
    public float getCurrentSpeed() {
        return 0;
    }

    /**
     * Calculate most accurate current bearing,
     * depending on available sensors and data.
     *
     * @return current bearing in ° relative to the North
     */
    public float getCurrentBearing() {
        return 0;
    }
}
