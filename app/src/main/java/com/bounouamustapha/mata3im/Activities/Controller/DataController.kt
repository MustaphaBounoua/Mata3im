package com.bounouamustapha.mata3im.Activities.Controller

import com.bounouamustapha.mata3im.Activities.Model.Commande
import com.bounouamustapha.mata3im.Activities.Model.Plat
import com.bounouamustapha.mata3im.Activities.Model.PlatBinaire
import com.bounouamustapha.mata3im.Activities.Model.Restaurant
import com.bounouamustapha.mata3im.R

/**
 * Created by bounouamustapha on 4/1/18.
 */
class DataController {

    fun getCommande():List<Commande>{
        var list3 = mutableListOf<Int>()
        var list = mutableListOf<Commande>()
        var plat= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Entré",22.0,false,false,true,true,false,true)

        var commande :Commande = Commande(plat,2,23.0,getRestaurants()[0])
        list.add(commande)
        list.add(commande)
        list.add(commande)
        return list
    }


    fun getRestaurants():List<Restaurant> {
        var list = mutableListOf<Restaurant>()
        var list2 = mutableListOf<Plat>()
        var list3 = mutableListOf<Int>()
        var list33= mutableListOf<PlatBinaire>()
        list3.add(R.drawable.barcelone_detail)
        list3.add(R.drawable.paris_list)
        list3.add(R.drawable.bar)

        var plat= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Entré",22.0,false,false,true,true,false,true)
        var plat2= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Dessert",22.0,true,false,true,true,false,false)
        var platt= Plat(R.drawable.paris_list,list3,"jus","trés bon bon ",false,
                33,"Plat",22.0,true,false,true,true,false,true)

        var platBinaire=PlatBinaire(
                plat,platt,"aaaa",43.0,false,false
        )
        list33.add(platBinaire)
        list33.add(platBinaire)

        var plat3= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Entré",22.0,true,true,true,true,false,false)


        var plat4= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Entré",22.0,true,true,false,true,false,false)

        var plat5= Plat(R.drawable.istanbul_list,list3,"ma9aroon","trés bon bon ",false,
                33,"Entré",22.0,true,true,false,false,false,false)

        list2.add(plat)
        list2.add(plat2)
        list2.add(plat3)
        list2.add(plat4)
        list2.add(plat5)

        var restaurant = Restaurant(
                R.drawable.paris_list,
                list3,
                "rachid",
                "bouraoui","07789303938" ,"a@@.com",
                "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj"+
                "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj" +
                "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj" +
                "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj"
                ,22,32,44,false,list2,"https://web.facebook.com/adel.bounoua.3",
                "https://web.facebook.com/adel.bounoua.3","https://web.facebook.com/adel.bounoua.3",
                36.7197144,3.1450452,
                list33
        )

        var restaurant2 = Restaurant(
                R.drawable.paris_list,
                list3,
                "ramdan",
                "smar","07789303938" ,"a@@.com",
                "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj"+
                        "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj" +
                        "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj" +
                        "hfdjhfdjhfjdhfjdhfjhdfjhdjhfdhfjhdjfhjdhfjdhfjhdj"
                ,22,32,44,false,list2,"https://web.facebook.com/adel.bounoua.3",
                "https://web.facebook.com/adel.bounoua.3","https://web.facebook.com/adel.bounoua.3",
                36.7197144,3.1450452,
                list33
        )


        for (i in 0..5) list.add(restaurant)
        for (i in 0..5) list.add(restaurant2)
        return  list
    }
}