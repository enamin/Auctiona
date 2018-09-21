package ena.min.android.auction.core

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import ena.min.android.auction.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
