package ena.min.android.auction.view

import ena.min.android.auction.R
import ena.min.android.auction.viewmodel.HomeViewModel

class HomeFragment: AbsFragment<HomeViewModel>() {
    override val layoutResId: Int
        get() = R.layout.fragment_home
    override val viewModelClass: Class<HomeViewModel>
        get() = HomeViewModel::class.java

}