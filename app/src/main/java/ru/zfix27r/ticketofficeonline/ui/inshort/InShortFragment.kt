package ru.zfix27r.ticketofficeonline.ui.inshort

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.zfix27r.ticketofficeonline.R

class InShortFragment : Fragment() {

    companion object {
        fun newInstance() = InShortFragment()
    }

    private val viewModel: InShortViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_in_short, container, false)
    }
}