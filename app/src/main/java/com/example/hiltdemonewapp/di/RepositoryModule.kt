package com.example.hiltdemonewapp.di

import com.example.hiltdemonewapp.data.repository.NoteRepositoryImpl
import com.example.hiltdemonewapp.features.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun providesNoteRepository(
        noteRepositoryImpl: NoteRepositoryImpl
    ): NoteRepository
}