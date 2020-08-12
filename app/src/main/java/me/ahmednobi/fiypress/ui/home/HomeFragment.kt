package me.ahmednobi.fiypress.ui.home

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.home_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.utilities.CustomWebViewClient
import me.ahmednobi.fiypress.utilities.JSInterface
import me.ahmednobi.fiypress.utilities.init

class HomeFragment : Fragment() {


    private  val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
home_webview.init(this.requireContext())
        viewModel.homeUrl.observe(viewLifecycleOwner, Observer {
            home_webview.loadUrl(it)
        })
    }

}