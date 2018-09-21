package ena.min.android.auction.view

import ena.min.android.auction.R
import ena.min.android.auction.viewmodel.HomeViewModel
import ena.min.android.auction.viewmodel.ProfileViewModel

class ProfileFragment: AbsFragment<ProfileViewModel>() {
    override val layoutResId: Int
        get() = R.layout.fragment_profile
    override val viewModelClass: Class<ProfileViewModel>
        get() = ProfileViewModel::class.java

}