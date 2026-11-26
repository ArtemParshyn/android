class MainActivity : AppCompatActivity() {
    private val tag = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Мы в методе onPause")
    }
}

// ----

class MainActivity : AppCompatActivity() {
    private val tag = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Мы в методе onResume")
    }
}
