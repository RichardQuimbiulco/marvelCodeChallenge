package com.example.codechallenge.di

import android.app.Application
import com.example.codechallenge.data.di.ApiDataModule
import com.example.codechallenge.data.di.RepositoryModule
import com.example.codechallenge.framework.requestmanager.di.ApiModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, RepositoryModule::class, UseCaseModule::class, ApiDataModule::class])
interface CodeChallengeComponent {

    fun inject(module: CharacterListModule): CharacterListComponent
    fun inject(module: CharacterDetailModule): CharacterDetailComponent

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): CodeChallengeComponent
    }

}