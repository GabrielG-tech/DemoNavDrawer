package br.edu.infnet.demonavdrawer

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MinhaContaFragment : Fragment() {

    companion object {
        fun newInstance() = MinhaContaFragment()
    }

    private lateinit var viewModel: MinhaContaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_minha_conta, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MinhaContaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}