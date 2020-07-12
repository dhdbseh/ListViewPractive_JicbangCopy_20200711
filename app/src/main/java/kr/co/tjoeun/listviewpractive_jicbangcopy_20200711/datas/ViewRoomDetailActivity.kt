package kr.co.tjoeun.listviewpractive_jicbangcopy_20200711.datas

import android.content.Intent

class ViewRoomDetailActivity {

    override fun setupEvents(){

        dialBtn.setOnClickListener {

            //폰번은 010-1111-2222 인걸로 설정

            val myUri = Uri.parse("tel:010-1111-2222")
            val myIntent = Intent(Intent)

        }

    }

    override fun setValues() {

        val roomData = intent.getserializableExtra("room") as Room

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description

        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()

    }

}