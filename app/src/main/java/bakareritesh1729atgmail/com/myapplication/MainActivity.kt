package bakareritesh1729atgmail.com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart : Button = findViewById(R.id.btnStart)
        val editText : EditText = findViewById(R.id.editTestId)

        buttonStart.setOnClickListener {
            if(editText.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter Name ",Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(constants.userName,editText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}