package kr.co.tjoeun.listviewpractive_jicbangcopy_20200711.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.listviewpractive_jicbangcopy_20200711.datas.Room

class RoomAdapter(val  mContext:Context, val mList:List<Room>(mContext, resId, mList) : ArrayAdapter<Room>() {

    val inf = LayoutInflate.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    var tempRow = convertView
    if (tempRow == null) {
        tempRow = inf.inflate(R.layout.room_list_item, null)
    }

    val row = tempRow!!

}