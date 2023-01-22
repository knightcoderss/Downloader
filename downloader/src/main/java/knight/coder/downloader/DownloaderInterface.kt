package knight.coder.downloader

interface DownloaderInterface {
    fun download(url: String, type: String): Long
}