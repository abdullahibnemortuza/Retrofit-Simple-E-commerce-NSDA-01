package com.example.retrofitproject1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitproject1.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    private lateinit var productViewModel: ProductViewModel
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productViewModel = ViewModelProvider(this)[ProductViewModel::class.java]
        productAdapter = ProductAdapter(emptyList())

        binding.refreshBtn.setOnClickListener {
            startActivity(Intent(this@ProductActivity,ProductActivity::class.java))
            finish()
        }
        binding.productRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.productRecyclerView.adapter = productAdapter

        productViewModel.product.observe(this, Observer { product ->
            product?.let {
                productAdapter = ProductAdapter(it)
                binding.productRecyclerView.adapter = productAdapter
            }
        })

    }
}