val intent = Intent(this, SettingsActivity::class.java)
startActivity(intent)

// ----

val url = Uri.parse("https://ya.ru")
val intent = Intent(Intent.ACTION_VIEW, url)
startActivity(intent)
