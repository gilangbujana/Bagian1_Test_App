package com.gilangbujana.bagian1testappnoviangilangbujana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_soal_dua.*
import kotlinx.android.synthetic.main.fragment_soal_dua.view.*
import java.util.*


class SoalSatuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.fragment_soal_satu, container, false)

        btnHasil.setOnClickListener {
            var arrayOfAngka = v.etDeretanAngka.text.toString().trim().split(",").map {
                it.toInt()
            }.toTypedArray()
            v.tvHasil.text = getAngkaTerbesarKedua(arrayOfAngka).toString()


        }


        return v
    }

    fun getAngkaTerbesarKedua(arrayOfAngka : Array<Int>) : Int {
        Arrays.sort(arrayOfAngka)
        if(arrayOfAngka.size<2)
            return -1
        else if(arrayOfAngka[arrayOfAngka.lastIndex] == arrayOfAngka[arrayOfAngka.lastIndex-1])
            return -1
        return arrayOfAngka[arrayOfAngka.lastIndex-1]
    }


}