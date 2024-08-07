package br.com.schuster.androidunittests.di

import android.app.Application
import androidx.room.Room
import br.com.schuster.androidunittests.data.local.NoteDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideNoteDb(application: Application): NoteDb {
        return Room.inMemoryDatabaseBuilder(
            application,
            NoteDb::class.java
        ).build()
    }
}























