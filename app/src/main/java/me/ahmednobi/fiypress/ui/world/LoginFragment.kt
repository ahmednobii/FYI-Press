package me.ahmednobi.fiypress.ui.world

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.technology_fragment.*
import me.ahmednobi.fiypress.R
import me.ahmednobi.fiypress.ui.technology.TechnologyViewModel
import me.ahmednobi.fiypress.utilities.init

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }
    private  val viewModel: LoginViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        login_webview.init(this.requireContext())
        viewModel.url.observe(viewLifecycleOwner, Observer {
            login_webview.loadUrl(it)
        })
    }
}