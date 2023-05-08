package bakareritesh1729atgmail.com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var userName = findViewById<TextView>(R.id.userName)
        var displayResult = findViewById<TextView>(R.id.result)
        var finish  = findViewById<TextView>(R.id.finish)


        userName.text = intent.getStringExtra(constants.userName)

        var correct = intent.getIntExtra(constants.correctAns,0)
        var total = intent.getIntExtra(constants.totalQue,0)

        displayResult.text = "Your Score is $correct out of $total "


        finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }


}