package okmenue.okdme.com.kotlin.recycler_with_adapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.content_main.*
import okmenue.okdme.com.kotlin.R


class MainActivity : AppCompatActivity() , MainView{


    lateinit var numberAdapter : NumberAdapter
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var mainPresnter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresnter = MainPresenterImp(this)
        mainPresnter.setData()
    }

    override fun getDataSuccess(list: List<NumberModel>) {
        gridLayoutManager = GridLayoutManager(this , 3)
        numberAdapter = NumberAdapter(list , this)
        actMainRvNumberList.layoutManager = gridLayoutManager
        actMainRvNumberList.adapter = numberAdapter
    }

}
