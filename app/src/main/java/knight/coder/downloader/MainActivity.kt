package knight.coder.downloader

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val downloader = Downloader(this)
        findViewById<Button>(R.id.download).setOnClickListener {
            downloader.download(
                url = "https://codility.com/media/train/1-TimeComplexity.pdf",
                type = "application/pdf"
            )
        }
    }
}