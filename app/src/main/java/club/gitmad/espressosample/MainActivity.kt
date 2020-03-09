package club.gitmad.espressosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello.setOnClickListener {
            val input = etName.text.toString()
            val result = processInput(input)
            tvResult.text = result
        }
    }

    fun processInput(input: String): String {
        return "Hello, $input!"
    }
}
