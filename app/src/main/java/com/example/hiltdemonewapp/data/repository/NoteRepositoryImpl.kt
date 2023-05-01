package com.example.hiltdemonewapp.data.repository

import com.example.hiltdemonewapp.data.model.Note
import com.example.hiltdemonewapp.data.model.NoteResponse
import com.example.hiltdemonewapp.data.network.KtorService
import com.example.hiltdemonewapp.data.network.RetrofitService
import com.example.hiltdemonewapp.features.domain.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val apiService: KtorService,
    private val retrofitService: RetrofitService
) : NoteRepository {


    override suspend fun addNote(note: Note): Flow<NoteResponse> = flow {
        emit(retrofitService.addNotes(note))
    }.flowOn(Dispatchers.IO)

    override suspend fun getNotes(): Flow<List<NoteResponse>> = flow {
        emit(retrofitService.getNotes())
    }.flowOn(Dispatchers.IO)

    override suspend fun deleteNote(id: Int): Flow<NoteResponse> = flow {
        emit(retrofitService.deleteNote(id))
    }.flowOn(Dispatchers.IO)

    override suspend fun updateNote(id: Int, note: Note): Flow<NoteResponse> = flow {
        emit(retrofitService.updateNote(id, note))
    }.flowOn(Dispatchers.IO)


}