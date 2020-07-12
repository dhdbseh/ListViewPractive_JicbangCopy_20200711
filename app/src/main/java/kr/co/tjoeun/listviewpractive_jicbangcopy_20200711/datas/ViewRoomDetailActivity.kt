package kr.co.tjoeun.listviewpractive_jicbangcopy_20200711.datas

class ViewRoomDetailActivity {

    override fun setValues() {

        val roomData = intent.getserializableExtra("room") as Room

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description

        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()

    }

}