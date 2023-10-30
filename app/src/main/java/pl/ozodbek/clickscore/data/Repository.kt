package pl.ozodbek.clickscore.data

import dagger.hilt.android.scopes.ViewModelScoped
import pl.ozodbek.clickscore.data.network.RemoteDataSource
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {
    val remote = remoteDataSource
}