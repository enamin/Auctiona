package ena.min.android.auction.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ena.min.android.auction.viewmodel.AbsViewModel
import kotlin.properties.Delegates

abstract class AbsFragment<T : AbsViewModel> : Fragment() {
    abstract val layoutResId: Int
    abstract val viewModelClass: Class<T>
    var viewModel: T by Delegates.notNull()
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.viewModel = ViewModelProviders.of(this).get(viewModelClass)
        onViewModelCreated(savedInstanceState)
    }

    open fun onViewModelCreated(savedInstanceState: Bundle?) {

    }
}