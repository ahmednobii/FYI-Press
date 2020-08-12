package me.ahmednobi.fiypress.ui.technology

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.countries_fragment.*
import kotlinx.android.synthetic.main.technology_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.economy.EconomyViewModel
import me.ahmednobi.fiypress.utilities.init

class TechnologyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.technology_fragment, container, false)
    }

    private  val viewModel: TechnologyViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        technology_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            technology_webview.loadUrl(it)
        })
    }

}