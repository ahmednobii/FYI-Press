package me.ahmednobi.fiypress.ui.news

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.countries_fragment.*
import kotlinx.android.synthetic.main.news_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.economy.EconomyViewModel
import me.ahmednobi.fiypress.utilities.init

class NewsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_fragment, container, false)
    }

    private  val viewModel: NewsViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        news_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            news_webview.loadUrl(it)
        })
    }
}