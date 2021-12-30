package id.widiastuti.ratna.projectuas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Asteroid(val id: Long, val codename: String, val closeApproachDate: String,
                    val absoluteMagnitude: Double, val estimatedDiameter: Double,
                    val relativeVelocity: Double, val distanceFromEarth: Double,
                    val isPotentiallyHazardous: Boolean) : Parcelable
