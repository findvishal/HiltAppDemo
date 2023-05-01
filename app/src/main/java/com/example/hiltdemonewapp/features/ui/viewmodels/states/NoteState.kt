package com.example.hiltdemonewapp.features.ui.viewmodels.states

import com.example.hiltdemonewapp.data.model.NoteResponse

data class NoteState(
    val data:List<NoteResponse> = emptyList(),
    val error:String = "",
    val isLoading:Boolean = false
)