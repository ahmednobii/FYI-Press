package me.ahmednobi.fiypress.ui.economy

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.countries_fragment.*
import kotlinx.android.synthetic.main.economy_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.countries.CountriesViewModel
import me.ahmednobi.fiypress.ui.library.LibraryViewModel
import me.ahmednobi.fiypress.utilities.init

class EconomyFragment : Fragment() {

    private  val viewModel: EconomyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.economy_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        economy_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            economy_webview.loadUrl(it)
        })
    }


}