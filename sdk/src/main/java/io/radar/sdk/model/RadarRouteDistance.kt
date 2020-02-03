package io.radar.sdk.model

import org.json.JSONObject

/**
 * Represents the distance of a route.
 */
class RadarRouteDistance(
    /**
     * The distance in feet (for imperial units) or meters (for metric units).
     */
    val value: Double,

    /**
     * A display string for the distance.
     */
    val text: String
) {

    internal companion object {
        private const val FIELD_VALUE = "value"
        private const val FIELD_TEXT = "text"

        fun fromJson(obj: JSONObject): RadarRouteDistance {
            val value = obj.optDouble(FIELD_VALUE)
            val text = obj.optString(FIELD_TEXT)

            return RadarRouteDistance(value, text)
        }
    }
}