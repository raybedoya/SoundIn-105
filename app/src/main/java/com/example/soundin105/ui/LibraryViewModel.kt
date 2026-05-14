package com.example.soundin105.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soundin105.ui.models.Playlist
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class LibraryViewModel : ViewModel() {
    private val _selectedTab = MutableStateFlow(value = 0)

    val selectedTab: StateFlow<Int> = _selectedTab.asStateFlow()

    val playlist: StateFlow<List<Playlist>> = PlaylistRepository.playlist

    val filteredPlaylist: StateFlow<List<Playlist>> = combine(PlaylistRepository.playlist, _selectedTab){
        playlist, tabIndex ->
        when (tabIndex){
            0 -> playlist
            1 -> playlist.filter {it.isFavorite}
            else -> playlist
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis =5000),
        initialValue = emptyList()
    )
}