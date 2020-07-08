package alexander.skornyakov.workmanagerdemo

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyWork(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams){

    override fun doWork(): Result {
        CoroutineScope(Dispatchers.Default).launch {
            repeat(100){
                println("Hello from WorkerManager $it")
            }
        }
        return Result.success()
    }

}