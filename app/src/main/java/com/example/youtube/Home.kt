package com.example.youtube

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Home : Fragment() {

    val data = ArrayList<ExploreList>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerview = view.findViewById<RecyclerView>(R.id.Recycler)
        recyclerview.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)

        // ArrayList of class ItemsViewModel

        data.add(ExploreList(R.drawable.img_3,"Love in the Air is a 13-episode (and 1 special episode) long lankorn (tv show) set in an architecture college where two first-year students end up finding the loves of their lives."))
        data.add(ExploreList(R.drawable.img_4,"The True Beauty drama is based on a long-running Webtoon that goes by the name “The Secret of Angel (True Beauty)”, penned by Yaongyi."))
        data.add(ExploreList(R.drawable.img_7,"Vincenzo (Korean: 빈센조; RR: Binsenjo) is a 2021 South Korean television series starring Song Joong-ki as the title character alongside Jeon Yeo-been, "))
        data.add(ExploreList(R.drawable.img_8,"Adapted from Heng Wen Xue's novel, “Lu Shao's New Wife in a Warm Marriage”, “Love in Time” is a 2020 romantic comedy drama directed by Chen Shi Yi"))
        data.add(ExploreList(R.drawable.img_9,"History is littered with the tales of the nine-tailed fox, a legendary creature who seduces the innocent in order to satisfy their craving for human flesh."))
        data.add(ExploreList(R.drawable.img_10 ,"The Penthouse: War in Life (Korean: 펜트하우스) is a South Korean television series starring Lee Ji-ah, Kim So-yeon, Eugene, Um Ki-joon, Yoon Jong-hoon, and ..."))
        data.add(ExploreList(R.drawable.img_11,"A spunky young woman, doing her best to make her dreams come true, Gu An Xin (Zhao Lu Si) never expected her life to be anything other than ordinary."))
        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(data,requireContext())
        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
        return view
    }




}