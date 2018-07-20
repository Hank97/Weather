package weather.hankdev.com.weather.Model

class OpenWeatherMap{
    var coord:Coord?=null
    var Weather:List<Weather>?=null
    var base:String?=null
    var main:Main?=null
    var wind:Wind?=null
    var rain:Rain?=null
    var clouds:Clouds?=null
    var dt:Int=0
    var sys:Sys?=null
    var id:Int=0
    var name:String?=null
    var cod:Int=0

    constructor(){}

    constructor(coord: Coord,weatherList:List<Weather>,base:String,main: Main,wind: Wind,rain: Rain,clouds: Clouds,dt:Int,name: String, cod:Int){
        this.coord = coord
        this.Weather = Weather
        this.base = base
        this.main = main
        this.wind = wind
        this.rain = rain
        this.clouds = clouds
        this.dt = dt
        this.sys = sys
        this.id = id
        this.name = name
        this.cod = cod
    }
}