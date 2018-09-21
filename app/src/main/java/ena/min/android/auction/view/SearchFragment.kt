package ena.min.android.auction.view

import ena.min.android.auction.R
import ena.min.android.auction.viewmodel.HomeViewModel
import ena.min.android.auction.viewmodel.SearchViewModel

class SearchFragment: AbsFragment<SearchViewModel>() {
    override val layoutResId: Int
        get() = R.layout.fragment_search
    override val viewModelClass: Class<SearchViewModel>
        get() = SearchViewModel::class.java

}