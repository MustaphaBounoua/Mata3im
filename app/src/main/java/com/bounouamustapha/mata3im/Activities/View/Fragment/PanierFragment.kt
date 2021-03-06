package com.bounouamustapha.mata3im.Activities.View.Fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bounouamustapha.mata3im.Activities.Controller.DataController
import com.bounouamustapha.mata3im.Activities.Controller.Utils.OnPlatClickListner
import com.bounouamustapha.mata3im.Activities.Model.Plat
import com.bounouamustapha.mata3im.Activities.View.Adapter.CommandeAdapter
import com.bounouamustapha.mata3im.Activities.View.Adapter.PlatsAdapter
import com.bounouamustapha.mata3im.Activities.View.activity.PlatDetailActivity

import com.bounouamustapha.mata3im.R
import kotlinx.android.synthetic.main.fragment_menu_detail.view.*
import kotlinx.android.synthetic.main.fragment_panier.view.*


/**
 * A simple [Fragment] subclass.
 */
class PanierFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_panier, container, false)
        activity!!.setTitle("Le panier")


        v.listPlatPanier.adapter = CommandeAdapter(v.context,DataController().getCommande(),  object : OnPlatClickListner {
            override fun onItemClick(item: Plat) {
                val intent = Intent(v.context, PlatDetailActivity::class.java)
                intent.putExtra("plat", item)
                startActivity(intent)
            }
        })
        v.listPlatPanier.layoutManager = GridLayoutManager(v.context, 1) as RecyclerView.LayoutManager?


        return v
    }

}// Required empty public constructor
