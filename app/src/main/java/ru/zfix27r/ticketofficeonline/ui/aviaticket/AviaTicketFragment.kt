package ru.zfix27r.ticketofficeonline.ui.aviaticket

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.zfix27r.ticketofficeonline.R
import ru.zfix27r.ticketofficeonline.databinding.ActivityMainBinding
import ru.zfix27r.ticketofficeonline.databinding.FragmentAviaTicketBinding

class AviaTicketFragment : Fragment() {

    private lateinit var binding: FragmentAviaTicketBinding

    companion object {
        fun newInstance() = AviaTicketFragment()
    }

    private val viewModel: AviaTicketViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAviaTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textInputEditTextAviaTicketOfficeFlightFlightTo.setOnClickListener {
            navToSearch()
        }
    }

    private fun navToSearch() {
        findNavController().navigate(R.id.action_aviaTicketFragment_to_searchFragment)
    }
}