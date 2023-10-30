package pl.ozodbek.clickscore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.Response
import pl.ozodbek.clickscore.data.Repository
import pl.ozodbek.clickscore.data.network.models.Odds
import pl.ozodbek.clickscore.utils.Resource
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {

    private val _scoresResponceLiveData = MutableLiveData<Resource<List<Response>>>()
    val scoresResponceLiveData: LiveData<Resource<List<Response>>> get() = _scoresResponceLiveData


    fun getScoreResponse() = viewModelScope.launch {
        _scoresResponceLiveData.postValue(Resource.Loading)
        val response = repository.remote.getScores()
        if (response is Resource.Success){
            _scoresResponceLiveData.postValue(response)
        }else{
            _scoresResponceLiveData.postValue(Resource.Failure(false, null, null))
        }
    }

}