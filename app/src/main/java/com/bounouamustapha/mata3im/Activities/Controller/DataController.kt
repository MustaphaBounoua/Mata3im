package com.bounouamustapha.mata3im.Activities.Controller

import com.bounouamustapha.mata3im.Activities.Model.Restaurant
import com.bounouamustapha.mata3im.R

/**
 * Created by bounouamustapha on 4/1/18.
 */
class DataController {

    fun getRestaurants():List<Restaurant> {
        var list = mutableListOf<Restaurant>();
        var restaurant = Restaurant(
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                "test",
                "test"
        )
        var restaurant2 = Restaurant(
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                "test2",
                "test2"
        )
        for (i in 0..5) list.add(restaurant)
        for (i in 0..5) list.add(restaurant2)
        return  list
    }
}