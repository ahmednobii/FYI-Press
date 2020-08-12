package me.ahmednobi.fiypress.ui.library

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.countries_fragment.*
import kotlinx.android.synthetic.main.library_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.economy.EconomyViewModel
import me.ahmednobi.fiypress.utilities.init

class LibraryFragment : Fragment() {

    companion object {
        fun newInstance() = LibraryFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.library_fragment, container, false)
    }

    private  val viewModel: LibraryViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        library_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            library_webview.loadUrl(it)
        })
    }
}