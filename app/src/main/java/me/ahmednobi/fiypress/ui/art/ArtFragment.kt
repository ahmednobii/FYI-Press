package me.ahmednobi.fiypress.ui.art

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.art_fragment.*
import kotlinx.android.synthetic.main.home_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.utilities.CustomWebViewClient
import me.ahmednobi.fiypress.utilities.JSInterface
import me.ahmednobi.fiypress.utilities.init

class ArtFragment : Fragment() {

    companion object {
        fun newInstance() = ArtFragment()
    }

    private  val viewModel: ArtViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.art_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
art_webview.init(this.requireContext())
        viewModel.artUrl.observe(viewLifecycleOwner, Observer {
            art_webview.loadUrl(it)
        })
    }


}