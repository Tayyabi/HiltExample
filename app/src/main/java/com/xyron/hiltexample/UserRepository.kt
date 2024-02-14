package com.xyron.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "MYGOODCODE"

interface UserRepository {
    fun saveUserEmail(email: String, password: String)
}
class SQLRepository @Inject constructor(val loggerService: LoggerService) : UserRepository{

    override fun saveUserEmail(email: String, password: String){
        Log.d(TAG, "User saved in Db")
        loggerService.log("User saved in DB")
    }
}

class FirebaseRepository : UserRepository{

    override fun saveUserEmail(email: String, password: String){
        Log.d(TAG, "User saved in Firebase")
    }
}