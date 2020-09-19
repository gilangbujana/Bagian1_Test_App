package com.gilangbujana.bagian1testappnoviangilangbujana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_soal_dua.view.*
import java.util.*

class SoalDuaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var viewS = inflater.inflate(R.layout.fragment_soal_dua, container, false)

        viewS.btnHasil.setOnClickListener {
            var arrayOfAngka = viewS.etDeretanAngka.text.toString().trim().split(",").map {
                it.toInt()
            }.toTypedArray()
            if(isUrut(arrayOfAngka))
                viewS.tvHasil.text = "true"
            else
                viewS.tvHasil.text = "false"

        }
        return viewS
    }

    fun isUrut(arrayOfAngka : Array<Int>) : Boolean{
        Arrays.sort(arrayOfAngka)
        var count = 1
        for (angka in arrayOfAngka){
            if(angka!=count) return false
            count++
        }
        return true
    }


}