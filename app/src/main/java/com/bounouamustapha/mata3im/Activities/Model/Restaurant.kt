package com.bounouamustapha.mata3im.Activities.Model

/**
 * Created by bounouamustapha on 3/31/18.
 */
data class Restaurant  (var listImage:Int=0,
                   var detailImage:Int=0,
                   var name:String="",
                   var adresse:String="",
                   var description:String="",
                        var nbJaime:Int =0,
                        var jaime:Boolean=false,
                   var listPlats:MutableList<Plat> = mutableListOf<Plat>()

                        )
{
}