package com.example.retrofitproject1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitproject1.databinding.ProductListBinding

class ProductAdapter(private val products:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(val binding: ProductListBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product){
            Glide.with(binding.root.context)
                .load(product.image)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(binding.productImage)

            binding.productName.text = product.title
            binding.productPrice.text = "$${product.price}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }
}