package alexander.skornyakov.workmanagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        run_btn.setOnClickListener {
            val workRequest = PeriodicWorkRequestBuilder<MyWork>(15, TimeUnit.MINUTES)
                    .build()
            WorkManager.getInstance(this).enqueue(workRequest)

        }
    }
}