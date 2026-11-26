<manifest ... >
    <application ... >
        <activity android:name=".MyActivity">
            ...
        </activity>
        <receiver android:name=".MyReceiver">
            ...
        </receiver>
        <service android:name=".MyService">
            ...
        </service>
        <provider android:name=".MyProvider">
            ...
        </provider>
    </application>
</manifest>

// ----

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }
