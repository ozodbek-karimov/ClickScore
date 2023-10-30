package pl.ozodbek.clickscore.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pl.ozodbek.clickscore.databinding.FragmentMainBinding
import pl.ozodbek.clickscore.utils.Resource
import pl.ozodbek.clickscore.viewmodels.MainFragmentViewModel
import kotlin.coroutines.CoroutineContext

@AndroidEntryPoint
class MainFragment : Fragment(),CoroutineScope {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)


        launch {
            viewModel.getScoreResponse()
            viewModel.scoresResponceLiveData.observe(viewLifecycleOwner){response->
                when(response){
                    is Resource.Failure -> {

                    }
                    Resource.Loading -> {

                    }
                    is Resource.Success -> {
                        binding.textView.text = response.value.toString()
                        Log.d("MY LOG", "openImageViewer: ${response.value} ")
                    }
                }
            }
        }



        return binding.root
    }


    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

}