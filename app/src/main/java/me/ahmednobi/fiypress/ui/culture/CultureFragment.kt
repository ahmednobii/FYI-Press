package me.ahmednobi.fiypress.ui.culture

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.culture_fragment.*
import kotlinx.android.synthetic.main.home_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.library.LibraryViewModel
import me.ahmednobi.fiypress.utilities.init

class CultureFragment : Fragment() {
    private  val viewModel: CultureViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.culture_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        culture_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            culture_webview.loadUrl(it)
        })
    }
}