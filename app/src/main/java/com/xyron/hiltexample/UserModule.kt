package com.xyron.hiltexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

   /* @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository*/

    @Provides
    @Named("sql")
    fun providesUserRepository(): UserRepository {
        return FirebaseRepository()
    }

    @Provides
    @FirebaseQualifier
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

}