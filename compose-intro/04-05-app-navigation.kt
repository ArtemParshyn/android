<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.example.androidiscool">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.AndroidIsCool"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

// ----

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(modifier = Modifier.background(Color.Gray)) {
                    Button(onClick = {}, content = {
                        Text(stringResource(R.string.display))
                    })
                    Button(onClick = {}, content = {
                        Text(stringResource(R.string.share))
                    })
                }
            }
        }
    }
}

// ----

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.example.androidiscool">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.AndroidIsCool"
        tools:targetApi="31">
        <activity
            android:name=".MessageActivity"
            android:exported="false" />
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

// ----

Box(
    modifier = Modifier
        .fillMaxSize(),
    contentAlignment = Alignment.Center
) {
    Text("Привет, Android разработка — это круто!")
}

// ----

Button(onClick = {
    val displayIntent = Intent(this@MainActivity, MessageActivity::class.java)
    startActivity(displayIntent)
}, content = {
    Text(stringResource(R.string.display))
})

// ----

val displayIntent = Intent(this@MainActivity, MessageActivity::class.java)
startActivity(displayIntent)

// ----

Button(onClick = {
    val message = "Привет, Android разработка — это круто!"
    val shareIntent = Intent(Intent.ACTION_SENDTO)
    shareIntent.data = Uri.parse("mailto:")
    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("yourEmail@ya.ru"))
    shareIntent.putExtra(Intent.EXTRA_TEXT, message)
    startActivity(shareIntent)
}, content = {
    Text(stringResource(R.string.share))
})
