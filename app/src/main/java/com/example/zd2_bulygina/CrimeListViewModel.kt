package com.example.zd2_bulygina

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel() {

    val crimes = mutableListOf<Crime>()
    var i:Int=1
    val dt = Date()
    init{
        while (i<=100){
            val criminal=Crime()
            criminal.title="Crime #$i"
            criminal.date=dt
            criminal.isSolved=i%2==0
            criminal.requiresPolice=i%2
            crimes.add(criminal)
            i++
        }
    }
}
