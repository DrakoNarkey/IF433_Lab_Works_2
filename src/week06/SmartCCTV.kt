package oop_140599_NathanaelEzraBudiman.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' nonaktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video.")
    }
}