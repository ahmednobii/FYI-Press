package me.ahmednobi.fiypress.ui.breakingnews

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.breaking_news_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.utilities.CustomWebViewClient
import me.ahmednobi.fiypress.utilities.JSInterface
import me.ahmednobi.fiypress.utilities.init

class BreakingNewsFragment : Fragment() {

  
    private  val viewModel: BreakingNewsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.breaking_news_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
breakingnews_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            breakingnews_webview.loadUrl(it)
        })
    }

}