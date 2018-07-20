package weather.hankdev.com.weather.Common

import java.lang.reflect.Array.get
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


object Common{
    val API_KEY = "eab83f85b02e604459937d9d89532647"
    val API_LINK = "http://api.openweathermap.org/data/2.5/weather"

    fun apiRequest(lat:String, lng:String):String{
        var sb = StringBuilder(API_LINK)
        sb.append("?lat=${lat}&lon=${lng}&APPID=${API_KEY}&units=metric")
        return sb.toString()
    }

    fun unixTimeStampToDatetime(unixTimeStamp:Double):String{
        val dateFormat = SimpleDateFormat("HH:mm")
        val date = Date()
        date.time = unixTimeStamp.toLong()*1000
        return dateFormat.format(date)
    }

    fun getImage(icon:String):String{
        return "http//openweathermap.org/img/w/${icon}.png"
    }

    val dateNow:String
        get(){
            val dateFormat = SimpleDateFormat("dd MM yyyy HH:mm")
            val date = Date()
            return dateFormat.format(date)
        }


}