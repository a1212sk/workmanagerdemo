package alexander.skornyakov.workmanagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        run_btn.setOnClickListener {
            val workRequest = OneTimeWorkRequestBuilder<MyWork>().build()
            WorkManager.getInstance(this).enqueue(workRequest)
        }
    }
}