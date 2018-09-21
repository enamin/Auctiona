package ena.min.android.auction.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import ena.min.android.auction.R
import ena.min.android.auction.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: AbsFragment<MainViewModel>() {
    override val layoutResId: Int
        get() = R.layout.fragment_main

    override val viewModelClass: Class<MainViewModel>
        get() = MainViewModel::class.java

    override fun onViewModelCreated(savedInstanceState: Bundle?) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        bnvMain.setOnNavigationItemSelectedListener {
//            when(it.itemId) {
//                R.id.home -> onHomeTabSelected()
//                R.id.search -> onSearchTabSelected()
//                R.id.profile -> onProfileTabSelected()
//            }
//
//             true
//        }

//        val navController = Navigation.findNavController(mainFragmentDefaultNavHost.view!!)

        //(mainFragmentDefaultNavHost as NavHostFragment).navController



        val navController = Navigation.findNavController(mainFragmentNavControllerProvider)
        NavigationUI.setupWithNavController(bnvMain, navController)
//        bnvMain.selectedItemId = R.id.home

    }

    private fun onHomeTabSelected() {
        Log.d("aminamin", "onHomeTabSelected")
    }

    private fun onSearchTabSelected() {

    }

    private fun onProfileTabSelected() {

    }
}