package com.saveurlife.goodnews.models

import io.realm.kotlin.types.RealmInstant
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class Member(): RealmObject {
    @PrimaryKey
    var memberId:Long = 0
    var phone: Long =0
    var birthDate:String = ""
    var name:String = ""
    var gender: String = ""
    var bloodType: String = ""
    var addInfo: String = ""
    var lastConnection: RealmInstant = RealmInstant.from(0,0)
    var lastUpdate: RealmInstant = RealmInstant.from(0,0)
    var location: Location? = null
    var familyId: Long = 0

    constructor(memberId: Long, phone: Long, birthDate: String, name: String, gender: String, bloodType: String, addInfo: String, lastConnection: RealmInstant, lastUpdate: RealmInstant, location: Location, familyId: Long) : this() {
        this.memberId = memberId
        this.phone = phone
        this.birthDate = birthDate
        this.name = name
        this.gender = gender
        this.bloodType = bloodType
        this.addInfo = addInfo
        this.lastConnection = lastConnection
        this.lastUpdate = lastUpdate
        this.location = location
        this.familyId = familyId
    }
}