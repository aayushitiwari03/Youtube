package com.example.youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var view: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view= ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        replaceFragment(Home())

        view.navbar.setOnItemSelectedListener(){
            when(it.itemId) {
                R.id.home -> replaceFragment(Home())
                R.id.shorts -> replaceFragment(Shorts())
                R.id.add -> replaceFragment(Add())
                R.id.sub -> replaceFragment(Subscription())
                R.id.lib -> replaceFragment(LibraryFragment())
                else ->{
                }
            }
            true
        }

    }
    private fun replaceFragment(frag: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.Fram,frag)
        fragmentTransaction.commit()

    }
}
