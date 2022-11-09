package kr.ssu.dongyang.minn.kotlin_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import kr.ssu.dongyang.minn.kotlin_spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val singerArr = arrayOf("선택하세요", "아이브", "블랙핑크", "뉴진스", "크러쉬")
        val songArr = arrayOf("노래","After Like","Pink Venom","Attention", "Rush Hour")
        var adapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_dropdown_item, singerArr)
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                binding.textResult.text = songArr[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

    }
}