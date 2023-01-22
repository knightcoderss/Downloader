package knight.coder.downloader

interface Downloader {
    fun downloadFile(url: String, type: String): Long
}