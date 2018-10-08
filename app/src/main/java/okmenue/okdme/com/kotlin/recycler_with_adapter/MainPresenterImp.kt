package okmenue.okdme.com.kotlin.recycler_with_adapter

import okmenue.okdme.com.kotlin.R

class MainPresenterImp(val view: MainView) : MainPresenter {

    var arrayList: ArrayList<NumberModel> = arrayListOf()

    override fun setData() {
        arrayList.add(NumberModel(3 , R.color.color1))
        arrayList.add(NumberModel(46 , R.color.color2))
        arrayList.add(NumberModel(7 , R.color.color3))
        arrayList.add(NumberModel(8 , R.color.color4))
        arrayList.add(NumberModel(1 , R.color.color5))
        arrayList.add(NumberModel(34 , R.color.color6))
        arrayList.add(NumberModel(9 , R.color.color7))
        arrayList.add(NumberModel(6 , R.color.color8))
        arrayList.add(NumberModel(9 , R.color.color9))
        arrayList.add(NumberModel(12 , R.color.color10))
        arrayList.add(NumberModel(9 , R.color.color11))
        arrayList.add(NumberModel(95 , R.color.color12))
        arrayList.add(NumberModel(2 , R.color.color13))
        arrayList.add(NumberModel(34 , R.color.color14))
        arrayList.add(NumberModel(30 , R.color.color15))

        //sort list
        val sortedList = arrayList.sortedBy { it.number }

        view.getDataSuccess(sortedList)
    }


}