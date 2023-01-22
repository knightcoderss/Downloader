package knight.coder.downloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val downloader = ImageDownloader(this)
        findViewById<Button>(R.id.download).setOnClickListener {
            downloader.downloadFile(
                url = "https://codility.com/media/train/1-TimeComplexity.pdf",
                type = "application/pdf"
            )
        }
    }
}