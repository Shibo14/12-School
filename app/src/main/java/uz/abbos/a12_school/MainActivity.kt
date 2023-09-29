package uz.abbos.a12_school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import uz.abbos.a12_school.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigationView.setOnItemSelectedListener { i ->
            when (i.itemId) {
                R.id.home -> {
                    menuButton(HomeFragment())
                    true
                }

                R.id.news -> {
                    menuButton(NewFragment())
                    true
                }

                R.id.library -> {
                    menuButton(LibraryFragment())
                    true
                }

                R.id.rating -> {
                    menuButton(RatingFragment())
                    true
                }

                R.id.info -> {
                    menuButton(InfoFragment())
                    true
                }

                else -> false

            }

        }
        menuButton(HomeFragment())

    }

    private fun menuButton(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.fr_layout, fragment).commit()
    }
}