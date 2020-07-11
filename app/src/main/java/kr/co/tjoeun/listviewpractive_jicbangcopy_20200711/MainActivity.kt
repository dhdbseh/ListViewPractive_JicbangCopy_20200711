package kr.co.tjoeun.listviewpractive_jicbangcopy_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listviewpractive_jicbangcopy_20200711.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupEvents()
//        setValues()
    }

    override fun setValues() {

        mRoomList.add(Room(26700, "서울시 은평구", 4, "서울시 은평구의 4층 방입니다."))
        mRoomList.add(Room(34600, "서울시 금천구", -2, "서울시 금천구의 지하 2층 방입니다."))
        mRoomList.add(Room(9700, "서울시 도봉구", 0, "물 잘나와요."))
        mRoomList.add(Room(22790, "서울시 동대문구", -1, "방이 꺠끗해요."))
        mRoomList.add(Room(20700, "서울시 서대문구", 12, "방 좋아요."))
        mRoomList.add(Room(56700, "서울시 송파구", 2, "뷰가 좋아요."))
        mRoomList.add(Room(17700, "서울시 양천구", 1, "복도가 넓어요."))
        mRoomList.add(Room(60700, "서울시 종로구", 7, "이웃이 좋아요."))
        mRoomList.add(Room(8700, "서울시 강서구", 8, "서울시 강서구의 8층 방입니다."))
    }

}